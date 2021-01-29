package streams.collect;

import common.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Set;

public class CollectorsExampleTest {

    @Test
    public void testGenerateListOfPersonNames() {
        int expectedElements = 5;

        List<Person> people = CollectorsExample.generateListOfPersonNames();
        int actualElements = people.size();

        Assert.assertEquals(expectedElements, actualElements);
    }

    @Test
    public void testGenerateSetOfPersonNames() {
        int expectedElements = 4;

        Set<Person> people = CollectorsExample.generateSetOfPersonNames();
        int actualElements = people.size();

        Assert.assertEquals(expectedElements, actualElements);
    }

}
