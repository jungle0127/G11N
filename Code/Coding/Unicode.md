### Unicode Introduction

#### Code Point
 Assign an integer to each character, the integers for characters are code points.
 
#### Code Space
 All the code points are built to code space.
 Code points are from 0x0 to 0x10FFFF, totally 1,114,112 characters. Not all code points are assigned.
 
#### Code Plane
There are 17 code planes in Unicode, every code plane has 2^16 code points.
The first code plane covers 0x0000~0xFFFF
The second code plane covers 0x10000~0x1FFFF
The third code plan covers 0x20000~0x2FFFF
...
The other code planes covers 0x100000~0x10FFFF

The first plane(#0) named Basic Multilingual Plane(BMP), it contains commonly used characters.
The second plane(#1) named Supplementary Multilingual Plane(SMP), it contains historical symbols and certain field notations.
The third plane(#2) named Supplementary Ideographic Plane(SIP), it contains ideographic characters of CJK not included in BMP.
The plane#14 Supplementary Special-Purpose Plane
The Plane#15 Supplementary Private Use Area A
The Plane#16 Supplementary Private Use Area B
 