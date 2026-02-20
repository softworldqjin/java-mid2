package collection.set.test;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;

public class SetOperationsTest {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("합집합: " + union);

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2); // 겹치는애 말고 나머지 모두 remove, 안겹치는거 remove
        System.out.println("교집합: " + intersection);

        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2); // set1 - set2
        System.out.println("차집합: " + difference);

    }
}
