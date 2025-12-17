import java.util.*;

class BST {
    class Node {
        int key;
        Node left, right;
        Node(int key) {
            this.key = key;
        }
    }

    Node root;

    // Insert into BST
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

    // Inorder Traversal
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }

    // Search in BST
    boolean search(Node root, int key) {
        if (root == null) return false;
        if (root.key == key) return true;
        return key < root.key ? search(root.left, key) : search(root.right, key);
    }

    // Find Minimum
    int findMin(Node root) {
        while (root.left != null) root = root.left;
        return root.key;
    }

    // Find Maximum
    int findMax(Node root) {
        while (root.right != null) root = root.right;
        return root.key;
    }

    // Height of Tree
    int height(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    // Check if Balanced
    boolean isBalanced(Node root) {
        return checkHeight(root) != -1;
    }

    int checkHeight(Node root) {
        if (root == null) return 0;

        int left = checkHeight(root.left);
        if (left == -1) return -1;

        int right = checkHeight(root.right);
        if (right == -1) return -1;

        if (Math.abs(left - right) > 1) return -1;

        return 1 + Math.max(left, right);
    }

    // Convert Sorted Array to Balanced BST
    Node sortedArrayToBST(int[] arr, int start, int end) {
        if (start > end) return null;

        int mid = (start + end) / 2;
        Node node = new Node(arr[mid]);

        node.left = sortedArrayToBST(arr, start, mid - 1);
        node.right = sortedArrayToBST(arr, mid + 1, end);

        return node;
    }

    // Preorder Traversal
    void preorder(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    // ----------- MAIN METHOD ----------
    public static void main(String[] args) {
        BST tree = new BST();
        Scanner sc = new Scanner(System.in);

        // Build default BST from Q10
        int[] values = {50, 30, 20, 40, 70, 60, 80};
        for (int val : values) {
            tree.root = tree.insert(tree.root, val);
        }

        System.out.println("Default BST built with values: 50,30,20,40,70,60,80");

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Insert into BST");
            System.out.println("2. Inorder Traversal");
            System.out.println("3. Search in BST");
            System.out.println("4. Find Min & Max");
            System.out.println("5. Height of Tree");
            System.out.println("6. Check if Balanced");
            System.out.println("7. Convert Sorted Array to Balanced BST");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int val = sc.nextInt();
                    tree.root = tree.insert(tree.root, val);
                    System.out.println("Inserted " + val);
                    break;

                case 2:
                    System.out.print("Inorder Traversal: ");
                    tree.inorder(tree.root);
                    System.out.println();
                    break;

                case 3:
                    System.out.print("Enter value to search: ");
                    int key = sc.nextInt();
                    System.out.println(tree.search(tree.root, key) ? "Found" : "Not Found");
                    break;

                case 4:
                    System.out.println("Min: " + tree.findMin(tree.root));
                    System.out.println("Max: " + tree.findMax(tree.root));
                    break;

                case 5:
                    System.out.println("Height of Tree: " + tree.height(tree.root));
                    break;

                case 6:
                    System.out.println("Is Balanced? " + tree.isBalanced(tree.root));
                    break;

                case 7:
                    System.out.print("Enter size of sorted array: ");
                    int n = sc.nextInt();
                    int[] arr = new int[n];
                    System.out.println("Enter sorted elements:");
                    for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
                    tree.root = tree.sortedArrayToBST(arr, 0, n - 1);
                    System.out.print("Preorder of Balanced BST: ");
                    tree.preorder(tree.root);
                    System.out.println();
                    break;

                case 8:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
