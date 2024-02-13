# Lab Report 3 - Bugs and Commands

## Part 1: Bugs
For this lab, I explored the bug found in `reverseInPlace()` method, found in `ArrayExamples.java`. 


- Failure-inducing input

This failed JUnit test is run in `ArrayExamplesTest.java` to test the method.
```
@Test
public void testReversed1() {
    int[] input1 = {1,2,3,4,5};
    assertArrayEquals(new int[]{5,4,3,2,1}, reversed1);
}
```

- Suceeding input

This successful JUnit test is run in `ArrayExamplesTest.java` to test the method.
```
@Test
public void testReversed2() {
    int[] input1 = {1};
    assertArrayEquals(new int[]{1}, reversed1);
}
```

- Symptoms

![Image](test_error.png)

- Bug

The code before:
```
public class ArrayExamples {
  static void reverseInPlace(int[] arr) {
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = arr[arr.length - i - 1];
    }
  }
}
```

The code after:
```
public class ArrayExamples {
  static void reverseInPlace(int[] arr) {
    for(int i = 0; i < arr.length / 2; i += 1) {
      int temp = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = temp;
    }
  }
}
```

Explanation: 
This error occurs because simply swapping values directly deletes the value that is overwritten first. Also, looping through the full array causes the overwritten values to show up twice. This can be fixed by looping through just half the array. Also, the value that is initially overwritten can be stored in a temporary variable and then added back.


## Part 2: Researching Commands
4 uses of the `find` command:
- Searching by file type:

1. First example: This example uses `-type d` to search for all directories (folders) in `./technical`. This is useful for recursively finding all the folders within a given directory without accessing each one using `cd`.
```
bash-3.2$ find ./technical -type d
./technical
./technical/government
./technical/government/About_LSC
./technical/government/Env_Prot_Agen
./technical/government/Alcohol_Problems
./technical/government/Gen_Account_Office
./technical/government/Post_Rate_Comm
./technical/government/Media
./technical/plos
./technical/biomed
./technical/911report
bash-3.2$ 
```
2. Second example: This example uses `-not -type f` to search for all items in `./technical` that are not files. This command can be helpful when looking for all files not of a specific type. For example, it can be used to find all files that are not of type `.pdf`.
```
bash-3.2$ find ./technical -not -type f
./technical
./technical/government
./technical/government/About_LSC
./technical/government/Env_Prot_Agen
./technical/government/Alcohol_Problems
./technical/government/Gen_Account_Office
./technical/government/Post_Rate_Comm
./technical/government/Media
./technical/plos
./technical/biomed
./technical/911report
bash-3.2$ 
```
3. Source: ChatGPT

- Using a wildcard

1. First Example: This example uses `-name "chapter*"` to find all the files in `./technical` that start with "chapter". This can be helpful when searching a large directory for files with specific names, for ex. the chapters of a book stored in a folder.
```
bash-3.2$ find ./technical -name "chapter*"
./technical/911report/chapter-13.4.txt
./technical/911report/chapter-13.5.txt
./technical/911report/chapter-13.1.txt
./technical/911report/chapter-13.2.txt
./technical/911report/chapter-13.3.txt
./technical/911report/chapter-3.txt
./technical/911report/chapter-2.txt
./technical/911report/chapter-1.txt
./technical/911report/chapter-5.txt
./technical/911report/chapter-6.txt
./technical/911report/chapter-7.txt
./technical/911report/chapter-9.txt
./technical/911report/chapter-8.txt
./technical/911report/chapter-12.txt
./technical/911report/chapter-10.txt
./technical/911report/chapter-11.txt
bash-3.2$ 
```
2. Second Example: This example uses `-type f -path "*/911*/*"` to find all the files in all the folders that contain "911" in their name. This can be helpful in finding particular files within folders that have the similar names and can be stored in different locations. 
```
bash-3.2$ find ./technical -type f -path "*/911*/*"
./technical/911report/chapter-13.4.txt
./technical/911report/chapter-13.5.txt
./technical/911report/chapter-13.1.txt
./technical/911report/chapter-13.2.txt
./technical/911report/chapter-13.3.txt
./technical/911report/chapter-3.txt
./technical/911report/chapter-2.txt
./technical/911report/chapter-1.txt
./technical/911report/chapter-5.txt
./technical/911report/chapter-6.txt
./technical/911report/chapter-7.txt
./technical/911report/chapter-9.txt
./technical/911report/chapter-8.txt
./technical/911report/preface.txt
./technical/911report/chapter-12.txt
./technical/911report/chapter-10.txt
./technical/911report/chapter-11.txt
bash-3.2$ 
```
3. Source: ChatGPT

- Searching by size

1. First example: This example uses `-type f -size +200k` to find all files with a size of more than 200 kilobytes. This command can be helpful when looking for files that are too large, allowing developers to save space. 
```
bash-3.2$ find ./technical -type f -size +200k
./technical/government/About_LSC/commission_report.txt
./technical/government/Env_Prot_Agen/bill.txt
./technical/government/Gen_Account_Office/GovernmentAuditingStandards_yb2002ed.txt
./technical/government/Gen_Account_Office/Statements_Feb28-1997_volume.txt
./technical/government/Gen_Account_Office/d01591sp.txt
./technical/911report/chapter-13.4.txt
./technical/911report/chapter-13.5.txt
./technical/911report/chapter-3.txt
bash-3.2$ 
```
2. Second example: This example uses `-type d -size -500c` to find all folders with a size of less than 500 bytes. This can be helpful when working on a large repository, as folders that are too small can suggest that they do not have all the files they should.
```
bash-3.2$ find ./technical -type d -size -500c
./technical
./technical/government
./technical/government/Alcohol_Problems
bash-3.2$ 
```
3. Source: ChatGPT

- Searching based on time

1. Example 1: This example uses `-type f -mtime -5` to search for all files in `./technical/biomed` that were edited within the last 5 days. All files are shown because the repository was cloned within 5 days ago.
```
bash-3.2$ find ./technical/biomed -type f -mtime -5
./technical/biomed/1472-6807-2-2.txt
./technical/biomed/1471-2350-4-3.txt
./technical/biomed/1471-2156-2-3.txt
./technical/biomed/1471-2156-3-11.txt
./technical/biomed/1471-2121-3-10.txt
./technical/biomed/1471-2172-3-4.txt
./technical/biomed/gb-2002-4-1-r2.txt
./technical/biomed/gb-2003-4-6-r41.txt
./technical/biomed/1471-2466-1-1.txt
./technical/biomed/1471-2199-2-10.txt
./technical/biomed/1471-2202-2-9.txt
./technical/biomed/cc991.txt
./technical/biomed/1471-2369-3-9.txt
...
bash-3.2$ 
```
2. Second example: This example uses `-type f -mtime +6` for all files in `./technical` that were edited more than 6 days ago. No files are shown because the repository is only 5 days old.
```
bash-3.2$ find ./technical -type f -mtime +6
bash-3.2$ 
```
3. Source: ChatGPT


