# Lab Report 1 - Remote Access and FileSystem

## The `cd` command
1. No arguments
```
[user@sahara ~]$ cd
[user@sahara ~]$ 
```
* Before the `cd` command was run, the working directory was `home`.
* Since an argument was not given, the `cd` command changed into the root directory, which was `home`. Since we were already in the `home` directory, nothing happened.
* There is no output, so no error occurs.


2. Path to a directory
```
[user@sahara ~]$ cd lecture1
[user@sahara ~/lecture1]$ 
```
* Before the `cd` command was run, the working directory was `home`.
* The only directory contained directly inside of `home` was `lecture1`. When `lecture1` is passed as the argument for the `cd` command, the working address changes to `home/lecture1`.
* No error occurs when this command is run.


3. Path to a file
```
[user@sahara ~]$ cd lecture1/Hello.java 
bash: cd: lecture1/Hello.java: Not a directory
```
* Before the `cd` command was run, the working directory was `home`.
* There is no file contained directly inside of `home`, so I used the path to `Hello.java`, which was `lecture1/Hello.java`. This did not work because the `cd` command can only receive directories as an input, not file names.
* This output shows an error because I cannot `cd` into `Hello.java`, as it is a file.


## The `ls` command
1. No arguments
2. Path to a directory
3. Path to a file

## The `cat` command
1. No arguments
2. Path to a directory
3. Path to a file
