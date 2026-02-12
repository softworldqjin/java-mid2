package collection.link;

public class MyLinkedListV2Main {
    public static void main(String[] args) {
        MyLinkedListV2 list = new MyLinkedListV2();
        list.add("a");
        list.add("b");
        list.add("c");

        System.out.println(list);

        list.add(1, "hello");
        System.out.println(list);

        list.remove(1);
        System.out.println(list);
    }
}
