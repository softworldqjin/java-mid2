package collection.array;

import java.util.Arrays;

public class MyArrayListV4<E> {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV4() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV4(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public void add(E e) {
        // 코드 추가
        if (size == elementData.length) {
            grow();
        }
        elementData[size] = e;
        size++;
    }

    public void add(int index, E e) {
        if (size == elementData.length) {
            grow();     // 새로운 배열 생성하고 기존 배열 복붙한다음에, elementData에 새로운 배열 참조값 저장
                        // 기존 배열은 아무도 참조하지 않기 때문에, GC 삭제
        }
        shiftRightFrom(index);
        elementData[index] = e;
        size++;
    }

    private void shiftRightFrom(int index) {
        for (int i = size; i > index; i--) {
//            elementData[i + 1] = elementData[i];
            // 0 1 2 3 4, 5번 인덱스에 4번 인덱스 값 저장, 4번 인덱스에 3번 인덱스 값 저장해야 됨
            // 맨 끝부터 저장하는 순서로 해야됨
            // 만약 왼쪽부터 저장하는 순서로 하게되면 원래 인덱스에 있던 값이 보존이 안됨
            // 3번 인덱스에 2번 인덱스 값을 저장하면, 4번 인덱스에 3번 인덱스 값을 저장하게 될텐데
            // 그럼 3번 인덱스부터 2번 인덱스값으로 싹다 같은 값으로 됨
            elementData[i] = elementData[i - 1];
        }
    }
    public void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
//
//        Object[] newArr = new Object[newCapacity];
//
//        for (int i = 0; i < elementData.length; i++) {
//            newArr[i] = elementData[i];
//        }

        // Arrays.copyOf(기존배열, 새로운 길이); 새로운 길이의 배열 생성 후 기존배열 북붙
        Object[] newArr =  Arrays.copyOf(elementData, newCapacity); // newCapacity 길이의 배열 만들고, elementData 복붙

        elementData = newArr;

    }

    public E remove(int index) {
        E oldValue = get(index);
        shiftLeftFrom(index);
        size--;
        elementData[size] = null;
        return oldValue;
    }

    public void shiftLeftFrom(int index) {
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
    }
    public int size() {
        return size;
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        return (E) elementData[index];
    }

    public E set(int index, E e) {
        E oldValue = get(index);
        elementData[index] = e;
        return oldValue;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (elementData[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size)) + " size=" + size + " capacity=" + elementData.length;
    }
}
