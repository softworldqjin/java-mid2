package collection.map;

import java.util.*;

public class JavaMapMain {
    public static void main(String[] args) {
        run(new HashMap<>());
        System.out.println();

        run(new LinkedHashMap<>());
        System.out.println();

        run(new TreeMap<>());
        System.out.println();
    }

    private static void run(Map<String, Integer> map) {
        System.out.println("map = " + map);
        map.put("C", 10);
        map.put("B", 10);
        map.put("A", 10);
        map.put("1", 10);
        map.put("2", 10);

        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Integer value = map.get(key);
            System.out.println("key = " + key + ", value = " + value);
        }
    }
}
