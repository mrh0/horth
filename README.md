# Horth
 Stack-based native programming language compiler written in Java, inspired by Porth by Tsodling
 
 (C) mrh0 2022

# Syntax
```
//comment
/*comment*/
```
```
//String
"Hello World"

//Null terminated String
"Hello World"^

//Character
'a' '5' 'Z' '\n' '\r' '\r' '\0' '\\' '\''

//Integer
0 1 42 -10 0xA0 0b1100
```
```
//BinOps:
+ - * / % < > <= >= == != & | and or << >> =

//UnOps:
not ~
```
```
//Primitive types:
int string char bool ref

//Pointer type
ref<type>
arr<type>
func<type... -> type...>

//Type Functions
sizeof(type)
cast(type)
unsafe cast(type)
is(type...)
```
```
//Constants
const name /*value or expression*/ end
```
```
//System Call
syscall name 
//Name is Linux System Call name in all lowcase
//For full list of supported syscalls see com.mrh0.horth.output.x86_64.windows.Win64nasm@static.
```

# Examples

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
