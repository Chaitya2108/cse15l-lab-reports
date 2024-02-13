# Lab Report 3 - Bugs and Commands

## Part 1: Bugs
For this lab, I explored the bug found in `reverseInPlace()` method, found in `ArrayExamples.java`. 
1. Original Code of the Method
```

```
2. Failure-inducing input
This JUnit test is run in `ArrayExamplesTest.java` to test the method.
```
@Test
public void testReversed2() {
    int[] input1 = {1,2,3,4,5};
    int[] input2 = {1,2,3,4,5,6};
    int[] reversed1 = ArrayExamples.reversed(input1);
    int[] reversed2 = ArrayExamples.reversed(input2);
    assertArrayEquals(new int[]{5,4,3,2,1}, reversed1);
    assertArrayEquals(new int[]{6,5,4,3,2,1}, reversed2);
  }

```