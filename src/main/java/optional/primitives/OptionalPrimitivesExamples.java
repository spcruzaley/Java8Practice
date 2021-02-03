package optional.primitives;

import java.util.OptionalInt;

public class OptionalPrimitivesExamples {

    /**
     * Optional has also Classes to work with primitive values.
     *
     * See {/src/test/optional/primitives/OptionalPrimitivesExamplesTest} for some examples
     *
     * @param value
     * @return
     */
    public static OptionalInt getOptionalInt(int value) {
        if(value != 0)
            return OptionalInt.of(value);
        else
            return OptionalInt.empty();
    }

}
