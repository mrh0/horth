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

//Atom
:atom :test_atom :TestAtom :a :b :8 :100

```
```
//BinOps:
+ - * / % < > <= >= == != & | and or << >> =

//UnOps:
not ~
```

```
//Accessor
"Hello World" []   // Returns string length (11)
"Hello World" [1]  // Returns char at index 1 ('e')

{5, 8, 3, 1} []    // Returns array length (4)
{5, 8, 3, 1} [2]   // Returns int at index 2 (3)

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
//For full list of supported syscalls see com.mrh0.horth.output.x86_64.linux.ArchElf64nasm.
```

# Keywords

```
//Where a, b is of any type
drop    : a, b -> a
dup     : a, b -> a, b, b
swap    : a, b -> b, a
over    : a, b -> a, b, a

length  : array | string -> array | string, int
exit    : int -> 
syscall <name> : 0-6 of any type -> int
```

# Examples

```
//Hello World
"Hello World" log
0 exit

//Hello World (Manual)
1 "Hello World" length
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
elif 1 == do
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
//Reversed stack: 3 2 1
```

```
//Atoms
:atom :atom ==    // True
:atom :ATom ==    // True
:atom1 :atom2 ==  // False
:Hello_World log  // "hello_world"
:_atom            // Invalid Syntax
```
