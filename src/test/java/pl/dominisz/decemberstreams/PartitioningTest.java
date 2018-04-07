package pl.dominisz.decemberstreams;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static pl.dominisz.decemberstreams.Partitioning.partitionAdults;
import static pl.dominisz.decemberstreams.Partitioning.partitionAdults7;

/*
Partition adults and kids
 */
public class PartitioningTest {

    @Test
    public void partitionAdultsShouldSeparateKidsFromAdults() {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> collection = asList(sara, eva, viktor);
        Map<Boolean, List<Person>> result = partitionAdults7(collection);
        assertEquals(asList(eva, viktor), result.get(true));
        assertEquals(asList(sara), result.get(false));
    }

}
