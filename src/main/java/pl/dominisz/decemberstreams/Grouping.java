package pl.dominisz.decemberstreams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {

    public static Map<String, List<Person>> groupByNationality7(List<Person> people) {
        Map<String, List<Person>> listByNationality = new HashMap<>();

        for (Person person : people) {
            String nationality = person.getNationality();
            List<Person> citizens = listByNationality.get(nationality);

            if (citizens == null) {
                citizens = new ArrayList<>();
                listByNationality.put(nationality, citizens);
            }
            citizens.add(person);
        }
            return listByNationality;
        }

        public static Map<String, List<Person>> groupByNationality (List < Person > people) {
            return people.stream().collect(Collectors.groupingBy(Person::getNationality));
        }

    }

