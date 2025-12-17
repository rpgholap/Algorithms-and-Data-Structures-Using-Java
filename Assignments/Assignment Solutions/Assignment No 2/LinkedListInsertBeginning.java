/*
12. Insert a new node at the beginning of a LinkedList.
Testcase:
Existing LinkedList: [10, 20, 30]
Node to insert: 5
Expected Output: LinkedList: 5 → 10 → 20 → 30
*/

class LinkedListInsertBeginning {
    Node head;

    void insertBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) System.out.print(" → ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListInsertBeginning list = new LinkedListInsertBeginning();
        list.insertBeginning(30);
        list.insertBeginning(20);
        list.insertBeginning(10);
        list.insertBeginning(5); // insert at beginning
        System.out.print("LinkedList: ");
        list.printList();
    }
}
