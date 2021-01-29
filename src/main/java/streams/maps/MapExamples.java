package streams.maps;

import common.Person;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapExamples {

    /**
     * From a given List of Person, we will to returns a Set with only the Person names.
     *
     * @param people
     * @return
     */
    public static Set<String> mapPersonNamesFromPeopleList(List<Person> people) {
        Set<String> personNames = people.stream()
                .map(Person::getName)
                .collect(Collectors.toSet());

        return personNames;
    }

}
