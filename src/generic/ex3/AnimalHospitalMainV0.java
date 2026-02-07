package generic.ex3;

public class AnimalHospitalMainV0 {
    public static void main(String[] args) {
        CatHospital catHospital = new CatHospital();
        DogHospital dogHospital = new DogHospital();

        Cat cat = new Cat("고양이1", 10);
        Dog dog = new Dog("강아지1", 20);

        catHospital.set(cat);
        catHospital.checkup();

        dogHospital.set(dog);
        dogHospital.checkup();

        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 50));
        System.out.println(biggerDog);
    }
}
