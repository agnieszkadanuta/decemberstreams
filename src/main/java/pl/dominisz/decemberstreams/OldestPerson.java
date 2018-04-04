package pl.dominisz.decemberstreams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class OldestPerson {

    public static Optional<Person> getOldestPerson7(List<Person> people) {
        if (!people.isEmpty()) {
            Person oldest = people.get(0);
            for (int i = 0; i < people.size(); i++) {
                if (oldest.getAge() < people.get(i).getAge()) {
                    oldest = people.get(i);
                }
            }
            return Optional.of(oldest);
        }
        return Optional.empty();
    }

    public static Optional<Person> getOldestPerson(List<Person> people) {
        return people.stream().max(Comparator.comparing(person -> person.getAge()));
    }

}
