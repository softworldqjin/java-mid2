package collection.map.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        String[] array = text.split(" ");

        Map<String, Integer> map = new HashMap<>();
        for (String a : array) {
            Integer count = map.get(a);
            if (count == null) {
                count = 0;
            }
            count++;
            map.put(a, count);
        }

        System.out.println(map);
    }
}
