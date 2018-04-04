package pl.dominisz.decemberstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatCollection {

    public static List<String> transform7(List<List<String>> collection) {
        List<String> multiList = new ArrayList<>();
        for (List<String> list: collection) {
            multiList.addAll(list);
        }
        return multiList;
    }

    public static List<String> transform(List<List<String>> collection) {
        List<String> multiList = new ArrayList<>();

        return collection.stream().flatMap(list-> list.stream()).collect(Collectors.toList());

    }

}
