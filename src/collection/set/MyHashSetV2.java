package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV2 {
    static final int DEFAULT_INITIAL_CAPACITY = 10;

    private LinkedList<Object>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV2() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public MyHashSetV2(int capacity) {
        this.capacity = capacity;
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(Object value) {
        int index = hashIndex(value);
        LinkedList<Object> bucket = buckets[index];
        if (bucket.contains(value)) {
            return false;
        }
        bucket.add(value);
        size++;
        return true;
    }
    public int hashIndex(Object  value) {
        int hashCode = value.hashCode();
        int hashIndex = Math.abs(hashCode) % capacity;

        return hashIndex;
    }

    public boolean contains(Object searchValue) {
        int index = hashIndex(searchValue);
        LinkedList<Object> bucket = buckets[index];

        return bucket.contains(searchValue);
    }

    public boolean remove(Object value) {
        int index = hashIndex(value);
        LinkedList<Object> bucket = buckets[index];
        boolean result = bucket.remove(value);
        if (result) {
            size--;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "MyHashSetV2{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
