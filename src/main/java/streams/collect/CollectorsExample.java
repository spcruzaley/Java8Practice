package streams.collect;

import common.Person;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
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
                new Person(1,"Santiago", "santiago@gmail.com", 23),
                new Person(2,"Tadeo", "tadeo@gmail.com", 32),
                new Person(3,"Salvador", "salvador@gmail.com", 25),
                new Person(4,"Benito", "benito@gmail.com", 23),
                new Person(5,"Raul", "raul@gmail.com", 34)
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

    /**
     * Using joining in conjunction with map to join all the names of each person located in a list.
     *
     * See {/src/test/streams/collect/CollectorsExampleTest#testNamesJoining} for an example
     *
     * @return
     */
    public static String namesJoining() {
        List<Person> people = generateListOfPersonNames();

        return people.stream()
                .map(Person::getName)
                .collect(Collectors.joining());
    }

    /**
     * Using joining in conjunction with map to join all the names of each person in a list.
     * In this case the names will be separated by the delimiter specified.
     *
     * See {/src/test/streams/collect/CollectorsExampleTest#testNamesJoiningWithDelimiter} for an example
     *
     * @return
     */
    public static String namesJoiningWithDelimiter(String delimiter) {
        List<Person> people = generateListOfPersonNames();

        return people.stream()
                .map(Person::getName)
                .collect(Collectors.joining(delimiter));
    }

    /**
     * Example how to build a Map using a key and value, where the key and value can be whatever we want.
     * I we need to use the current Object, we need to specify with Function.identity()
     *
     * See {/src/test/streams/collect/CollectorsExampleTest#testBuildPeopleMap} for an example
     *
     * @return
     */
    public static Map<Integer, Person> buildPeopleMap() {
        return generateListOfPersonNames().stream()
                .collect(Collectors.toMap(
                        Person::getId,
                        Function.identity()
                ));
    }

}