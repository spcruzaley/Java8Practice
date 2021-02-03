package optional.primitives;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalInt;

public class OptionalPrimitivesExamplesTest {

    @Test
    public void testGetOptional() {
        int expectedInt = 50;

        OptionalInt optional = OptionalPrimitivesExamples.getOptionalInt(50);
        int actualInt = optional.getAsInt();

        Assert.assertEquals(expectedInt, actualInt);
    }

    @Test
    public void testGetOptionalIntWithValue() {
        int expectedInt = 5;

        OptionalInt optional = OptionalPrimitivesExamples.getOptionalInt(5);
        int actualInt = optional.orElse(20);

        Assert.assertEquals(expectedInt, actualInt);
    }

    @Test
    public void testGetOptionalIntWithoutValue() {
        int expectedInt = 20;

        OptionalInt optional = OptionalPrimitivesExamples.getOptionalInt(0);
        int actualInt = optional.orElse(20);

        Assert.assertEquals(expectedInt, actualInt);
    }

}
