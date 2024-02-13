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
2. Second example: This example uses `type -not -f` to search for all items in `./technical` that are not files. This command can be helpful when looking for all files not of a specific type. For example, it can be used to find all files that are not of type `.pdf`.
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

