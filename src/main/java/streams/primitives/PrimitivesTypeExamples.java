package streams.primitives;

import java.util.stream.IntStream;

public class PrimitivesTypeExamples {

    /**
     * Simple example to use IntStream to create/manipulate a Stream of primitive values
     *
     * See {/src/test/streams/primitives/PrimitivesTypeStreamsTest#testGenerateStreamOfPrimitiveIntegersWitnAnIncrement}
     * for an example
     *
     * @param increment
     * @return
     */
    public static int[] generateStreamOfPrimitiveIntegersWitnAnIncrement(int[] array, int increment) {
        return IntStream.of(array)
                .map(x -> x + increment)
                .toArray();
    }

    /**
     * Use of range primitives generator
     *
     * See {/src/test/streams/primitives/PrimitivesTypeStreamsTest#testGenerateRangeUpperBoundExcluded}
     * for an example
     *
     * @param from
     * @param to
     * @return
     */
    public static int generateRangeUpperBoundExcluded(int from, int to) {
        return IntStream.range(from, to).sum();
    }

    /**
     * Use of range primitives generator
     *
     * See {/src/test/streams/primitives/PrimitivesTypeStreamsTest#testGenerateRangeUpperBoundIncluded}
     * for an example
     *
     * @param from
     * @param to
     * @return
     */
    public static int generateRangeUpperBoundIncluded(int from, int to) {
        return IntStream.rangeClosed(from, to).sum();
    }

}
