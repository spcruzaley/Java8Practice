package streams.reduce;

import java.util.Optional;
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

}
