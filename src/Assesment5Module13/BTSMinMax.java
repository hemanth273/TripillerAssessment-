package Assesment5Module13;

public class BTSMinMax {
    static class Node {
            int data;
            Node left, right;

            Node(int value) {
                data = value;
                left = right = null;
            }
        }

        static Node insert(Node root, int key) {
            if (root == null) return new Node(key);

            if (key < root.data)
                root.left = insert(root.left, key);
            else if (key > root.data)
                root.right = insert(root.right, key);

            return root;
        }

        // Find Minimum element
        static int findMin(Node root) {
            while (root.left != null)
                root = root.left;
            return root.data;
        }


        static int findMax(Node root) {
            while (root.right != null)
                root = root.right;
            return root.data;
        }
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

            // Find minimum and maximum
            System.out.println("Minimum element in BST: " + findMin(root));
            System.out.println("Maximum element in BST: " + findMax(root));
        }
    }

