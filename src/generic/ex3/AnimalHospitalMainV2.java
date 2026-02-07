package generic.ex3;

public class AnimalHospitalMainV2 {
    public static void main(String[] args) {
        AnimalHospitalV1<Cat> catHospital = new AnimalHospitalV1<>();
        AnimalHospitalV1<Dog> dogHospital = new AnimalHospitalV1<>();
        AnimalHospitalV1<Integer> integerHospital = new AnimalHospitalV1<>();
        // 온갖 타입을 제네릭 타입 매개변수로 들어옴

        Cat cat = new Cat("고양이1", 10);
        Dog dog = new Dog("강아지1", 20);

        dogHospital.set(dog);
        dogHospital.checkup();

        catHospital.set(cat);
        catHospital.checkup();

        Dog biggerDog = (Dog) dogHospital.bigger(new Dog("강아지2", 50));
        System.out.println(biggerDog);
    }
}
