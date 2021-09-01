package sequence;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.*;

public class SequenceTest extends Assert{
    private Sequence getSequence = new Sequence();
    private List<Integer> expectedArray = Arrays.asList(5, 6, 7, 8, 9);

    @Test
    public void testSqrtFromMaxSquare() {
        int expectedSqrt = 9;
        assertEquals(getSequence.sqrtFromMaxSquare(81), expectedSqrt);
    }

    @Test
    public void positiveSequenceWithStartSequence5_GetLengthNumber_5() {
        int startSequence = 5;
        int getLengthNumber = 5;
        List<Integer> actualArray = getSequence.getSequence(startSequence, getLengthNumber);
        Assert.assertEquals(actualArray, expectedArray);
    }

    @Test
    public void negativeGetSequence() {
        int startSequence = 10;
        int lengthNumber = 10;
        assertNotEquals(getSequence.getSequence(startSequence, lengthNumber), expectedArray);
    }
}