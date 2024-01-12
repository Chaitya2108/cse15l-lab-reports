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
```
[user@sahara ~]$ ls
lecture1
[user@sahara ~]$ 
```
* The `ls` command is run from the `home` directory.
* The `ls` command shows an overview of all the files and directories directly inside the working directory. No input is given, so the command works from the `home` directory. Since the only item directly inside of `home` is `/lecture1`, the ls command outputs `lecture1`.
* No error occurs with this command.


2. Path to a directory
```
[user@sahara ~]$ ls lecture1
Hello.class  Hello.java  messages  README
[user@sahara ~]$ 
```
* The `ls` command is run from the `home` directory.
* Since `ls` lists all the files within the given directory, this command lists all the directories and files in `/lecture1` because that is the input given. 
* No error occurs on this command. 


3. Path to a file
```
[user@sahara ~]$ ls lecture1/Hello.java
lecture1/Hello.java
[user@sahara ~]$ 
```
* The `ls` command is run from the `home` directory.
* There are no files directly within `home`, so I use `lecture1/Hello.java` to access the `Hello.java` file. This outputs the path for `Hello.java`.
* No error occurs here, but this command is ideally used to access files inside directories (not for files).
## The `cat` command
1. No arguments
2. Path to a directory
3. Path to a file
