package generic.ex3;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Animal> animalHospital = new AnimalHospitalV3<>();

//        AnimalHospitalV3<Integer> integerHospital = new AnimalHospitalV3<>();
        // 온갖 타입을 제네릭 타입 매개변수로 들어옴
        
        Cat cat = new Cat("고양이1", 10);
        Dog dog = new Dog("강아지1", 20);

        animalHospital.set(cat);
        animalHospital.checkup();
        Dog biggerDog1 = (Dog) animalHospital.bigger(new Dog("강아지3", 100));
        System.out.println(biggerDog1);

        dogHospital.set(dog);
        dogHospital.checkup();

        catHospital.set(cat);
        catHospital.checkup();

        Dog biggerDog = dogHospital.bigger(new Dog("강아지2", 50));
        System.out.println(biggerDog);
    }
}
