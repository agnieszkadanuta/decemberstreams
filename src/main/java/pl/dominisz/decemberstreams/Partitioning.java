package pl.dominisz.decemberstreams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Partitioning {

    public static Map<Boolean, List<Person>> partitionAdults7(List<Person> people) {
        Map<Boolean, List<Person>> map = new HashMap<>();
        for (Person person:people) {
            boolean ifAdult = person.getAge() > 18;
            List<Person> list = map.get(ifAdult);

            if(list == null){
                list = new ArrayList<>();
                map.put(ifAdult, list);
            }
            list.add(person);
        }
        return map;
    }


    public static Map<Boolean, List<Person>> partitionAdults(List<Person> people) {
    return people.stream().collect(Collectors.partitioningBy(p -> p.getAge() > 18));
    }
}

