package pl.dominisz.decemberstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterCollection {

    public static List<String> transform7(List<String> collection) {
        List<String> newCollection = new ArrayList<>();
        for (String elements : collection) {
            if(elements.length() < 4){
                newCollection.add(elements);
            }
        }
        return newCollection;
    }

    public static List<String> transform(List<String> collection) {
        return collection.stream().filter(s -> s.length() < 4).collect(Collectors.toList());
    }

}
