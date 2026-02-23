package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest2 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        String[] array = text.split(" ");
        Map<String, Integer> map = new HashMap<>();

        for (String a : array) {
            Integer value = map.getOrDefault(a, 0);
            value++;
            map.put(a, value);
        }

        System.out.println(map);
    }
}
