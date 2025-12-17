/*
Q7. Create a Binary Tree & Print Preorder Traversal
Write a program to create a binary tree and print its preorder traversal.
Test Case:
Tree:
1
/ \
2 3
/ \
4 5
Expected Output (Preorder): 1 2 4 5 3
*/

class Node{
	int data;
	Node left;
	Node right;
	
	Node(int d){
		data = d;
		left = right = null;
	}
}

public class BTPreorder{
	Node root;
	
	void preorder(Node n){
		if( n == null){
			return;
		}
		System.out.print(n.data + " ");
		preorder(n.left);
		preorder(n.right);
	}
	
	public static void main(String args[]){
		BTPreorder tree = new BTPreorder();
		
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.right.right = new Node(5);
		
		System.out.println("Preorder Traversal: ");
		tree.preorder(tree.root);
	}
}

// Preorder Traversal:
// 1 2 4 3 5