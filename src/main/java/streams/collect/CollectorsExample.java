package streams.collect;

import common.Person;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsExample {

    /**
     * Simple example to create a List of Objects (In this case Person) using "collect" method.
     *
     * @see streams.maps.MapExamples#mapPersonNamesFromPeopleList(List<Person> people) for another collect example
     *
     * @return
     */
    public static List<Person> generateListOfPersonNames() {
        List<Person> people = Stream.of(
                new Person("Santiago", "santiago@gmail.com", 23),
                new Person("Tadeo", "tadeo@gmail.com", 32),
                new Person("Salvador", "salvador@gmail.com", 25),
                new Person("Benito", "benito@gmail.com", 23),
                new Person("Raul", "raul@gmail.com", 34)
        ).collect(Collectors.toList());

        return people;
    }

    /**
     * Simple example to create a Set of Objects (In this case Person) using "collect" method.
     * NOTE: Note that the Person class has overriding the equals and hashCode methods.
     *
     * @return
     */
    public static Set<Person> generateSetOfPersonNames() {
        Set<Person> people = Stream.of(
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
        ).collect(Collectors.toSet());

        return people;
    }

}