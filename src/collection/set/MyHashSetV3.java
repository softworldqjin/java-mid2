package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV3<E> implements MySet<E> {
    static final int DEFAULT_INITIAL_CAPACITY = 10;

    private LinkedList<E>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV3() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public MyHashSetV3(int capacity) {
        this.capacity = capacity;
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(E value) {
        int index = hashIndex(value);
        LinkedList<E> bucket = buckets[index];
        if (bucket.contains(value)) {   // E 클래스에서 equals() 오버라이딩 안해놓으면,
                                        // == 비교함, 그러면 참조값 다 다르니까 걍 넣음
                                        // equals() 오버라이딩 해놓으면 인스턴스에 저장된 값 비교해서 중복되면 안넣음
            return false;
        }
        bucket.add(value);
        size++;
        return true;
    }
    public int hashIndex(E value) {
        int hashCode = value.hashCode();                // E 클래스에서 hashCode() 오버라이딩 안해놓으면,
                                                        // 객체 참조값으로 hashCode() 호출하는데, 참조값으로 Object.hashCode()호출
                                                        // 0x111.hashCode() 0x222.hashCode()
                                                        // hashCode() 오버라이딩 해놓으면, 인스턴스 변수로 Objects.hashCode()호출
                                                        // hashCode(10, 20) hashCode(10, 20)
        int hashIndex = Math.abs(hashCode) % capacity;

        return hashIndex;
    }

    public boolean contains(E searchValue) {
        int index = hashIndex(searchValue);
        LinkedList<E> bucket = buckets[index];

        return bucket.contains(searchValue);
    }

    public boolean remove(E value) {
        int index = hashIndex(value);
        LinkedList<E> bucket = buckets[index];
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
        return "MyHashSetV3{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
