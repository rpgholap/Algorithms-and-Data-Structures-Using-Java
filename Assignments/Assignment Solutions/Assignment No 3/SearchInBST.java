/*
Q10. Search in BST
Write a program to search for a value in a BST. Return true if found, false otherwise.
Test Case:
BST from Q4 → Search for 40 → Output: Found
BST from Q4 → Search for 90 → Output: Not Found
*/

class SearchInBST {
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
	
	
	boolean search(Node root, int key) {
    if (root == null) return false;
    if (root.key == key) return true;
    return key < root.key ? search(root.left, key) : search(root.right, key);
}


    public static void main(String[] args) {
        SearchInBST tree = new SearchInBST();
        int[] values = {50, 30, 20, 40, 70, 60, 80};

        for (int val : values) {
            tree.root = tree.insert(tree.root, val);
        }
		
		
		System.out.println("\nSearch 40: " + (tree.search(tree.root, 40) ? "Found" : "Not Found"));
		System.out.println("Search 90: " + (tree.search(tree.root, 90) ? "Found" : "Not Found"));
    }
	
	
}

// Search 40: Found
// Search 90: Not Found