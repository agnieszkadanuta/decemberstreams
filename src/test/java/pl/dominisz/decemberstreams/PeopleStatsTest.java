package pl.dominisz.decemberstreams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static pl.dominisz.decemberstreams.PeopleStats.getStats;

/*
Get people statistics: average age, count, maximum age, minimum age and sum og all ages.
 */
public class PeopleStatsTest {

    Person sara = new Person("Sara", 4);
    Person viktor = new Person("Viktor", 40);
    Person eva = new Person("Eva", 42);
    List<Person> collection = asList(sara, eva, viktor);

    @Test
    public void getStatsShouldReturnAverageAge() {
        assertEquals(getStats(collection).getAverage(),(double)(4 + 40 + 42) / 3, 0.001);
    }

    @Test
    public void getStatsShouldReturnNumberOfPeople() {
        assertTrue(getStats(collection).getCount() == 3);
    }

    @Test
    public void getStatsShouldReturnMaximumAge() {
        assertTrue(getStats(collection).getMax() == 42);
    }

    @Test
    public void getStatsShouldReturnMinimumAge() {
        assertTrue(getStats(collection).getMin() == 4);
    }

    @Test
    public void getStatsShouldReturnSumOfAllAges() {
        assertTrue(getStats(collection).getSum() == 40 + 42 + 4);
    }

}
