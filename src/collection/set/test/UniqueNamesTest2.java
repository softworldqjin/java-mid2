package collection.set.test;

import java.util.Set;
import java.util.LinkedHashSet;
import java.util.List;

public class UniqueNamesTest2 {
    public static void main(String[] args) {
//
//        new HashSet<>(list);        // 중복 제거
//        new LinkedHashSet<>(list); // 중복 제거 + 순서 유지
//        new TreeSet<>(list);       // 중복 제거 + 정렬

        Integer[] inputArr = {30, 20, 20, 10, 10};
        Set<Integer> set = new LinkedHashSet<>(List.of(inputArr));

        for (Integer i : set) {
            System.out.println(i);
        }
    }
}
