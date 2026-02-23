package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Cart {
    private Map<Product, Integer> cartMap = new HashMap<>();

    public void add(Product product, Integer count) {

        Integer value = cartMap.getOrDefault(product, 0);
        value += count;

        cartMap.put(product, value);
    }

    public void printAll() {
        System.out.println("모든 상품 출력");
        Set<Map.Entry<Product, Integer>> entries = cartMap.entrySet();
        for (Map.Entry<Product, Integer> entry : entries) {
            Product p = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("상품: " + p + " 수량: " + value);
        }
    }

    public void minus(Product product, Integer count) {
        Integer value = cartMap.getOrDefault(product, 0);
        value -= count;
        if (value <= 0) {
            cartMap.remove(product);
        } else {
            cartMap.put(product, value);
        }
    }
}
