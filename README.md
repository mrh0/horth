# Horth
 Stack-based native programming language compiler written in Java, inspired by Porth by Tsodling
 
 (C) mrh0 2022

# Syntax
```
//comment
/*comment*/
Symbols can be separated with a comma ',' but has no effect on the compilation or execution, it can be seen as a comment.
1, 2, 3 + +

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

{5, 8, 3, 1} []    // Returns array length (4) [WIP]
{5, 8, 3, 1} [2]   // Returns int at index 2 (3) [WIP]

```

```
//Infix syntax
(1 - (5 + 2))  //Compiles into: 1 5 2 + -
let a b in
   (a - b + 1) //Compiles into: a b - 1 +
end
```
```
//Constants [WIP]
const name /*value or expression*/ end
```

```
//System Call
syscall name 
//Name is Linux System Call name in all lowcase
//For full list of supported syscalls see com.mrh0.horth.output.x86_64.linux.ArchElf64nasm.
```

# Types

```
//Primitive types
int string char bool ref u64 u32 u16 u8 byte atom void

//Pointer types
ref<type>
arr<type>
func<type... -> type...>
```
```
//Type Functions
sizeof(type)
sizeof type

cast(type)
as type
unsafe cast(type)
as unsafe type

is(type...)
is type
```
```
//UserTypes (structs) [WIP]
type typename as name type | name type | ... end
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
log     : string | atom ->
here    : -> string, int int //filename line column
```

# Functions

```
//Syntax
/*prefix*/ func /*name*/ /*type...*/ -> /*type...*/ in
   /*function body*/
end

//Define
func add int int -> int in
   +
end

//Call
1 1 add //Returns 2

//Define inline functions
inline func inlineAdd int int -> int in
   +
end

//Use
1 1 add //Will compile into: '1 1 +' and wont call the function

//Define start functions
start func main -> int in
   "Hello World" log
end

//Start functions can have any name but must return one number (anything castable to byte).
//arguments to a start function can be anything and will match based on the start arguments given when running the program [WIP].
//If none match the main function with no arguments is used.

```

# Examples

```
//Hello World
"Hello World" log
0 exit

//Hello World (using syscall)
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
exit //Exitcode: 1
```

```
//Loops
0
while 10 < do
   1 +
end
exit //Exitcode: 10
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
