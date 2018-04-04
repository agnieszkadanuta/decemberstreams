package pl.dominisz.decemberstreams;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static pl.dominisz.decemberstreams.Grouping.groupByNationality;
import static pl.dominisz.decemberstreams.Grouping.groupByNationality7;

/*
Group people by nationality
 */
public class GroupingTest {

    @Test
    public void groupByNationalityShouldSeparateDifferentNationalities() {
        Person sara = new Person("Sara", 4, "Norwegian");
        Person viktor = new Person("Viktor", 40, "Serbian");
        Person eva = new Person("Eva", 42, "Norwegian");
        List<Person> collection = asList(sara, eva, viktor);
        Map<String, List<Person>> result = groupByNationality7(collection);
        assertEquals(asList(sara, eva), result.get("Norwegian"));
        assertEquals(asList(viktor), result.get("Serbian"));

        Map<String, List<Person>> result2 = groupByNationality(collection);
        assertEquals(asList(sara, eva), result2.get("Norwegian"));
        assertEquals(asList(viktor), result2.get("Serbian"));
    }

}
