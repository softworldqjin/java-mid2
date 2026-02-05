package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<>(); // 생성 시점에 T의 타입 결정
        integerBox.set(30);
        Integer integer = integerBox.get();
        System.out.println(integer);

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.set("30");
        String string = stringBox.get();
        System.out.println(string);
    }
}
