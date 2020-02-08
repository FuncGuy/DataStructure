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


        public static void main(String[] args) {
            Node root = new Node(10);
            root.left = new Node(5);
            root.right = new Node(20);
            root.left.right = new Node(8);
            root.right.left = new Node(15);
            System.out.println(search(root, 15) != null);

        }
    }
}

