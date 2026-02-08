package generic.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);
        Integer integer = (Integer) GenericMethod.objMethod(i);

        // 타입인자 (Type Argument 명시적 전달)
        System.out.println("명시적 타입 인자 전달");
        Integer integer1 = GenericMethod.<Integer>genericMethod(i);
        System.out.println(integer1);

        Integer integer2 = GenericMethod.<Integer>numberMethod(i);
        System.out.println(integer2);
        Double aDouble = GenericMethod.<Double>numberMethod(3.14);

        Integer integer3 = GenericMethod.numberMethod(i);
        System.out.println(integer3);
        Double aDouble1 = GenericMethod.numberMethod(3.14);
    }
}
