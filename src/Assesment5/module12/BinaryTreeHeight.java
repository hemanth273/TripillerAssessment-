package Assesment5.module12;

public class BinaryTreeHeight {


        // Node structure
        static class Node {
            int data;
            Node left, right;

            Node(int value) {
                data = value;
                left = right = null;
            }
        }

        // Function to find height of binary tree
        static int height(Node root) {
            if (root == null)
                return -1; // height in terms of edges

            int leftHeight = height(root.left);
            int rightHeight = height(root.right);

            return Math.max(leftHeight, rightHeight) + 1;
        }

        public static void main(String[] args) {

        /*
              1
             / \
            2   3
           / \
          4   5
        */

            // Creating binary tree
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);

            // Find height
            System.out.println("Height of Binary Tree: " + height(root));
        }
    }

