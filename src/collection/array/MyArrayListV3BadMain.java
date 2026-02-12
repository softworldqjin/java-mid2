package collection.array;

public class MyArrayListV3BadMain {
    public static void main(String[] args) {
        MyArrayListV2 numberList = new MyArrayListV2();

        numberList.add(1);
        numberList.add(2);
        numberList.add("문자");
        System.out.println(numberList);

        Integer num1 = (Integer) numberList.get(0);
        Integer num2 = (Integer) numberList.get(1);

//        Integer num3 = (Integer) numberList.get(2);
        // 잘못된 다운캐스팅은 런타임에러에서 잡을수있음
    }
}
