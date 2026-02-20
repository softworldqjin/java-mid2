package collection.set.javaset;

import java.util.*;

public class JavaSetMain {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();              // 순서 X 중복 X
        Set<String> linkedHashSet = new LinkedHashSet<>();  // 입력한 순서대로 중복 X head, tail, 노드간 서로 연결되어있음
        Set<String> treeSet = new TreeSet<>();              // 순서대로 중복 X

        run(hashSet);
        run(linkedHashSet);
        run(treeSet);
    }

    private static void run(Set<String> set) {
        System.out.println("set = " + set.getClass());
        set.add("C");
        set.add("A");
        set.add("B");
        set.add("1");
        set.add("2");
        set.add("a");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
