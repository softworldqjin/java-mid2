package generic.test.ex3;

public class ShuttleTest {
    public static void main(String[] args) {

        Shuttle<Marine> shuttle1 = new Shuttle<>();

        shuttle1.in(new Marine("마린1", 200));
        shuttle1.showInfo();
    }
}
