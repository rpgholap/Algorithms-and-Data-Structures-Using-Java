/*
11. Create a LinkedList and insert elements at the end.
Testcase:
Existing LinkedList: [5, 10, 15]
Elements to insert: [20, 25]
Expected Output: LinkedList: 5 → 10 → 15 → 20 → 25
*/

class CreateLLInsertElements{
    Node head;  // head of the linked list
	
	// Node class
	class Node {
		int data;
		Node next;
		Node(int data) {
			this.data = data;
			next = null;
		}
	}
	// Insert element at end
    void insertEnd(int data) {
        Node newNode = new Node(data);   // new node
        if (head == null)                // if list is empty
		{ 
			head = newNode;              // new node becomes head 
			return; 
		}
        Node temp = head;
        while (temp.next != null) 
			temp = temp.next;            // traverse to the last node
        temp.next = newNode;             // insert newNode at last 
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) 
				System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CreateLLInsertElements list = new CreateLLInsertElements();
        list.insertEnd(5);
        list.insertEnd(10);
        list.insertEnd(15);
        list.insertEnd(20);
        list.insertEnd(25);
        System.out.print("LinkedList: ");
        list.printList();
    }
}

// 5 -> 10 -> 15 -> 20 -> 25