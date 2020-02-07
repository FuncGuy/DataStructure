import SinglyLinkedList.LinkedList;

public class DeleteGivenNode {
    
   // it is just simpple
   // for a given node which is to be deleted get its next node and store it in temp node 
   // override the node data with temp data that is copying the node's next value into node data
   // make the pointer of node point to the next of temp 

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
