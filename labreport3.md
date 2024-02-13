# Lab Report 3 - Bugs and Commands

## Part 1: Bugs
For this lab, I explored the bug found in `reverseInPlace()` method, found in `ArrayExamples.java`. 

1. Failure-inducing input
This failed JUnit test is run in `ArrayExamplesTest.java` to test the method.
```
@Test
public void testReversed1() {
    int[] input1 = {1,2,3,4,5};
    assertArrayEquals(new int[]{5,4,3,2,1}, reversed1);
}
```

2. Suceeding input
This successful JUnit test is run in `ArrayExamplesTest.java` to test the method.
```
@Test
public void testReversed2() {
    int[] input1 = {1};
    assertArrayEquals(new int[]{1}, reversed1);
}
```

3. Symptoms
![Image](test_error.png)

4. Bug
The code before:
```
```

The code after:
```
```

Explanation: 