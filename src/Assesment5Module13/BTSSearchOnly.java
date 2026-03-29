package Assesment5Module13;

public class BTSSearchOnly {


        // Node class
        static class Node {
            int data;
            Node left, right;

            Node(int value) {
                data = value;
                left = right = null;
            }
        }

        // Insert method (needed to build BST)
        static Node insert(Node root, int key) {
            if (root == null) return new Node(key);

            if (key < root.data)
                root.left = insert(root.left, key);
            else if (key > root.data)
                root.right = insert(root.right, key);

            return root;
        }

        // Search method
        static boolean search(Node root, int key) {
            if (root == null) return false;

            if (root.data == key) return true;

            if (key < root.data)
                return search(root.left, key);
            else
                return search(root.right, key);
        }

        // Inorder traversal (to display BST)
        static void inorder(Node root) {
            if (root != null) {
                inorder(root.left);
                System.out.print(root.data + " ");
                inorder(root.right);
            }
        }

        public static void main(String[] args) {
            Node root = null;

            // Insert elements into BST
            int[] values = {50, 30, 70, 20, 40, 60, 80};
            for (int v : values)
                root = insert(root, v);

            System.out.print("BST Inorder: ");
            inorder(root);
            System.out.println();

            // Search for keys
            int key1 = 40;
            int key2 = 90;

            System.out.println("Search " + key1 + ": " + (search(root, key1) ? "Found" : "Not Found"));
            System.out.println("Search " + key2 + ": " + (search(root, key2) ? "Found" : "Not Found"));
        }
    }

