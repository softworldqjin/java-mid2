package collection.link;

public class NodeMain3 {
    public static void main(String[] args) {
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println(first);

        // 모든 노드 탐색
        Node lastNode = getLastNode(first);
        System.out.println("lastNode = " + lastNode);

        // 특정 index의 노드 조회
        int index = 2;
        Node index2Node = getNode(first, index);
        System.out.println("index2Node = " + index2Node.item);

        // 데이터 추가하기
        System.out.println("데이터 추가하기");
        add(first, "D");
        add(first, "E");
        add(first, "F");
        System.out.println(first);

        printAll(first);
    }

    public static void printAll(Node node) {
        Node x = node;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }
    }
    public static void add(Node firstNode, Object data) {
        Node x = getLastNode(firstNode);
        x.next = new Node(data);
    }

    public static Node getLastNode(Node firstNode) {
        Node x = firstNode;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    public static Node getNode(Node firstNode, int index) {
        Node x = firstNode;

        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }
}
