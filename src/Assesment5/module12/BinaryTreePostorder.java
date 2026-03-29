package Assesment5.module12;

public class BinaryTreePostorder {



        static class Node {
            int data;
            Node left, right;

            Node(int value) {
                data = value;
                left = right = null;
            }
        }


        static void postorder(Node root) {
            if (root == null) return;

            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        public static void main(String[] args) {

        /*
              1
             / \
            2   3
           / \
          4   5
        */


            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);


            System.out.print("Postorder Traversal: ");
            postorder(root);
        }
    }

