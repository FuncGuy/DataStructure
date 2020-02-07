package SinglyLinkedList;

public class LinkedList {
    static Node head;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void display(Node head){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void insertAtFirst(int data){
        Node newNode = new Node(data);
        Node temp = this.head;
        this.head = newNode;
        newNode.next = temp;
    }

    public void insertAtLast(int data){
        Node newNode = new Node(data);
        Node temp = this.head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void insertAtMiddle(int data){
        int length = 0;
        Node temp = head;
        Node newNode = new Node(data);
        while (temp !=null){
            length += 1;
            temp = temp.next;
        }

        length /= 2;

        Node temp2 = head;

        Node next = null;

        for(int i = 0; i < length; i++){
            next = temp2.next.next;
            temp2 = temp2.next;
        }
        temp2.next = newNode;
        temp2.next.next = next;
    }

    public void insertAtGivenPosition(int pos, int data) {
        Node newNode = new Node(data);
        Node temp = head;
        Node next = null;
        for(int i = 0; i < pos -1 ; i++){
            next = temp.next.next;
            temp = temp.next;
        }
        Node tempNode = new Node(temp.data);
        tempNode.next = next;
        next = tempNode;
        temp.data = data;
        temp.next = tempNode;
    }

    public Node removeHeadOfTheList(){
        Node temp = head;
        head = head.next;
        return head;
    }

    public Node removeTailOfTheList(){
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return temp;
    }

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.head = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        linkedList.head.next = node2;
        linkedList.head.next.next = node3;
        linkedList.head.next.next.next = node4;
        linkedList.head.next.next.next.next = node5;

        linkedList.display();
        linkedList.insertAtFirst(0);
        System.out.println("After inserting at the beginning");
        linkedList.display();
        System.out.println("After inserting at the last");
        linkedList.insertAtLast(6);
        linkedList.display();
        System.out.println("After inserting at the middle");
        linkedList.insertAtMiddle(3);
        linkedList.display();
        System.out.println("After inserting at given position");
        linkedList.insertAtGivenPosition(1, 2);
        linkedList.display();
        System.out.println("After removing the tail of the list");
        linkedList.display(linkedList.removeTailOfTheList());


    }
}
