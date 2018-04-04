package pl.dominisz.decemberstreams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static pl.dominisz.decemberstreams.FlatCollection.transform;
import static pl.dominisz.decemberstreams.FlatCollection.transform7;

/*
Flatten multidimensional collection
 */
public class FlatCollectionTest {

    @Test
    public void transformShouldFlattenCollection() {
        List<List<String>> collection = asList(asList("Viktor", "Farcic"), asList("John", "Doe", "Third"));
        List<String> expected = asList("Viktor", "Farcic", "John", "Doe", "Third");
        assertEquals(expected, transform(collection));
        assertEquals(expected, transform7(collection));
    }

}
