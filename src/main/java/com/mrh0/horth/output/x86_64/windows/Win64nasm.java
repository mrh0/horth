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
        for(LowInst li : LLIR) {
            li.collect(compileData);
        }

        StringBuilder sb = new StringBuilder();
        InstructionBuilder ib = new InstructionBuilder(sb);

        ib      .inst("global").reg("main")
                .inst("section .bss")
                .label("init_stack").append(" resq 1")
                .label(LowInst.LS).append("    resb 16 * 1024")
                .label("local_temp_rsp").append("  resq 1");

        ib      .inst("section").reg(".data");
        for(int i = 0; i < compileData.strings.size(); i++)
            ib.dbString(i, compileData.strings.get(i));

        ib      .inst("section").reg(".text")
                .label("main")
                .inst("mov").vreg("init_stack", 0).reg("rsp")
                .inst("mov").reg(LowInst.LSP).reg(LowInst.LS);

        for(LowInst li : LLIR)
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

    private static void regSysCall(int call, int args, String name) {
        syscalls.put(name, new SysCall(call, args));
    }

    static {
        regSysCall(0,   3, "read");
        regSysCall(1,   3, "write");
        regSysCall(2,   3, "open");
        regSysCall(3,   1, "close");
        regSysCall(4,   2, "stat");
        regSysCall(5,   2, "fstat");
        regSysCall(6,   2, "lstat");
        regSysCall(7,   3, "poll");
        regSysCall(8,   3, "lseek");
        regSysCall(9,   6, "mmap");
        regSysCall(10,  3, "mprotect");
        regSysCall(11,  2, "munmap");
        regSysCall(12,  1, "brk");
        regSysCall(13,  4, "rt_sigaction");
        regSysCall(14,  4, "rt_sigprocmask");
        regSysCall(15,  0, "rt_sigreturn");
        regSysCall(16,  3, "ioctl");
        regSysCall(17,  4, "pread64");
        regSysCall(18,  4, "pwrite64");
        regSysCall(19,  3, "readv");
        regSysCall(20,  3, "writev");
        regSysCall(21,  2, "access");
        regSysCall(22,  1, "pipe");
        regSysCall(23,  5, "select");
        regSysCall(24,  0, "sched_yield");
        regSysCall(25,  5, "mremap");
        regSysCall(26,  3, "msync");
        regSysCall(27,  3, "mincore");
        regSysCall(28,  3, "madvise");
        regSysCall(29,  3, "shmget");
        regSysCall(30,  3, "shmat");
        regSysCall(31,  3, "shmctl");
        regSysCall(32,  1, "dup");
        regSysCall(33,  2, "dup2");
        regSysCall(34,  0, "pause");
        regSysCall(35,  2, "nanosleep");
        regSysCall(36,  2, "getitimer");
        regSysCall(37,  1, "alarm");
        regSysCall(38,  3, "setitimer");
        regSysCall(39,  0, "getpid");
        regSysCall(40,  4, "sendfile");
        regSysCall(41,  3, "socket");
        regSysCall(42,  3, "connect");
        regSysCall(43,  3, "accept");
        regSysCall(44,  6, "sendto");
        regSysCall(45,  6, "recvfrom");
        regSysCall(46,  3, "sendmsg");
        regSysCall(47,  3, "recvmsg");
        regSysCall(48,  2, "shutdown");
        regSysCall(49,  3, "bind");
        regSysCall(50,  2, "listen");
        regSysCall(51,  3, "getsockname");
        regSysCall(52,  3, "getpeername");
        regSysCall(53,  4, "socketpair");
        regSysCall(54,  5, "setsockopt");
        regSysCall(55,  5, "getsockopt");
        regSysCall(56,  5, "clone");
        regSysCall(57,  0, "fork");
        regSysCall(58,  0, "vfork");
        regSysCall(59,  3, "execve");
        regSysCall(60,  1, "exit");
        regSysCall(61,  4, "wait4");
        regSysCall(62,  2, "kill");
        regSysCall(63,  1, "uname");
        regSysCall(64,  3, "semget");
        regSysCall(65,  3, "semop");
        regSysCall(66,  4, "semctl");
        regSysCall(67,  1, "shmdt");
        regSysCall(68,  2, "msgget");
        regSysCall(69,  4, "msgsnd");
        regSysCall(70,  5, "msgrcv");
        regSysCall(71,  3, "msgctl");
        regSysCall(72,  3, "fcntl");
        regSysCall(73,  2, "flock");
        regSysCall(74,  1, "fsync");
        regSysCall(75,  1, "fdatasync");
        regSysCall(76,  2, "truncate");
        regSysCall(77,  2, "ftruncate");
        regSysCall(78,  3, "getdents");
        regSysCall(79,  2, "getcwd");
        regSysCall(80,  1, "chdir");
        regSysCall(81,  1, "fchdir");
        regSysCall(82,  2, "rename");
        regSysCall(83,  2, "mkdir");
        regSysCall(84,  1, "rmdir");
        regSysCall(85,  2, "creat");
        regSysCall(86,  2, "link");
        regSysCall(87,  1, "unlink");
        regSysCall(88,  2, "symlink");
        regSysCall(89,  3, "readlink");
        regSysCall(90,  2, "chmod");
        regSysCall(91,  2, "fchmod");
        regSysCall(92,  3, "chown");
        regSysCall(93,  3, "fchown");
        regSysCall(94,  3, "lchown");
        regSysCall(95,  1, "umask");
        regSysCall(96,  2, "gettimeofday");
        regSysCall(97,  2, "getrlimit");
        regSysCall(98,  2, "getrusage");
        regSysCall(99,  1, "sysinfo");
        regSysCall(100, 1, "times");
        regSysCall(101, 4, "ptrace");
        regSysCall(102, 0, "getuid");
        regSysCall(103, 3, "syslog");
        regSysCall(104, 0, "getgid");
        regSysCall(105, 1, "setuid");
        regSysCall(106, 1, "setgid");
        regSysCall(107, 0, "geteuid");
        regSysCall(108, 0, "getegid");
        regSysCall(109, 2, "setpgid");
        regSysCall(110, 0, "getppid");
        regSysCall(111, 0, "getpgrp");
        regSysCall(112, 0, "setsid");
        regSysCall(113, 2, "setreuid");
        regSysCall(114, 2, "setregid");
        regSysCall(115, 2, "getgroups");
        regSysCall(116, 2, "setgroups");
        regSysCall(117, 3, "setresuid");
        regSysCall(118, 3, "getresuid");
        regSysCall(119, 3, "setresgid");
        regSysCall(120, 3, "getresgid");
        regSysCall(121, 1, "getpgid");
        regSysCall(122, 1, "setfsuid");
        regSysCall(123, 1, "setfsgid");
        regSysCall(124, 1, "getsid");
        regSysCall(125, 2, "capget");
        regSysCall(126, 2, "capset");
        regSysCall(127, 2, "rt_sigpending");
        regSysCall(128, 4, "rt_sigtimedwait");
        regSysCall(129, 3, "rt_sigqueueinfo");
        regSysCall(130, 2, "rt_sigsuspend");
        regSysCall(131, 2, "sigaltstack");
        regSysCall(132, 2, "utime");
        regSysCall(133, 3, "mknod");
        regSysCall(134, 1, "uselib");
        regSysCall(135, 1, "personality");
        regSysCall(136, 2, "ustat");
        regSysCall(137, 2, "statfs");
        regSysCall(138, 2, "fstatfs");
        regSysCall(139, 3, "sysfs");
        regSysCall(140, 2, "getpriority");
        regSysCall(141, 3, "setpriority");
        regSysCall(142, 2, "sched_setparam");
        regSysCall(143, 2, "sched_getparam");
        regSysCall(144, 3, "sched_setscheduler");
        regSysCall(145, 1, "sched_getscheduler");
        regSysCall(146, 1, "sched_get_priority_max");
        regSysCall(147, 1, "sched_get_priority_min");
        regSysCall(148, 2, "sched_rr_get_interval");
        regSysCall(149, 2, "mlock");
        regSysCall(150, 2, "munlock");
        regSysCall(151, 1, "mlockall");
        regSysCall(152, 0, "munlockall");
        regSysCall(153, 0, "vhangup");
        regSysCall(154, 3, "modify_ldt");
        regSysCall(155, 2, "pivot_root");
        regSysCall(156, 1, "_sysctl");
        regSysCall(157, 5, "prctl");
        regSysCall(158, 2, "arch_prctl");
        regSysCall(159, 1, "adjtimex");
        regSysCall(160, 2, "setrlimit");
        regSysCall(161, 1, "chroot");
        regSysCall(162, 0, "sync");
        regSysCall(163, 1, "acct");
        regSysCall(164, 2, "settimeofday");
        regSysCall(165, 5, "mount");
        regSysCall(166, 2, "umount2");
        regSysCall(167, 2, "swapon");
        regSysCall(168, 1, "swapoff");
        regSysCall(169, 4, "reboot");
        regSysCall(170, 2, "sethostname");
        regSysCall(171, 2, "setdomainname");
        regSysCall(172, 1, "iopl");
        regSysCall(173, 3, "ioperm");
        regSysCall(174, 2, "create_module");
        regSysCall(175, 3, "init_module");
        regSysCall(176, 2, "delete_module");
        regSysCall(177, 1, "get_kernel_syms");
        regSysCall(178, 5, "query_module");
        regSysCall(179, 4, "quotactl");
        regSysCall(180, 3, "nfsservctl");
        regSysCall(181, 5, "getpmsg");
        regSysCall(182, 5, "putpmsg");
        regSysCall(183, 5, "afs_syscall");
        regSysCall(184, 3, "tuxcall");
        regSysCall(185, 3, "security");
        regSysCall(186, 0, "gettid");
        regSysCall(187, 3, "readahead");
        regSysCall(188, 5, "setxattr");
        regSysCall(189, 5, "lsetxattr");
        regSysCall(190, 5, "fsetxattr");
        regSysCall(191, 4, "getxattr");
        regSysCall(192, 4, "lgetxattr");
        regSysCall(193, 4, "fgetxattr");
        regSysCall(194, 3, "listxattr");
        regSysCall(195, 3, "llistxattr");
        regSysCall(196, 3, "flistxattr");
        regSysCall(197, 2, "removexattr");
        regSysCall(198, 2, "lremovexattr");
        regSysCall(199, 2, "fremovexattr");
        regSysCall(200, 2, "tkill");
        regSysCall(201, 1, "time");
        regSysCall(202, 6, "futex");
        regSysCall(203, 3, "sched_setaffinity");
        regSysCall(204, 3, "sched_getaffinity");
        regSysCall(205, 1, "set_thread_area");
        regSysCall(206, 2, "io_setup");
        regSysCall(207, 1, "io_destroy");
        regSysCall(208, 5, "io_getevents");
        regSysCall(209, 3, "io_submit");
        regSysCall(210, 3, "io_cancel");
        regSysCall(211, 1, "get_thread_area");
        regSysCall(212, 3, "lookup_dcookie");
        regSysCall(213, 1, "epoll_create");
        regSysCall(214, 4, "epoll_ctl_old");
        regSysCall(215, 4, "epoll_wait_old");
        regSysCall(216, 5, "remap_file_pages");
        regSysCall(217, 3, "getdents64");
        regSysCall(218, 1, "set_tid_address");
        regSysCall(219, 0, "restart_syscall");
        regSysCall(220, 4, "semtimedop");
        regSysCall(221, 4, "fadvise64");
        regSysCall(222, 3, "timer_create");
        regSysCall(223, 4, "timer_settime");
        regSysCall(224, 2, "timer_gettime");
        regSysCall(225, 1, "timer_getoverrun");
        regSysCall(226, 1, "timer_delete");
        regSysCall(227, 2, "clock_settime");
        regSysCall(228, 2, "clock_gettime");
        regSysCall(229, 2, "clock_getres");
        regSysCall(230, 4, "clock_nanosleep");
        regSysCall(231, 1, "exit_group");
        regSysCall(232, 4, "epoll_wait");
        regSysCall(233, 4, "epoll_ctl");
        regSysCall(234, 3, "tgkill");
        regSysCall(235, 2, "utimes");
        regSysCall(236, 5, "vserver");
        regSysCall(237, 6, "mbind");
        regSysCall(238, 3, "set_mempolicy");
        regSysCall(239, 5, "get_mempolicy");
        regSysCall(240, 4, "mq_open");
        regSysCall(241, 1, "mq_unlink");
        regSysCall(242, 5, "mq_timedsend");
        regSysCall(243, 5, "mq_timedreceive");
        regSysCall(244, 2, "mq_notify");
        regSysCall(245, 3, "mq_getsetattr");
        regSysCall(246, 4, "kexec_load");
        regSysCall(247, 5, "waitid");
        regSysCall(248, 5, "add_key");
        regSysCall(249, 4, "request_key");
        regSysCall(250, 5, "keyctl");
        regSysCall(251, 3, "ioprio_set");
        regSysCall(252, 2, "ioprio_get");
        regSysCall(253, 0, "inotify_init");
        regSysCall(254, 3, "inotify_add_watch");
        regSysCall(255, 2, "inotify_rm_watch");
        regSysCall(256, 4, "migrate_pages");
        regSysCall(257, 4, "openat");
        regSysCall(258, 3, "mkdirat");
        regSysCall(259, 4, "mknodat");
        regSysCall(260, 5, "fchownat");
        regSysCall(261, 3, "futimesat");
        regSysCall(262, 4, "newfstatat");
        regSysCall(263, 3, "unlinkat");
        regSysCall(264, 4, "renameat");
        regSysCall(265, 5, "linkat");
        regSysCall(266, 3, "symlinkat");
        regSysCall(267, 4, "readlinkat");
        regSysCall(268, 3, "fchmodat");
        regSysCall(269, 3, "faccessat");
        regSysCall(270, 6, "pselect6");
        regSysCall(271, 5, "ppoll");
        regSysCall(272, 1, "unshare");
        regSysCall(273, 2, "set_robust_list");
        regSysCall(274, 3, "get_robust_list");
        regSysCall(275, 6, "splice");
        regSysCall(276, 4, "tee");
        regSysCall(277, 4, "sync_file_range");
        regSysCall(278, 4, "vmsplice");
        regSysCall(279, 6, "move_pages");
        regSysCall(280, 4, "utimensat");
        regSysCall(281, 6, "epoll_pwait");
        regSysCall(282, 3, "signalfd");
        regSysCall(283, 2, "timerfd_create");
        regSysCall(284, 1, "eventfd");
        regSysCall(285, 4, "fallocate");
        regSysCall(286, 4, "timerfd_settime");
        regSysCall(287, 2, "timerfd_gettime");
        regSysCall(288, 4, "accept4");
        regSysCall(289, 4, "signalfd4");
        regSysCall(290, 2, "eventfd2");
        regSysCall(291, 1, "epoll_create1");
        regSysCall(292, 3, "dup3");
        regSysCall(293, 2, "pipe2");
        regSysCall(294, 1, "inotify_init1");
        regSysCall(295, 4, "preadv");
        regSysCall(296, 4, "pwritev");
        regSysCall(297, 4, "rt_tgsigqueueinfo");
        regSysCall(298, 5, "perf_event_open");
        regSysCall(299, 5, "recvmmsg");
        regSysCall(300, 2, "fanotify_init");
        regSysCall(301, 5, "fanotify_mark");
        regSysCall(302, 4, "prlimit64");
        regSysCall(303, 5, "name_to_handle_at");
        regSysCall(304, 3, "open_by_handle_at");
        regSysCall(305, 2, "clock_adjtime");
        regSysCall(306, 1, "syncfs");
        regSysCall(307, 4, "sendmmsg");
        regSysCall(308, 2, "setns");
        regSysCall(309, 3, "getcpu");
        regSysCall(310, 6, "process_vm_readv");
        regSysCall(311, 6, "process_vm_writev");
        regSysCall(312, 5, "kcmp");
        regSysCall(313, 3, "finit_module");
        regSysCall(314, 3, "sched_setattr");
        regSysCall(315, 4, "sched_getattr");
        regSysCall(316, 5, "renameat2");
        regSysCall(317, 3, "seccomp");
        regSysCall(318, 3, "getrandom");
        regSysCall(319, 2, "memfd_create");
        regSysCall(320, 5, "kexec_file_load");
        regSysCall(321, 3, "bpf");
        regSysCall(322, 5, "execveat");
        regSysCall(323, 1, "userfaultfd");
        regSysCall(324, 3, "membarrier");
        regSysCall(325, 3, "mlock2");
        regSysCall(326, 6, "copy_file_range");
        regSysCall(327, 6, "preadv2");
        regSysCall(328, 6, "pwritev2");
        regSysCall(329, 4, "pkey_mprotect");
        regSysCall(330, 2, "pkey_alloc");
        regSysCall(331, 1, "pkey_free");
        regSysCall(332, 5, "statx");
        regSysCall(333, 6, "io_pgetevents");
        regSysCall(334, 4, "rseq");
    }
}
