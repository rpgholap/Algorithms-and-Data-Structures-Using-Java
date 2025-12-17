/*
Q10. Insert into a BST
Write a program to insert nodes into a BST and print inorder traversal.
Test Case:
Insert: 50, 30, 20, 40, 70, 60, 80
Tree (BST) Inorder: 20 30 40 50 60 70 80
*/


class InsertInBST {
    class Node {
        int key;
        Node left, right;
        Node(int key) {
            this.key = key;
        }
    }

    Node root;

    // Insert function
    Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        if (key < root.key) {
            root.left = insert(root.left, key);
        } else if (key > root.key) {
            root.right = insert(root.right, key);
        }
        return root;
    }

    // Inorder traversal
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        InsertInBST tree = new InsertInBST();
        int[] values = {50, 30, 20, 40, 70, 60, 80};

        for (int val : values) {
            tree.root = tree.insert(tree.root, val);
        }

        System.out.print("Inorder Traversal: ");
        tree.inorder(tree.root); // Output: 20 30 40 50 60 70 80
    }
}


