package BinaryTree;

import java.util.ArrayDeque;
import java.util.Queue;

public class LeftView {

    static class Node{
        int key;
        Node left;
        Node right;
        public Node(int key){
            this.key = key;
        }
    }

    public static void leftView(Node root) {

        if(root == null){
            return;
        }

        Queue<Node> q = new ArrayDeque<>();

        q.add(root);

        while (!q.isEmpty()){
            int i = 0;
            int size = q.size();
            Node cur;
            while (i++ < size){
                cur = q.poll();
                if(i == 1){
                    System.out.println(cur.key + " ");
                }
                if(cur.left != null){
                    q.add(cur.left);
                }

                if(cur.right != null){
                    q.add(cur.right);
                }
            }
        }

    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);

        leftView(root);
    }

}
