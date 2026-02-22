package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        studentMap.put("studentA", 90);
        System.out.println(studentMap);


        boolean containsKey = studentMap.containsKey("studentA");
        System.out.println("containsKey = " + containsKey);

        if (!studentMap.containsKey("studentA")) {
            studentMap.put("studentA", 100);
        }

        System.out.println(studentMap);

        studentMap.putIfAbsent("studentA", 100);
        studentMap.putIfAbsent("studentB", 200);

        System.out.println(studentMap);

    }
}
