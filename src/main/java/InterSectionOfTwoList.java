import SinglyLinkedList.LinkedList;

public class InterSectionOfTwoList {

    private static int findTheInterSection(LinkedList linkedList1, LinkedList linkedList2) {

        // 1) find the length of both the linked list
        // 2) find the difference (d) from the above lengths i.e (int d = len1 - len2)
        // 3) move the longer linked list by 'd'
        // 4) traverse both the linked list and stop whenever the data matches in both linked list.

        int length1 = 0;
        int length2 = 0;

        LinkedList.Node temp = linkedList1.head;
        LinkedList.Node temp2 = linkedList2.head;

        while(temp != null){
            length1 += 1;
            temp = temp.next;
        }

        while (temp2 != null){
            length2 += 1;
            temp2 = temp2.next;
        }

        int d = length1 - length2;

        LinkedList.Node temp3 = linkedList1.head;

        for(int i = 0; i <= d - 1; i++){
            temp3 = temp3.next;
        }

        LinkedList.Node temp6 = linkedList2.head;

       while (temp3.next != null && temp6.next !=null){
           if(temp3.data == temp6.data){
               System.out.println("found match");
               return temp3.data;
           }
           temp3 = temp3.next;
           temp6 = temp6.next;

       }

        return length1;
    }


    public static void main(String[] args) {

        LinkedList linkedList1 = new LinkedList();

        LinkedList.Node head1 = new LinkedList.Node(1);
        LinkedList.Node node2 = new LinkedList.Node(2);
        LinkedList.Node node3 = new LinkedList.Node(3);
        LinkedList.Node node4 = new LinkedList.Node(4);
        LinkedList.Node node5 = new LinkedList.Node(5);
        LinkedList.Node node6 = new LinkedList.Node(6);
        LinkedList.Node node7 = new LinkedList.Node(7);
        LinkedList.Node node8 = new LinkedList.Node(8);

        linkedList1.head = head1;
        linkedList1.head.next = node2;
        linkedList1.head.next.next = node3;
        linkedList1.head.next.next.next = node4;
        linkedList1.head.next.next.next.next = node5;
        linkedList1.head.next.next.next.next.next = node6;
        linkedList1.head.next.next.next.next.next.next = node7;
        linkedList1.head.next.next.next.next.next.next.next = node8;

        LinkedList linkedList2 = new LinkedList();
        linkedList2.head = new LinkedList.Node(11);
        linkedList2.head.next = new LinkedList.Node(12);
        linkedList2.head.next.next = new LinkedList.Node(14);
        linkedList2.head.next.next.next = node5;
        linkedList2.head.next.next.next.next = node6;

        System.out.println(findTheInterSection(linkedList1, linkedList2));



    }


}
