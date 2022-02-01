# horth
 Stack-based native programming language compiler written in Java, inspired by Porth by Tsodling
 
 (C) mrh0 2022

# examples

```
//Hello World
1 "Hello World" 11
let fd str len in
    fd, (str unsafe cast(int) + sizeof(int)), len
    syscall write drop
end
0 exit
```

```
//Branch
0
if dup 0 == do
   1
elif dup 1 == do
   2
else
   3
end
exit
```

```
//Loops
0
while 10 < do
   1 +
end
exit
```

```
//Let
1 2 3
let a b c in
   c b a
end
```
