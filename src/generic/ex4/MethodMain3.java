package generic.ex4;

import generic.ex3.Cat;
import generic.ex3.Dog;

public class MethodMain3 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이1", 20);
        Cat cat = new Cat("고양이1", 30);

        ComplexBox<Dog> hospital = new ComplexBox<>();
        hospital.set(dog);

        Cat returnCat = hospital.printAndReturn(cat);
        System.out.println(returnCat);
    }
}
