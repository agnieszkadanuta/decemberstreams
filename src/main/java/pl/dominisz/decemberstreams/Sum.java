package pl.dominisz.decemberstreams;

import java.util.List;

public class Sum {

    public static int calculate7(List<Integer> numbers) {

        int sum = 0;
        for (int i = 0; i < numbers.size() ; i++) {
            sum += numbers.get(i);
        }
        return sum;
    }

    public static int calculate(List<Integer> numbers) {

        return numbers.stream().mapToInt(number -> number.intValue()).sum();

    }

}
