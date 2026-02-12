package collection.link;

public class MyLinkedListV3<E> {
    private Node<E> first;
    private int size = 0;

    public void add(E e) {
        Node<E> newNode = new Node<>(e);

        if (first == null) {
            first = newNode;
        } else {
            Node<E> lastNode = getLastNode();
            lastNode.next = new Node<>(e);
        }
        size++;
    }

    public int indexOf(E o) {
        int index = 0;
        for (Node<E> x = first; x != null; x = x.next) {
            if (x.item.equals(o)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public int size() {
        return size;
    }

    public Node<E> get(int index) {
        Node<E> x = getNode(index);
        return x;
    }

    public E set(int index, E element) {
        Node<E> x = getNode(index);
        E oldValue = x.item;
        x.item = element;
        return oldValue;
    }

    private Node<E> getNode(int index) {
        Node<E> x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    private Node<E> getLastNode() {
        Node<E> x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    public void add(int index, E o) {
        Node<E> newNode = new Node<>(o);

        if (first == null) {
            first = newNode;
        } else if (index == 0) {
            newNode.next = first.next;
            first = newNode;
        } else {
            Node<E> preNode = getNode(index - 1);
            newNode.next = preNode.next;
            preNode.next = newNode;
        }
        size++;
    }

    public E remove(int index) {
        Node<E> removeNode = getNode(index);
        E removedItem = removeNode.item;

        if (index == 0) {
            first = removeNode.next;
        } else {
            Node<E> preNode = getNode(index - 1);
            preNode.next = removeNode.next;
        }
        removeNode.item = null;
        removeNode.next = null;

        return removedItem;
    }
    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }

    private static class Node<E> {
        E item;
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");

            Node<E> x = this;

            while (x != null) {
                sb.append(x.item);
                if (x.next != null) {
                    sb.append("->");
                }
                x = x.next;

            }
            sb.append("]");
            return sb.toString();
        }
    }
}
