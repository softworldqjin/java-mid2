package collection.list.test.ex2;

import java.util.List;
import java.util.ArrayList;

public class ShoppingCart {
    private List<Item> itemList = new ArrayList<>();

    public void addItem(Item item) {
        itemList.add(item);
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        int sum = 0;

        for (Item item : itemList) { // itemList 인스턴스에 저장된 Item 인스턴스 하나씩 꺼냄
            System.out.println("상품명: " + item.getName() + ", 합계: "
            + item.getTotalPrice());
            sum += item.getTotalPrice();
        }

        System.out.println("전체 가격 합: " + sum);
    }

}
