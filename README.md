# horth
 Stack-based native programming language compiler written in Java, inspired by Porth by Tsodling
 
 (C) mrh0 2022

# examples

```
//Hello World
"Hello World" 11
let str len in
    1, (str unsafe cast(int) + sizeof(int)), len
    syscall write drop
end
0 exit

```
