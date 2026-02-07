package generic.ex3;

public class AnimalHospitalV1 <T> {
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    // Object 클래스로 간주해서 .equals(), .toString() 만 사용가능
    public void checkup() {
//        System.out.println("동물 이름: " + animal.getName());
//        System.out.println("동물 크기: " + animal.getSize());
        animal.equals(null);
        animal.toString();
    }

    public T bigger(T target) {
//        return animal.getSize() > target.getSize() ? animal : target;
        return null;
    }
}
