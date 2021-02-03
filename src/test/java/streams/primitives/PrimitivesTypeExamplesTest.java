package streams.primitives;

import org.junit.Assert;
import org.junit.Test;

public class PrimitivesTypeExamplesTest {

    @Test
    public void testGenerateStreamOfPrimitiveIntegersWitnAnIncrement() {
        int[] expectedArray = new int[]{4,5,6,7,8};

        int[] inputArray = new int[]{1,2,3,4,5};
        int[] actualArray = PrimitivesTypeExamples
                .generateStreamOfPrimitiveIntegersWitnAnIncrement(inputArray, 3);

        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testGenerateRangeUpperBoundExcluded() {
        int expectedSum = 4950;

        int actualSum = PrimitivesTypeExamples.generateRangeUpperBoundExcluded(0, 100);

        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testGenerateRangeUpperBoundIncluded() {
        int expectedSum = 5050;

        int actualSum = PrimitivesTypeExamples.generateRangeUpperBoundIncluded(0, 100);

        Assert.assertEquals(expectedSum, actualSum);
    }

}
