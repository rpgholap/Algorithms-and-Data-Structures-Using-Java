
/*
Q11. Minimum & Maximum Node in BST
Find the smallest and largest element in a BST.
Test Case:
BST from Q4 → Min: 20, Max: 80
*/

class MinMaxInBST {
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

	int findMin(Node root) {
			while (root.left != null) {
				root = root.left;
			}
			return root.key;
		}

	int findMax(Node root) {
		while (root.right != null) {
			root = root.right;
		}
		return root.key;
	}

    public static void main(String[] args) {
        MinMaxInBST tree = new MinMaxInBST();
        int[] values = {50, 30, 20, 40, 70, 60, 80};
		
		System.out.println("Min: " + tree.findMin(tree.root));
		System.out.println("Max: " + tree.findMax(tree.root));
    }
	
	
}