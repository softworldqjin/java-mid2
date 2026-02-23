package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CommonKeyValueSum1 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2, "C", 3);
//        map1.put("M", 20); // 예외 발생, Map.of()로 반환한 Map타입 map1은 불변객체이다

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 1);
        map2.put("C", 2);
        map2.put("D", 3);

        Map<String, Integer> result = new HashMap<>();

        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) {
                result.put(key, map1.get(key) + map2.get(key));
            }
        }

        System.out.println(result);

    }
}
