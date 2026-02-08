package generic.ex4;

import generic.ex3.Cat;
import generic.ex3.Dog;

public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 20);
        Cat cat = new Cat("고양이", 10);
        AnimalMethod.checkup(dog);
        AnimalMethod.checkup(cat);

        Dog dog1 = AnimalMethod.bigger(dog, new Dog("멍멍이3", 50));
        System.out.println(dog1);
    }
}
