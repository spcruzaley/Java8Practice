package streams.maps;

import common.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapExamplesTest {

    @Test
    public void testMapPersonNamesFromPeopleList() {
        Set<String> expectedResult = Stream.of("Santiago", "Tadeo", "Salvador", "Benito")
                .collect(Collectors.toSet());

        List<Person> people = Stream.of(
                new Person("Santiago", "santiago@gmail.com", 23),
                new Person("Santiago", "santiago@gmail.com", 23),
                new Person("Tadeo", "tadeo@gmail.com", 32),
                new Person("Tadeo", "tadeo@gmail.com", 32),
                new Person("Tadeo", "tadeo@gmail.com", 32),
                new Person("Salvador", "salvador@gmail.com", 25),
                new Person("Salvador", "salvador@gmail.com", 25),
                new Person("Salvador", "salvador@gmail.com", 25),
                new Person("Salvador", "salvador@gmail.com", 25),
                new Person("Benito", "benito@gmail.com", 23),
                new Person("Benito", "benito@gmail.com", 23),
                new Person("Benito", "benito@gmail.com", 23)
        ).collect(Collectors.toList());
        Set<String> actualResult = MapExamples.mapPersonNamesFromPeopleList(people);

        Assert.assertEquals(expectedResult, actualResult);
    }

}
