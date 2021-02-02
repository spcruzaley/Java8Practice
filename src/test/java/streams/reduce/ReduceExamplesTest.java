package streams.reduce;

import org.junit.Assert;
import org.junit.Test;

import java.util.IntSummaryStatistics;
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

    @Test
    public void testGenerateStatisticsMaxAge() {
        int expectedMaxAge = 34;

        IntSummaryStatistics statistics = ReduceExamples.generateStatistics();
        int actualMaxAge = statistics.getMax();

        Assert.assertEquals(expectedMaxAge, actualMaxAge);
    }

    @Test
    public void testGenerateStatisticsMinAge() {
        int expectedMinAge = 23;

        IntSummaryStatistics statistics = ReduceExamples.generateStatistics();
        int actualMinAge = statistics.getMin();

        Assert.assertEquals(expectedMinAge, actualMinAge);
    }

    @Test
    public void testGenerateStatisticsAverageAge() {
        double expectedAverageAge = 27.4;

        IntSummaryStatistics statistics = ReduceExamples.generateStatistics();
        double actualAverageAge = statistics.getAverage();

        Assert.assertEquals(expectedAverageAge, actualAverageAge, 0.0);
    }

    private Integer[] buildNumsList() {
        return new Integer[]{5,6,8,1,9,2};
    }

}
