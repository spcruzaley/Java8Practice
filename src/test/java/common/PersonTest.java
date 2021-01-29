package common;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void testPersonBuild() {
        String expectedOutput = "Person{name='Santiago', email='santiago@gmail.com', age=32}";

        Person person = new Person("Santiago", "santiago@gmail.com", 32);

        Assert.assertEquals(expectedOutput, person.toString());
    }

    @Test
    public void testDuplicatedPerson() {
        Person personA = new Person("Santiago", "santiago@gmail.com", 32);
        Person personB = new Person("Santiago", "santiago@gmail.com", 32);

        Assert.assertEquals(personA, personB);
    }

}
