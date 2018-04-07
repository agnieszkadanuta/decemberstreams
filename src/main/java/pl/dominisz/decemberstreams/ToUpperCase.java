package pl.dominisz.decemberstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ToUpperCase {

    public static List<String> transform7(List<String> collection) {

        String s = "";
        List<String> newcollection = new ArrayList<>();
        for (int i = 0; i < collection.size(); i++) {
            s = collection.get(i).toUpperCase();
            newcollection.add(s);
        }

        return newcollection;
    }

    public static List<String> transform(List<String> collection) {
        return collection.stream().map(element -> element.toUpperCase()).collect(Collectors.toList());
    }

}
