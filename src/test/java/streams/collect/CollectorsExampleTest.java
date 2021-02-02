package streams.collect;

import common.Gender;
import common.Person;
import common.PersonBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

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

    @Test
    public void testBuildPeopleMap() {
        Person expectedPerson = new Person(3,"Salvador", "salvador@gmail.com", 25);

        Map<Integer, Person> map = CollectorsExample.buildPeopleMap();
        Person actualPerson = map.get(3);

        Assert.assertEquals(expectedPerson, actualPerson);
    }

    @Test
    public void testMapPeopleByGender() {
        List<Person> expectedFemalePeople = PersonBuilder.buildFemalePeopleList();

        Map<Gender, List<Person>> personsByGender = CollectorsExample.mapPeopleByGender();
        List<Person> actualFemalePeople = personsByGender.get(Gender.FEMALE);

        Assert.assertEquals(expectedFemalePeople, actualFemalePeople);
    }

    @Test
    public void testMapPeopleByGenderUsingPartitioning() {
        List<Person> expectedFemalePeople = PersonBuilder.buildMalePeopleList();

        Map<Boolean, List<Person>> personsByGender = CollectorsExample.mapPeopleByGenderUsingPartitioning();
        List<Person> actualFemalePeople = personsByGender.get(true);

        Assert.assertEquals(expectedFemalePeople, actualFemalePeople);
    }

    @Test
    public void testMapCountingPeopleByGender() {
        Map<Gender, Long> expectedGenderCounting = buildCountingPeopleByGender();

        Map<Gender, Long> actualGenderCounting = CollectorsExample.mapCountingPeopleByGender();

        Assert.assertEquals(expectedGenderCounting, actualGenderCounting);
    }

    @Test
    public void testMapPersonByGenderWithTheMaxAge() {
        Map<Gender, Optional<Person>> expectedGenderWithMaxAge = buildPeopleByGenderAndMaxAge();

        Map<Gender, Optional<Person>> actualGenderWithMaxAge = CollectorsExample.mapPersonByGenderWithTheMaxAge();

        Assert.assertEquals(expectedGenderWithMaxAge, actualGenderWithMaxAge);
    }

    private Map<Gender, Long> buildCountingPeopleByGender() {
        Map<Gender, Long> numPeopleByGender = new HashMap<>();
        numPeopleByGender.put(Gender.MALE, 3L);
        numPeopleByGender.put(Gender.FEMALE, 3L);
        numPeopleByGender.put(Gender.OTHER, 1L);

        return numPeopleByGender;
    }

    private Map<Gender, Optional<Person>> buildPeopleByGenderAndMaxAge() {
        Map<Gender, Optional<Person>> numPeopleByGender = new HashMap<>();
        numPeopleByGender.put(Gender.MALE, Optional.of(new Person(2,"Tadeo", "tadeo@gmail.com", 32, Gender.MALE)));
        numPeopleByGender.put(Gender.FEMALE, Optional.of(new Person(4,"Marlen", "marlen@gmail.com", 23, Gender.FEMALE)));
        numPeopleByGender.put(Gender.OTHER, Optional.of(new Person(7,"John", "john@gmail.com", 34, Gender.OTHER)));

        return numPeopleByGender;
    }

}
