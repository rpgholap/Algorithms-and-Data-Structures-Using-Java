
/*
Q14. Convert Sorted Array to Balanced BST
Write a program to convert a sorted array into a balanced BST.
Test Case:
Input: [1, 2, 3, 4, 5, 6, 7]
Output (Preorder example): 4 2 1 3 6 5 7
*/

Node sortedArrayToBST(int[] arr, int start, int end) {
    if (start > end) return null;

    int mid = (start + end) / 2;
    Node node = new Node(arr[mid]);

    node.left = sortedArrayToBST(arr, start, mid - 1);
    node.right = sortedArrayToBST(arr, mid + 1, end);

    return node;
}

// Preorder traversal to verify
void preorder(Node root) {
    if (root != null) {
        System.out.print(root.key + " ");
        preorder(root.left);
        preorder(root.right);
    }
}

// Example usage:
int[] arr = {1, 2, 3, 4, 5, 6, 7};
BST balanced = new BST();
balanced.root = balanced.sortedArrayToBST(arr, 0, arr.length - 1);

System.out.print("Preorder of Balanced BST: ");
balanced.preorder(balanced.root); // Output: 4 2 1 3 6 5 7
