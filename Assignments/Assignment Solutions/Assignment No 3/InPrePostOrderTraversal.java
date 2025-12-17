/*
Q8. Inorder, Preorder, Postorder Traversals
Implement recursive functions to print inorder, preorder, and postorder traversals.
Test Case:
Tree:
10
/ \
20 30
/ \
40 50
• Inorder: 40 20 50 10 30
• Preorder: 10 20 40 50 30
• Postorder: 40 50 20 30 10
*/

class Node{
	int data;
	Node left, right;
	
	Node(int d){
		data = d;
		left = right = null;
	}
}
class InPrePostOrderTraversal{
	Node root;
	
	void inorder(Node n){
		if(n == null){
			return;
		}
		inorder(n.left);
		System.out.print(n.data + " ");
		inorder(n.right);
	}
	
	void preorder(Node n){
		if(n == null)
			return;
		System.out.print(n.data + " ");
		preorder(n.left);
		preorder(n.right);
	}
	
	void postorder(Node n){
		if(n == null)
			return;
		
		postorder(n.left);
		postorder(n.right);
		System.out.print(n.data + " ");
	}
	
	public static void main(String args[]){
		InPrePostOrderTraversal tree = new InPrePostOrderTraversal();
		
		tree.root = new Node(10);
		tree.root.left = new Node(20);
		tree.root.right = new Node(30);
		tree.root.left.left = new Node(40);
		tree.root.left.right = new Node(50);
		
		System.out.println("Inorder : " );
		tree.inorder(tree.root);                 // 40 20 50 10 30
		System.out.println();
		
		System.out.println("Preorder : " );
		tree.preorder(tree.root);                // 10 20 40 50 30
		System.out.println();
		
		System.out.println("Postorder : " );
		tree.postorder(tree.root);               // 40 50 20 30 10
		
	}
}


