### Unicode Introduction

#### Code Point
 Assign an integer to each character, the integers for characters are code points.
 
#### Code Space
 All the code points are built to code space.
 Code points are from 0x0 to 0x10FFFF, totally 1,114,112 characters. Not all code points are assigned.
 
#### Code Plane
- There are 17 code planes in Unicode, every code plane has 2^16 code points.
- The first code plane covers 0x0000 0xFFFF
- The second code plane covers 0x10000 0x1FFFF
- The third code plan covers 0x20000 0x2FFFF
...
- The other code planes covers 0x100000~0x10FFFF

The first plane(#0) named Basic Multilingual Plane(BMP), it contains commonly used characters.
The second plane(#1) named Supplementary Multilingual Plane(SMP), it contains historical symbols and certain field notations.
The third plane(#2) named Supplementary Ideographic Plane(SIP), it contains ideographic characters of CJK not included in BMP.
The plane#14 Supplementary Special-Purpose Plane
The Plane#15 Supplementary Private Use Area A
The Plane#16 Supplementary Private Use Area B

TimeZone information on OpenJDK:
http://grepcode.com/file_/repository.grepcode.com/java/root/jdk/openjdk/8u40-b25/sun/util/calendar/ZoneInfoFile.java/?v=source
 
    private static String[][] oldMappings = new String[][] {
        { "ACT", "Australia/Darwin" },
        { "AET", "Australia/Sydney" },
        { "AGT", "America/Argentina/Buenos_Aires" },
        { "ART", "Africa/Cairo" },
        { "AST", "America/Anchorage" },
        { "BET", "America/Sao_Paulo" },
        { "BST", "Asia/Dhaka" },
        { "CAT", "Africa/Harare" },
        { "CNT", "America/St_Johns" },
        { "CST", "America/Chicago" },
        { "CTT", "Asia/Shanghai" },
        { "EAT", "Africa/Addis_Ababa" },
        { "ECT", "Europe/Paris" },
        { "IET", "America/Indiana/Indianapolis" },
        { "IST", "Asia/Kolkata" },
        { "JST", "Asia/Tokyo" },
        { "MIT", "Pacific/Apia" },
        { "NET", "Asia/Yerevan" },
        { "NST", "Pacific/Auckland" },
        { "PLT", "Asia/Karachi" },
        { "PNT", "America/Phoenix" },
        { "PRT", "America/Puerto_Rico" },
        { "PST", "America/Los_Angeles" },
        { "SST", "Pacific/Guadalcanal" },
        { "VST", "Asia/Ho_Chi_Minh" },
    };

default date format:

https://docs.oracle.com/cd/E57471_01/bigData.100/data_processing_bdd/src/rdp_config_dates.html

d/M/yy
d-M-yy
d.M.yy
M/d/yy
M-d-yy
M.d.yy
yy/M/d
yy-M-d
yy.M.d
MMM d, yyyy
EEE, MMM d, yyyy
yyyy-MM-dd HH:mm:ss
yyyy-MM-dd h:mm:ss a
yyyy-MM-dd'T'HH-mm-ssZ
yyyy-MM-dd'T'HH:mm:ss'Z'
yyyy-MM-dd'T'HH:mm:ss.SSS'Z'
EEE d MMM yyyy HH:mm:ss Z
H:mm
h:mm a
H:mm:ss
h:mm:ss a