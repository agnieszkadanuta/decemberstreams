package pl.dominisz.decemberstreams;

import java.util.List;
import java.util.stream.Collectors;

public class Joining {

    public static String namesToString7(List<Person> people) {
        String names = "";
        for (int i = 0; i < people.size() - 1; i++) {
            String name = people.get(i).getName();
            names += name + ", ";
        }
        names += people.get(people.size()-1).getName()  + ".";

        return "Names: " + names;
    }

    public static String namesToString(List<Person> people) {
        return people.stream().map(person -> person.getName()).collect(Collectors.joining(", ", "Names: ", "."));
    }

}
