package generic.ex3;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        AnimalHospitalV0 catHospital = new AnimalHospitalV0();
        AnimalHospitalV0 dogHospital = new AnimalHospitalV0();

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
