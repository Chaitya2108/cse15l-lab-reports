import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
    @Test
    public void testReversed1() {
        int[] input1 = {1,2,3,4,5};
        ArrayExamples.reverseInPlace(input1);
        assertArrayEquals(new int[]{5,4,3,2,1}, input1);
    }

    @Test
    public void testReversed2() {
        int[] input1 = {1};
        ArrayExamples.reverseInPlace(input1);
        assertArrayEquals(new int[]{1}, input1);
    }
}