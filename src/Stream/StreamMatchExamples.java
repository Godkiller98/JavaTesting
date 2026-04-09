package Stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMatchExamples {

    public static void main(String[] args) {
        int[] arr2 = {1, 2, 3, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.stream(arr2).boxed().collect(Collectors.groupingBy(n -> n, Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + " " + v));
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for (int n1 : arr2) {
            map1.put(n1, map1.getOrDefault(n1, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
