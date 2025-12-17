/*
13. Insert a new node at a given position in a LinkedList.
Testcase:
Existing LinkedList: [10, 20, 30, 40]
Node to insert: 25 at position 2
Expected Output: LinkedList: 10 → 20 → 25 → 30 → 40
*/

class LinkedListInsertPosition {
    Node head;

    void insertAt(int pos, int data) {
        Node newNode = new Node(data);
        if (pos == 0) { // beginning
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        for (int i=0; i<pos-1 && temp!=null; i++) {
            temp = temp.next;
        }
        if (temp != null) {
            newNode.next = temp.next;
            temp.next = newNode;
        }
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
        LinkedListInsertPosition list = new LinkedListInsertPosition();
        list.insertAt(0, 10);
        list.insertAt(1, 20);
        list.insertAt(2, 30);
        list.insertAt(3, 40);
        list.insertAt(2, 25); // position 2
        System.out.print("LinkedList: ");
        list.printList();
    }
}
