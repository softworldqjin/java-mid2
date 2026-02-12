package collection.link;

public class MyLinkedListV3Main {
    public static void main(String[] args) {
        MyLinkedListV3<Integer> intList = new MyLinkedListV3<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        System.out.println(intList);

        Integer integer = intList.set(1, 100);
        System.out.println("integer=" + integer);

        int index = intList.indexOf(1);
        System.out.println("index=" + index);
        System.out.println(intList);

        intList.add(1, 200);
        System.out.println(intList);

        intList.remove(1);
        System.out.println(intList);
    }
}
