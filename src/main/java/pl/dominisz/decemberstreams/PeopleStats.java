package pl.dominisz.decemberstreams;

import java.util.IntSummaryStatistics;
import java.util.List;

public class PeopleStats {

    public static Stats getStats7(List<Person> people) {
        return new Stats(0, 0, 0, 0);
    }

    public static IntSummaryStatistics getStats(List<Person> people) {
        return new IntSummaryStatistics();
    }

}
