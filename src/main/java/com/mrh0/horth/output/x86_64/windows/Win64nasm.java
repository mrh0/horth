package com.mrh0.horth.output.x86_64.windows;

import com.mrh0.horth.ast.Loc;
import com.mrh0.horth.exceptions.HorthException;
import com.mrh0.horth.output.instructions.high.CompileData;
import com.mrh0.horth.exceptions.compile.CompileException;
import com.mrh0.horth.output.Arch;
import com.mrh0.horth.output.instructions.high.HighInst;
import com.mrh0.horth.output.x86_64.windows.nasm.InstructionBuilder;
import com.mrh0.horth.output.x86_64.windows.nasm.LowInst;
import com.mrh0.horth.util.IO;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Win64nasm extends Arch {

    public static final Map<String, SysCall> syscalls = new HashMap<>();

    public Win64nasm() {

    }

    @Override
    public String getName() {
        return "win64nasm";
    }

    @Override
    public StringBuilder compile(CompileData compileData, List<HighInst> HLIR) throws CompileException {
        StringBuilder sb = new StringBuilder();
        InstructionBuilder ib = new InstructionBuilder(sb);

        ib      .inst("global").reg("main")
                .inst("section .bss")
                .label("init_stack").append(" resq 1")
                .label(LowInst.LS).append("    resb 16 * 1024")
                .label("local_temp_rsp").append("  resq 1")
                .inst("section").reg(".text")
                .label("main")
                .inst("mov").vreg("init_stack", 0).reg("rsp")
                .inst("mov").reg(LowInst.LSP).reg(LowInst.LS);

        Win64nasmIT it = new Win64nasmIT();

        List<LowInst> LLIR = new ArrayList<>();
        for(HighInst hi : HLIR)
            it.transform(LLIR, hi);

        StringBuilder lisb = new StringBuilder();
        for(LowInst li : LLIR)
            lisb.append(li.getClass().getSimpleName() + ", ");
        System.out.println(lisb.toString());

        //List<LowInst> optimizedLLIR = Optimizer.optimize(LLIR);

        //System.out.println("Optimized:\n" + optimizedLLIR);

        for(LowInst li : /*optimized*/LLIR)
            li.asm(ib, compileData);

        sb.append('\n');
        return sb;
    }

    @Override
    public SysCall getSysCallByName(String name) throws HorthException {
        return syscalls.get(name);
    }

    public static void nasmCompile(String inputFilePath, String outputFilePath) throws IOException, URISyntaxException {
        var in = IO.getFile(inputFilePath);
        var out = IO.getFile(outputFilePath);

        Runtime rt = Runtime.getRuntime();
        var command = "nasm " + in.getAbsolutePath() + " -felf64 -o " + out.getAbsolutePath();
        System.out.println("EXEC: '" + command + "'");
        Process nasmProcess = rt.exec(command);
        try {
            nasmProcess.waitFor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("NASM finished with exit code " + nasmProcess.exitValue());

        /*command = out.getAbsolutePath();
        System.out.println("EXEC: '" + command + "'");
        Process runProcess = rt.exec(command);
        try {
            runProcess.waitFor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("PROGRAM finished with exit code " + runProcess.exitValue());*/
    }

    private static void regSyscall(int call, int args, String name) {
        syscalls.put(name, new SysCall(call, args));
    }

    static {
        regSyscall(  0, 2, "io_setup");
        regSyscall(  1, 1, "io_destroy");
        regSyscall(  2, 3, "io_submit");
        regSyscall(  3, 3, "io_cancel");
        regSyscall(  4, 5, "io_getevents_time64");
        regSyscall(  5, 5, "setxattr");
        regSyscall(  6, 5, "setxattr");
        regSyscall(  7, 5, "fsetxattr");
        regSyscall(  8, 4, "getxattr");
        regSyscall(  9, 4, "getxattr");
        regSyscall( 10, 4, "fgetxattr");
        regSyscall( 11, 3, "listxattr");
        regSyscall( 12, 3, "listxattr");
        regSyscall( 13, 3, "flistxattr");
        regSyscall( 14, 2, "removexattr");
        regSyscall( 15, 2, "removexattr");
        regSyscall( 16, 2, "fremovexattr");
        regSyscall( 17, 2, "getcwd");
        regSyscall( 18, 3, "lookup_dcookie");
        regSyscall( 19, 2, "eventfd2");
        regSyscall( 20, 1, "epoll_create1");
        regSyscall( 21, 4, "epoll_ctl");
        regSyscall( 22, 6, "epoll_pwait");
        regSyscall( 23, 1, "dup");
        regSyscall( 24, 3, "dup3");
        regSyscall( 25, 3, "fcntl");
        regSyscall( 26, 1, "inotify_init1");
        regSyscall( 27, 3, "inotify_add_watch");
        regSyscall( 28, 2, "inotify_rm_watch");
        regSyscall( 29, 3, "ioctl");
        regSyscall( 30, 3, "ioprio_set");
        regSyscall( 31, 2, "ioprio_get");
        regSyscall( 32, 2, "flock");
        regSyscall( 33, 4, "mknodat");
        regSyscall( 34, 3, "mkdirat");
        regSyscall( 35, 3, "unlinkat");
        regSyscall( 36, 3, "symlinkat");
        regSyscall( 37, 5, "linkat");
        regSyscall( 38, 4, "renameat");
        regSyscall( 39, 2, "umount2");
        regSyscall( 40, 5, "mount");
        regSyscall( 41, 2, "pivotroot");
        regSyscall( 42, 3, "nfsservctl");
        regSyscall( 43, 2, "statfs");
        regSyscall( 44, 2, "fstatfs");
        regSyscall( 45, 2, "truncate");
        regSyscall( 46, 2, "ftruncate");
        regSyscall( 47, 4, "fallocate");
        regSyscall( 48, 3, "faccessat");
        regSyscall( 49, 1, "chdir");
        regSyscall( 50, 1, "fchdir");
        regSyscall( 51, 1, "chroot");
        regSyscall( 52, 2, "fchmod");
        regSyscall( 53, 3, "fchmodat");
        regSyscall( 54, 5, "fchownat");
        regSyscall( 55, 3, "fchown");
        regSyscall( 56, 4, "openat");
        regSyscall( 57, 1, "close");
        regSyscall( 58, 0, "vhangup");
        regSyscall( 59, 2, "pipe2");
        regSyscall( 60, 4, "quotactl");
        regSyscall( 61, 3, "getdents64");
        regSyscall( 62, 3, "lseek");
        regSyscall( 63, 3, "read");
        regSyscall( 64, 3, "write");
        regSyscall( 65, 3, "readv");
        regSyscall( 66, 3, "writev");
        regSyscall( 67, 4, "pread");
        regSyscall( 68, 4, "pwrite");
        regSyscall( 69, 4, "preadv");
        regSyscall( 70, 4, "pwritev");
        regSyscall( 71, 4, "sendfile64");
        regSyscall( 72, 6, "pselect6_time64");
        regSyscall( 73, 5, "ppoll_time64");
        regSyscall( 74, 4, "signalfd4");
        regSyscall( 75, 4, "vmsplice");
        regSyscall( 76, 6, "splice");
        regSyscall( 77, 4, "tee");
        regSyscall( 78, 4, "readlinkat");
        regSyscall( 79, 4, "newfstatat");
        regSyscall( 80, 2, "fstat");
        regSyscall( 81, 0, "sync");
        regSyscall( 82, 1, "fsync");
        regSyscall( 83, 1, "fdatasync");
        regSyscall( 84, 4, "sync_file_range");
        regSyscall( 85, 2, "timerfd_create");
        regSyscall( 86, 4, "timerfd_settime64");
        regSyscall( 87, 2, "timerfd_gettime64");
        regSyscall( 88, 4, "utimensat_time64");
        regSyscall( 89, 1, "acct");
        regSyscall( 90, 2, "capget");
        regSyscall( 91, 2, "capset");
        regSyscall( 92, 1, "personality");
        regSyscall( 93, 1, "exit");
        regSyscall( 94, 1, "exit");
        regSyscall( 95, 5, "waitid");
        regSyscall( 96, 1, "set_tid_address");
        regSyscall( 97, 1, "unshare");
        regSyscall( 98, 6, "futex_time64");
        regSyscall( 99, 2, "set_robust_list");
        regSyscall(100, 3, "get_robust_list");
        regSyscall(101, 2, "nanosleep_time64");
        regSyscall(102, 2, "getitimer");
        regSyscall(103, 3, "setitimer");
        regSyscall(104, 4, "kexec_load");
        regSyscall(105, 3, "init_module");
        regSyscall(106, 2, "delete_module");
        regSyscall(107, 3, "timer_create");
        regSyscall(108, 2, "timer_gettime64");
        regSyscall(109, 1, "timer_getoverrun");
        regSyscall(110, 4, "timer_settime64");
        regSyscall(111, 1, "timer_delete");
        regSyscall(112, 2, "clock_settime64");
        regSyscall(113, 2, "clock_gettime64");
        regSyscall(114, 2, "clock_getres_time64");
        regSyscall(115, 4, "clock_nanosleep_time64");
        regSyscall(116, 3, "syslog");
        regSyscall(117, 4, "ptrace");
        regSyscall(118, 2, "sched_setparam");
        regSyscall(119, 3, "sched_setscheduler");
        regSyscall(120, 1, "sched_getscheduler");
        regSyscall(121, 2, "sched_getparam");
        regSyscall(122, 3, "sched_setaffinity");
        regSyscall(123, 3, "sched_getaffinity");
        regSyscall(124, 0, "sched_yield");
        regSyscall(125, 1, "sched_get_priority_max");
        regSyscall(126, 1, "sched_get_priority_min");
        regSyscall(127, 2, "sched_rr_get_interval_time64");
        regSyscall(128, 0, "restart_syscall");
        regSyscall(129, 2, "kill");
        regSyscall(130, 2, "tkill");
        regSyscall(131, 3, "tgkill");
        regSyscall(132, 2, "sigaltstack");
        regSyscall(133, 2, "rt_sigsuspend");
        regSyscall(134, 4, "rt_sigaction");
        regSyscall(135, 4, "rt_sigprocmask");
        regSyscall(136, 2, "rt_sigpending");
        regSyscall(137, 4, "rt_sigtimedwait_time64");
        regSyscall(138, 3, "rt_sigqueueinfo");
        regSyscall(139, 0, "rt_sigreturn");
        regSyscall(140, 3, "setpriority");
        regSyscall(141, 2, "getpriority");
        regSyscall(142, 4, "reboot");
        regSyscall(143, 2, "setregid");
        regSyscall(144, 1, "setgid");
        regSyscall(145, 2, "setreuid");
        regSyscall(146, 1, "setuid");
        regSyscall(147, 3, "setresuid");
        regSyscall(148, 3, "getresuid");
        regSyscall(149, 3, "setresgid");
        regSyscall(150, 3, "getresgid");
        regSyscall(151, 1, "setfsuid");
        regSyscall(152, 1, "setfsgid");
        regSyscall(153, 1, "times");
        regSyscall(154, 2, "setpgid");
        regSyscall(155, 1, "getpgid");
        regSyscall(156, 1, "getsid");
        regSyscall(157, 0, "setsid");
        regSyscall(158, 2, "getgroups");
        regSyscall(159, 2, "setgroups");
        regSyscall(160, 1, "uname");
        regSyscall(161, 2, "sethostname");
        regSyscall(162, 2, "setdomainname");
        regSyscall(163, 2, "getrlimit");
        regSyscall(164, 2, "setrlimit");
        regSyscall(165, 2, "getrusage");
        regSyscall(166, 1, "umask");
        regSyscall(167, 5, "prctl");
        regSyscall(168, 3, "getcpu");
        regSyscall(169, 2, "gettimeofday");
        regSyscall(170, 2, "settimeofday");
        regSyscall(171, 1, "adjtimex64");
        regSyscall(172, 0, "getpid");
        regSyscall(173, 0, "getppid");
        regSyscall(174, 0, "getuid");
        regSyscall(175, 0, "geteuid");
        regSyscall(176, 0, "getgid");
        regSyscall(177, 0, "getegid");
        regSyscall(178, 0, "gettid");
        regSyscall(179, 1, "sysinfo");
        regSyscall(180, 4, "mq_open");
        regSyscall(181, 1, "mq_unlink");
        regSyscall(182, 5, "mq_timedsend_time64");
        regSyscall(183, 5, "mq_timedreceive_time64");
        regSyscall(184, 2, "mq_notify");
        regSyscall(185, 3, "mq_getsetattr");
        regSyscall(186, 2, "msgget");
        regSyscall(187, 3, "msgctl");
        regSyscall(188, 5, "msgrcv");
        regSyscall(189, 4, "msgsnd");
        regSyscall(190, 3, "semget");
        regSyscall(191, 4, "semctl");
        regSyscall(192, 4, "semtimedop_time64");
        regSyscall(193, 3, "semop");
        regSyscall(194, 3, "shmget");
        regSyscall(195, 3, "shmctl");
        regSyscall(196, 3, "shmat");
        regSyscall(197, 1, "shmdt");
        regSyscall(198, 3, "socket");
        regSyscall(199, 4, "socketpair");
        regSyscall(200, 3, "bind");
        regSyscall(201, 2, "listen");
        regSyscall(202, 3, "accept");
        regSyscall(203, 3, "connect");
        regSyscall(204, 3, "getsockname");
        regSyscall(205, 3, "getpeername");
        regSyscall(206, 6, "sendto");
        regSyscall(207, 6, "recvfrom");
        regSyscall(208, 5, "setsockopt");
        regSyscall(209, 5, "getsockopt");
        regSyscall(210, 2, "shutdown");
        regSyscall(211, 3, "sendmsg");
        regSyscall(212, 3, "recvmsg");
        regSyscall(213, 3, "readahead");
        regSyscall(214, 1, "brk");
        regSyscall(215, 2, "munmap");
        regSyscall(216, 5, "mremap");
        regSyscall(217, 5, "add_key");
        regSyscall(218, 4, "request_key");
        regSyscall(219, 5, "keyctl");
        regSyscall(220, 5, "clone");
        regSyscall(221, 3, "execve");
        regSyscall(222, 6, "mmap");
        regSyscall(223, 4, "fadvise64");
        regSyscall(224, 2, "swapon");
        regSyscall(225, 1, "swapoff");
        regSyscall(226, 3, "mprotect");
        regSyscall(227, 3, "msync");
        regSyscall(228, 2, "mlock");
        regSyscall(229, 2, "munlock");
        regSyscall(230, 1, "mlockall");
        regSyscall(231, 0, "munlockall");
        regSyscall(232, 3, "mincore");
        regSyscall(233, 3, "madvise");
        regSyscall(234, 5, "remap_file_pages");
        regSyscall(235, 6, "mbind");
        regSyscall(236, 5, "get_mempolicy");
        regSyscall(237, 3, "set_mempolicy");
        regSyscall(238, 4, "migrate_pages");
        regSyscall(239, 6, "move_pages");
        regSyscall(240, 4, "rt_tgsigqueueinfo");
        regSyscall(241, 5, "perf_event_open");
        regSyscall(242, 4, "accept4");
        regSyscall(243, 5, "recvmmsg_time64");
        regSyscall(260, 4, "wait4");
        regSyscall(261, 4, "prlimit64");
        regSyscall(262, 2, "fanotify_init");
        regSyscall(263, 5, "fanotify_mark");
        regSyscall(264, 5, "name_to_handle_at");
        regSyscall(265, 3, "open_by_handle_at");
        regSyscall(266, 2, "clock_adjtime64");
        regSyscall(267, 1, "syncfs");
        regSyscall(268, 2, "setns");
        regSyscall(269, 4, "sendmmsg");
        regSyscall(270, 6, "process_vm_readv");
        regSyscall(271, 6, "process_vm_writev");
        regSyscall(272, 5, "kcmp");
        regSyscall(273, 3, "finit_module");
        regSyscall(274, 3, "sched_setattr");
        regSyscall(275, 4, "sched_getattr");
        regSyscall(276, 5, "renameat2");
        regSyscall(277, 3, "seccomp");
        regSyscall(278, 3, "getrandom");
        regSyscall(279, 2, "memfd_create");
        regSyscall(280, 3, "bpf");
        regSyscall(281, 5, "execveat");
        regSyscall(282, 1, "userfaultfd");
        regSyscall(283, 3, "membarrier");
        regSyscall(284, 3, "mlock2");
        regSyscall(285, 6, "copy_file_range");
        regSyscall(286, 6, "preadv2");
        regSyscall(287, 6, "pwritev2");
        regSyscall(288, 4, "pkey_mprotect");
        regSyscall(289, 2, "pkey_alloc");
        regSyscall(290, 1, "pkey_free");
        regSyscall(291, 5, "statx");
        regSyscall(292, 6, "io_pgetevents_time64");
        regSyscall(293, 4, "rseq");
        regSyscall(294, 5, "kexec_file_load");
    }
}
