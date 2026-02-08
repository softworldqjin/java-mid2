package generic.ex5;

import generic.ex3.Animal;
import generic.ex3.Cat;
import generic.ex3.Dog;

public class WildcardMain2 {
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        writeBox(objBox);
        writeBox(animalBox);
//        writeBox(dogBox);
    }

    static void writeBox(Box<? super Animal> box) { // Animal이상 타입
        box.set(new Dog("멍멍이", 100));
    }
}
