package collection.array;

public class MyArrayList4Main {
    public static void main(String[] args) {
        MyArrayListV4<String> stringList = new MyArrayListV4<>();
//        stringList.add(10);
        // 제네릭 타입으로 String을 선택했기 때문에 다른 타입이 들어갈 수 없는 모습

        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        String string = stringList.get(0);
        System.out.println("string=" + string);

        MyArrayListV4<Integer> intList = new MyArrayListV4<>();
//        integerList.add("100");
        // 제네릭 타입으로 Integer를 선택했기 때문에 다른 타입이 들어갈 수 없는 모습
        intList.add(1); // Integer e = 1 -> 오토박싱 Integer e = Integer.valueOf(1);
        intList.add(2);
        intList.add(3);
        Integer integer = intList.get(0);
        System.out.println("integer=" + integer);
    }
}
