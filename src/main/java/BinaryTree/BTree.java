package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BTree {

    static Node root;

    static class Node{

        public int data;
        public Node lchild;
        public Node rchild;
    }

    private static void preOrder(Node root) {
        if(root == null){
            return;
        }
        System.out.println(root.data);
        preOrder(root.lchild);
        preOrder(root.rchild);
    }

    private static void inOrder(Node root){

        if(root == null){
            return;
        }

        inOrder(root.lchild);
        System.out.println(root.data);
        inOrder(root.rchild);
    }

    private static void postOrder(Node root){

        if(root == null){
            return;
        }

        postOrder(root.lchild);
        postOrder(root.rchild);
        System.out.println(root.data);
    }

    private static void levelOrder(Node root) {

        Queue<Node> q = new LinkedList();
        Node p;
        System.out.println(root.data);
        q.add(root);

        while (!q.isEmpty()){
            p = q.poll();

            if(p.lchild != null){
                System.out.println(p.lchild.data);
                q.add(p.lchild);
            }

            if(p.rchild != null){
                System.out.println(p.rchild.data);
                q.add(p.rchild);
            }
        }

    }


    public static void create(){

        Node p,t;

        Queue<Node> q = new LinkedList<Node>();

        int x;

        System.out.println("Enter root value ");

        Scanner s = new Scanner(System.in);

        x = s.nextInt();

        root = new Node();

        root.data = x;

        root.lchild = null;

        root.rchild = null;

        q.add(root);

        while (!q.isEmpty()){

            p = q.poll();

            System.out.println("Enter left child of " + p.data);

             x= s.nextInt();

             if(x != -1){

                 t = new Node();

                 t.data = x;

                 t.lchild = null;

                 t.rchild = null;

                 p.lchild = t;

                 q.add(t);
             }

            System.out.println("Enter right child of " + p.data);

            x= s.nextInt();

            if(x != -1){

                t = new Node();

                t.data = x;

                t.rchild = null;

                t.rchild = null;

                p.rchild = t;

                q.add(t);
            }
        }

    }

    public static void main(String[] args) {

        create();

        System.out.println("pre order");

        preOrder(root);

        System.out.println("in order");

        inOrder(root);

        System.out.println("post order");

        postOrder(root);

        System.out.println("level order");

        levelOrder(root);
    }
}
