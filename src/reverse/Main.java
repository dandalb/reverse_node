package reverse;

import java.util.List;

public class Main {
    private static void reverse(Node node) {
        Node startNode = node;
        Node prevNode = null;
        Node nextNode;
        while (startNode != null) {
            nextNode = startNode.next;
            startNode.next = prevNode;
            prevNode = startNode;
            startNode = nextNode;
        }
    }

    public static void main(String[] args) {
        Node sixth = new Node(6, null);
        Node fifth = new Node(5, sixth);
        Node fourth = new Node(4, fifth);
        Node third = new Node(3, fourth);
        Node second = new Node(2, third);
        Node first = new Node(1, second);
        reverse(first);
        List<Node> nodeList = List.of(sixth, fifth, fourth, third, second, first);
        nodeList.forEach(System.out::println);
    }
}
