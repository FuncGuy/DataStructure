import SinglyLinkedList.LinkedList;

public class DeleteGivenNode {

    private static void deleteNode(LinkedList.Node node) {
        LinkedList.Node temp = node.next;
        node.data = temp.data;
        node.next = temp.next;
    }



    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        LinkedList.Node node4 = new LinkedList.Node(4);
        linkedList.head = new LinkedList.Node(1);
        LinkedList.Node node2 = new LinkedList.Node(2);
        linkedList.head.next = node2;
        linkedList.head.next.next = new LinkedList.Node(3);
        linkedList.head.next.next.next = node4;
        linkedList.head.next.next.next.next = new LinkedList.Node(5);

        System.out.println("Before deleting");
        System.out.println();
        linkedList.display();

        deleteNode(node2);
        System.out.println("After deleting");
        linkedList.display();

    }
}
