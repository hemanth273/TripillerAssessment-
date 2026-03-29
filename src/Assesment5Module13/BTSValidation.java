package Assesment5Module13;

public class BTSValidation {
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

        // Check if valid BST using min-max range
        static boolean isBST(Node root, int min, int max) {
            if (root == null) return true;

            if (root.data <= min || root.data >= max)
                return false;

            return isBST(root.left, min, root.data) &&
                    isBST(root.right, root.data, max);
        }

        // Inorder traversal (optional, for display)
        static void inorder(Node root) {
            if (root != null) {
                inorder(root.left);
                System.out.print(root.data + " ");
                inorder(root.right);
            }
        }

        public static void main(String[] args) {
            Node root = null;

            // Build a BST
            int[] values = {50, 30, 70, 20, 40, 60, 80};
            for (int v : values)
                root = insert(root, v);

            System.out.print("BST Inorder: ");
            inorder(root);
            System.out.println();

            // Validate BST
            if (isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE))
                System.out.println("This is a valid BST");
            else
                System.out.println("This is NOT a valid BST");
        }
    }


