package BinaryTree;

public class Search {

    static class Node {
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
        }

        public static Node search(Node root, int key) {
            if (root == null) {
                return null;
            }

            if (root.key == key) {
                return root;
            }

            if (key < root.key) {
                return search(root.left, key);
            } else {
                return search(root.right, key);
            }
        }

        public static void insert(Node root, int key){
            Node r;
            while (root != null){
                r = root;
                if (key == root.key){
                    return;
                }else if(key < root.key){
                    root = root.left;
                }else{
                    root = root.right;
                }
                Node p = new Node(key);
                if(p.key < r.key){
                    r.left = p;
                }else{
                    r.right = p;
                }

            }
        }

        public static void preorder(Node root){
            if(root == null){
                return;
            }
            System.out.println(root.key);
            preorder(root.left);
            preorder(root.right);
        }


        public static void main(String[] args) {
            Node root = new Node(10);
            root.left = new Node(5);
            root.right = new Node(20);
            root.left.right = new Node(8);
            root.right.left = new Node(15);
            System.out.println("Before inserting");
            preorder(root);
            System.out.println("After inserting");
            insert(root, 2);
            preorder(root);

        }
    }
}

