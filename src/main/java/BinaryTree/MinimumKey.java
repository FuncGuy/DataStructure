package BinaryTree;

public class MinimumKey {

    static class Node {
        int key;
        Node right;
        Node left;

        public Node(int key) {
            this.key = key;
        }


        public int getMinValue() {
          if(left == null){
              return this.key;
          }
          return left.getMinValue();
        }


        public static void main(String[] args) {
            Node root = new Node(20);
            root.left = new Node(10);
            root.right = new Node(30);
            root.left.left = new Node(1);

            System.out.println(root.getMinValue());
        }
    }
}