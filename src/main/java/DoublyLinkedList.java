public class DoublyLinkedList {
    static Node head;

    static class Node {
        int data;
        Node next;
        Node prev;
        public Node(int data) {
            this.data = data;
        }
    }

    public static void display(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void insertBeforeHead(int data){
        Node node0 = new Node(data);
        node0.next = head;
        head.prev = node0;
        head = node0;
    }

    public static void insertAtTheEnd(int data){
        Node node = new Node(data);
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
    }

    public static void insertAfterGiveNode(Node node, int data) {

        Node newNode = new Node(data);

        Node temp1 = head;

        while (temp1 != null && temp1 != node){
            temp1 = temp1.next;
        }

        Node next_pointer = temp1.next;

        temp1.next = newNode;
        newNode.prev= temp1;
        newNode.next = next_pointer;
        next_pointer.prev = newNode;

    }

    public static void deleteHeadNode(){
        head = head.next;
    }

    public static void deleteGivenNode(Node node) {

        Node temp1 = head;

        while (temp1 != null && temp1 != node){
            temp1 = temp1.next;
        }

        Node previous = temp1.prev;
        Node next = temp1.next;

        previous.next = next;
        next.prev = previous;
    }

    public static void reverse(){

        Node temp = head;

        while (temp.next != null){
            temp = temp.next;
        }

        head = temp;

        while (head != null){
            System.out.println(head.data);
            head = head.prev;
        }

    }

    public static void updateGivenNode(Node node, int data){

        Node temp = head;

        while (temp != null && temp != node){
            temp = temp.next;
        }
        temp.data = data;

    }

    public static void deleteTailNode(){

        Node temp = head;
        Node prev;

        while (temp.next != null){
            temp = temp.next;
        }
        prev = temp.prev;
        prev.next = null;
    }


    public static void main(String[] args) {

        DoublyLinkedList dlist = new DoublyLinkedList();

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        dlist.head = node1;

        node1.next = node2;
        node2.prev = node1;

        node2.next = node3;
        node3.prev = node2;

        node3.next = node4;
        node4.prev = node3;

        node4.next = node5;
        node5.prev = node4;

        System.out.println("Before inserting at the head");

        display();

        System.out.println("After inserting at the head");

        insertBeforeHead(0);

        display();

        System.out.println("After inserting at the middle");

        insertAfterGiveNode(node3, 3);

        display();

        System.out.println("After inserting at the end");

        insertAtTheEnd(6);

        display();

        System.out.println("After deleting head node");

        deleteHeadNode();

        display();

        System.out.println("After deleting given node");

        deleteGivenNode(node1);

        display();

        System.out.println("After deleting tail node");

        deleteTailNode();

        display();

        System.out.println("After updating the given node");

        updateGivenNode(node2, 22);

        display();

        System.out.println("After reverse");

        reverse();

    }
}
