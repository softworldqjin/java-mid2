package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {
    static final int CAPACITY = 15;

    public static void main(String[] args) {
        // {1, 2, 5, 8, 14, 99}
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];
        for (int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<Integer>();
        }
        System.out.println(Arrays.toString(buckets));


        add(buckets, 1);
        add(buckets, 2);
        add(buckets, 5);
        add(buckets, 8);
        add(buckets, 14);
        add(buckets, 99);
        add(buckets, 9);
        System.out.println(Arrays.toString(buckets));

        int searchValue = 9;
        boolean result = contains(buckets, searchValue);
        System.out.println("buckets(9): " + result);
    }

    private static boolean contains(LinkedList<Integer>[] buckets, int searchValue) {
        int hashIndex = hasIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);
//        for (Integer integer : bucket) {
//            if (integer == searchValue) {
//                return true;
//            }
//        }
//        return false;
    }
    private static void add(LinkedList<Integer>[] buckets, int value) {
        int hasIndex = hasIndex(value);
        LinkedList<Integer> bucket = buckets[hasIndex];
        if (!bucket.contains(value)) { // O(n)
            bucket.add(value);
        }
    }

    static int hasIndex(int value) {
        return value % CAPACITY;
    }


}
