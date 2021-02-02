package common;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonBuilder {

    public static List<Person> buildPersonList() {
        return Stream.of(
                new Person(1,"Santiago", "santiago@gmail.com", 23, Gender.MALE),
                new Person(2,"Tadeo", "tadeo@gmail.com", 32, Gender.MALE),
                new Person(3,"Salvador", "salvador@gmail.com", 25, Gender.MALE),
                new Person(4,"Marlen", "marlen@gmail.com", 23, Gender.FEMALE),
                new Person(5,"Beatriz", "beatriz@gmail.com", 23, Gender.FEMALE),
                new Person(6,"Ana", "ana@gmail.com", 23, Gender.FEMALE),
                new Person(7,"John", "john@gmail.com", 34, Gender.OTHER)
        ).collect(Collectors.toList());
    }

    public static List<Person> buildFemalePeopleList() {
        return Stream.of(
                new Person(4,"Marlen", "marlen@gmail.com", 23, Gender.FEMALE),
                new Person(5,"Beatriz", "beatriz@gmail.com", 23, Gender.FEMALE),
                new Person(6,"Ana", "ana@gmail.com", 23, Gender.FEMALE)
        ).collect(Collectors.toList());
    }

    public static List<Person> buildMalePeopleList() {
        return Stream.of(
                new Person(1,"Santiago", "santiago@gmail.com", 23, Gender.MALE),
                new Person(2,"Tadeo", "tadeo@gmail.com", 32, Gender.MALE),
                new Person(3,"Salvador", "salvador@gmail.com", 25, Gender.MALE)
        ).collect(Collectors.toList());
    }

}
