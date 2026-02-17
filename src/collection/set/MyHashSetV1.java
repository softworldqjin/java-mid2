package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV1 {
    static final int DEFAULT_INITIAL_CAPACITY = 10;

    LinkedList<Integer>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV1() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public MyHashSetV1(int capacity) {
        this.capacity = capacity;
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(int value) {
        int index = hasIndex(value);
        LinkedList<Integer> bucket = buckets[index];
        if (bucket.contains(value)) {
            return false;
        }
        bucket.add(value);
        size++;
        return true;
    }
    public int hasIndex(int value) {
        return value % capacity;
    }

    public boolean contains(int searchValue) {
        int index = hasIndex(searchValue);
        LinkedList<Integer> bucket = buckets[index];

        return bucket.contains(searchValue);
    }

    public boolean remove(int value) {
        int index = hasIndex(value);
        LinkedList<Integer> bucket = buckets[index];
        boolean result = bucket.remove(Integer.valueOf(value));
        if (result) {
            size--;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "MyHashSetV1{" +
                "buckets=" + Arrays.toString(buckets) +
                '}';
    }
}
