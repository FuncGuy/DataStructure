package BinaryTree;

// Java program for printing vertical order of a given binary tree
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.Map.Entry;

class VerticalOrderBtree
{
    // Tree node
    static class Node
    {
        int key;
        Node left;
        Node right;

        // Constructor
        Node(int data) {
            key = data;
        }
    }

    // Utility function to store vertical order in map 'm'
    // 'hd' is horizontal distance of current node from root.
    // 'hd' is initially passed as 0
    static void getVerticalOrder(Node root, int hd,
                                 TreeMap<Integer, List<Integer>> map)
    {
        // Base case
        if(root == null)
            return;

        //get the vector list at 'hd'
        List<Integer> get = map.get(hd);

        // Store current node in map 'm'
        if(get == null)
        {
            get = new ArrayList<>();
            get.add(root.key);
        }
        else {
            get.add(root.key);
        }
        map.put(hd, get);

        // Store nodes in left subtree
        getVerticalOrder(root.left, hd - 1, map);

        // Store nodes in right subtree
        getVerticalOrder(root.right, hd + 1, map);
    }

    // The main function to print vertical order of a binary tree
    // with the given root
    static void printVerticalOrder(Node root)
    {
        // Create a map and store vertical order in map using
        // function getVerticalOrder()
        TreeMap<Integer, List<Integer>> m = new TreeMap<>();
        int hd =0;
        getVerticalOrder(root,hd,m);

        // Traverse the map and print nodes at every horizontal
        // distance (hd)
        for (Entry<Integer, List<Integer>> entry : m.entrySet())
        {
            System.out.println(entry.getValue());
        }
    }

    // Driver program to test above functions
    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.left.right = new Node(8);
        root.right.right.right = new Node(9);

        System.out.println("Vertical Order traversal is");

        printVerticalOrder(root);
    }
}
