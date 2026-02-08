package generic.test.ex3;

public class UnitUtilTest {
    public static void main(String[] args) {
        Marine m1 = new Marine("마린1", 100);
        Marine m2 = new Marine("마린1", 200);

        Marine biggerMarine = UnitUtil.maxHp(m1, m2);

        System.out.println(biggerMarine);
    }
}
