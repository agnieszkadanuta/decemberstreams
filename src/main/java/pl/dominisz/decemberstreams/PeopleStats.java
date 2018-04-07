package pl.dominisz.decemberstreams;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.stream.Collectors;

public class PeopleStats {

    public static Stats getStats7(List<Person> people) {

        long count  = people.size();
        long sum = 0;
        int min = 150;
        int max = 0;
        for (int i = 0; i < people.size(); i++) {
            sum += people.get(i).getAge();
            if(people.get(i).getAge() < min){
            min = people.get(i).getAge();}
            if(people.get(i).getAge() > max){
                max = people.get(i).getAge();
            }
        }
        return new Stats(count, sum, min, max);
    }

    public static IntSummaryStatistics getStats(List<Person> people) {

        IntSummaryStatistics statistics = people.stream().collect(Collectors.summarizingInt(Person::getAge));

        return statistics;
    }

}
