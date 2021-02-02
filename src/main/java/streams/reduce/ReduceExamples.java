package streams.reduce;

import common.Person;
import streams.collect.CollectorsExample;

import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReduceExamples {

    /**
     * Get sum of numbers located in an Integer array
     *
     * FIRST EXAMPLE: Using lambda expression and identity value
     *
     * @param nums
     * @return
     */
    public static int sumSequenceWithLambdaExpression(Integer[] nums) {
        int totalLength = Stream.of(nums)
                .reduce(0, (a, b) -> a + b);

        return totalLength;
    }

    /**
     * Get sum of numbers located in an Integer array
     *
     * FIRST EXAMPLE: Using Method Reference and identity value
     *
     * @param nums
     * @return
     */
    public static int sumSequenceWithMethodReference(Integer[] nums) {
        int totalLength = Stream.of(nums)
                .reduce(0, Integer::sum);

        return totalLength;
    }

    /**
     * Get sum of numbers located in an Integer array
     *
     * FIRST EXAMPLE: Using Method Reference and now returning an Optional value
     *
     * @param nums
     * @return
     */
    public static Optional<Integer> sumSequenceWithMethodReferenceAsOptional(Integer[] nums) {
        Optional<Integer> totalLength = Stream.of(nums)
                .reduce(Integer::sum);

        return totalLength;
    }

    /**
     * IntSummaryStatistics class example, very useful if we need to get a statistics, we don't need to make additional
     * tasks.
     *
     * See {/src/test/streams/reduce/ReduceExamplesTest#testGenerateStatisticsMaxAge} for an example
     * See {/src/test/streams/reduce/ReduceExamplesTest#testGenerateStatisticsMinAge} for an example
     * See {/src/test/streams/reduce/ReduceExamplesTest#testGenerateStatisticsAverageAge} for an example
     *
     * @return
     */
    public static IntSummaryStatistics generateStatistics() {
        return CollectorsExample.generateListOfPersonNames().stream()
                .map(Person::getAge)
                .collect(Collectors.summarizingInt(age -> age));
    }

}
