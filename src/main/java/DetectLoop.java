import SinglyLinkedList.LinkedList;

public class DetectLoop {

    private static boolean findloop(LinkedList linkedList){
        LinkedList.Node p = linkedList.head;
        LinkedList.Node q = linkedList.head;
        while (p!=null && q!=null && q.next!=null){
            p=p.next;
            q=q.next.next;
            if(p==q){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        LinkedList.Node head = new LinkedList.Node(1);
        LinkedList.Node node1 = new LinkedList.Node(2);
        LinkedList.Node node2 = new LinkedList.Node(3);
        LinkedList.Node node3 = new LinkedList.Node(4);
        LinkedList.Node node4 = new LinkedList.Node(5);

        node4.next = node1;

        linkedList.head = head;
        linkedList.head.next = node1;
        linkedList.head.next.next = node2;
        linkedList.head.next.next.next = node3;
        linkedList.head.next.next.next.next = node4;

        System.out.println(findloop(linkedList));

    }


}
