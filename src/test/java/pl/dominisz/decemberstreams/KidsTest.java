package pl.dominisz.decemberstreams;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static pl.dominisz.decemberstreams.Kids.getKidNames;
import static pl.dominisz.decemberstreams.Kids.getKidNames7;

/*
Get names of all kids (under age of 18)
 */
public class KidsTest {

    @Test
    public void getKidNameShouldReturnNamesOfAllKids() {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        Person anna = new Person("Anna", 5);
        List<Person> collection = asList(sara, eva, viktor, anna);
        Set<String> result = getKidNames7(collection);
        assertTrue(result.contains("Sara"));
        assertTrue(result.contains("Anna"));
        assertFalse(result.contains("Viktor"));
        assertFalse(result.contains("Eva"));

        Set<String> result2 = getKidNames(collection);
        assertTrue(result2.contains("Sara"));
        assertTrue(result2.contains("Anna"));
        assertFalse(result2.contains("Viktor"));
        assertFalse(result2.contains("Eva"));
    }

}
