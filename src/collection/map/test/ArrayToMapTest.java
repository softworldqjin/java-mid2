package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] productArr = {{"Java", "1000"}, {"Spring", "20000"}, {"JPA", "30000"}};
        Map<String, Integer> map = new HashMap<>();
        for (String[] p : productArr) {
            map.put(p[0], Integer.parseInt(p[1]));
        }

        for (String key : map.keySet()) {
            System.out.println("제품: " + key + ", 가격: " + map.get(key));
        }
    }
}
