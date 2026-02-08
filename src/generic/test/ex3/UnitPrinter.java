package generic.test.ex3;

public class UnitPrinter {
    public static <T extends BioUnit> void printV1(Shuttle<T> shuttle) {
        T unit = shuttle.out();
        System.out.println(unit.getName() + ", " + unit.getHp());
    }

    public static void printV2(Shuttle<? extends BioUnit> shuttle) {
        BioUnit unit = shuttle.out();
        System.out.println(unit.getName() + ", " + unit.getHp());
    }
}
