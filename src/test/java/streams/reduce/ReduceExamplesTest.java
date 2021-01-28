package streams.reduce;

import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

public class ReduceExamplesTest {

    @Test
    public void testSumSequenceWithLambdaExpression() {
        int expectedSum = 31;
        Integer[] nums = buildNumsList();

        int actualSum = ReduceExamples.sumSequenceWithLambdaExpression(nums);

        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testSumSequenceWithMethodReference() {
        int expectedSum = 31;
        Integer[] nums = buildNumsList();

        int actualSum = ReduceExamples.sumSequenceWithMethodReference(nums);

        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testSumSequenceWithMethodReferenceAsOptional() {
        Optional<Integer> expectedSum = Optional.of(31);
        Integer[] nums = buildNumsList();

        Optional<Integer> actualSum = ReduceExamples
                .sumSequenceWithMethodReferenceAsOptional(nums);

        Assert.assertEquals(expectedSum, actualSum);
    }

    private Integer[] buildNumsList() {
        return new Integer[]{5,6,8,1,9,2};
    }

}
