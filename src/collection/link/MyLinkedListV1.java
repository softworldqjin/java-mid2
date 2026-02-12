package collection.link;

public class MyLinkedListV1 {
    private Node first;
    private int size = 0;

    public void add(Object e) {
        Node newNode = new Node(e);

        if (first == null) {
            first = new Node(e);
        } else {
            Node lastNode = getLastNode();
            lastNode.next = new Node(e);
        }
        size++;
    }

    public int indexOf(Object o) {
        int index = 0;
        for (Node x = first; x != null; x = x.next) {
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

    public Object get(int index) {
        Node x = getNode(index);
        return x;
    }

    public Object set(int index, Object element) {
        Node x = getNode(index);
        Object oldValue = x.item;
        x.item = element;
        return oldValue;
    }

    public Node getNode(int index) {
        Node x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }
    private Node getLastNode() {
        Node x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}
