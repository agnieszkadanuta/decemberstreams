package pl.dominisz.decemberstreams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static pl.dominisz.decemberstreams.Joining.namesToString;
import static pl.dominisz.decemberstreams.Joining.namesToString7;

/*
Return people names separated by comma
 */
public class JoiningTest {

    @Test
    public void toStringShouldReturnPeopleNamesSeparatedByComma() {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> collection = asList(sara, viktor, eva);
        assertEquals("Names: Sara, Viktor, Eva.", namesToString7(collection));
        assertEquals("Names: Sara, Viktor, Eva.", namesToString(collection));
    }

}
