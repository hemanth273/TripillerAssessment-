package Assesment5.module12;

public class BinaryTree {
    // Node structure
        static class Node {
            int data;
            Node left, right;

            Node(int value) {
                data = value;
                left = right = null;
            }
        }

        // Inorder Traversal (Left, Root, Right)
        static void inorder(Node root) {
            if (root == null) return;

            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
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

            // Perform inorder traversal
            System.out.print("Inorder Traversal: ");
            inorder(root);
        }
    }

