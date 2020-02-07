import SinglyLinkedList.LinkedList;

public class FindMidInLinkedList {

    private static void findMiddle(LinkedList linkedList){

        LinkedList.Node fst_ptr = linkedList.head;
        LinkedList.Node slw_ptr = linkedList.head;

        while (slw_ptr != null && fst_ptr.next != null){
            fst_ptr = fst_ptr.next.next;
            slw_ptr = slw_ptr.next;
        }

        System.out.println("Mid of a linked list is " + slw_ptr.data);
    }

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        LinkedList.Node head = new LinkedList.Node(1);
        LinkedList.Node node1 = new LinkedList.Node(2);
        LinkedList.Node node2 = new LinkedList.Node(3);
        LinkedList.Node node3 = new LinkedList.Node(4);
        LinkedList.Node node4 = new LinkedList.Node(5);

        linkedList.head = head;
        linkedList.head.next = node1;
        linkedList.head.next.next = node2;
        linkedList.head.next.next.next = node3;
        linkedList.head.next.next.next.next = node4;

        findMiddle(linkedList);
    }
}
