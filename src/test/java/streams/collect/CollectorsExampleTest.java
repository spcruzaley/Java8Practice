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

    @Test
    public void testNamesJoining() {
        String expectedNames = "SantiagoTadeoSalvadorBenitoRaul";

        String actualNames = CollectorsExample.namesJoining();

        Assert.assertEquals(expectedNames, actualNames);
    }

    @Test
    public void testNamesJoiningWithDelimiter() {
        String expectedNames = "Santiago,Tadeo,Salvador,Benito,Raul";

        String actualNames = CollectorsExample.namesJoiningWithDelimiter(",");

        Assert.assertEquals(expectedNames, actualNames);
    }

}
