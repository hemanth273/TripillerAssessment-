package Assesment5Module13;

public class BTSDelete {
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


        static Node delete(Node root, int key) {
            if (root == null) return null;

            if (key < root.data) {
                root.left = delete(root.left, key);
            } else if (key > root.data) {
                root.right = delete(root.right, key);
            } else {
                // Node found
                // Case 1 & 2: Node with 0 or 1 child
                if (root.left == null) return root.right;
                if (root.right == null) return root.left;

                // Case 3: Node with 2 children
                Node successor = root.right;
                while (successor.left != null)
                    successor = successor.left;

                root.data = successor.data;
                root.right = delete(root.right, successor.data);
            }
            return root;
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

            int[] values = {50, 30, 70, 20, 40, 60, 80};
            for (int v : values)
                root = insert(root, v);

            System.out.print("BST Inorder before deletion: ");
            inorder(root);
            System.out.println();

            // Delete a node
            int keyToDelete = 30;
            root = delete(root, keyToDelete);

            System.out.print("BST Inorder after deleting " + keyToDelete + ": ");
            inorder(root);
        }
    }

