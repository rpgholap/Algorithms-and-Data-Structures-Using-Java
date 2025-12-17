/*
16. Delete a node by its value in a LinkedList.
Testcase:
Existing LinkedList: [10, 20, 30, 40]
Node to delete: 30
Expected Output: LinkedList: 10 → 20 → 40

*/


class LinkedListDeleteByValue {
    Node head;

    void deleteByValue(int key) {
        if (head==null) return;
        if (head.data==key) { head=head.next; return; }
        Node temp=head;
        while(temp.next!=null && temp.next.data!=key) temp=temp.next;
        if(temp.next!=null) temp.next=temp.next.next;
    }

    void insertEnd(int data) {
        Node newNode=new Node(data);
        if(head==null){ head=newNode; return; }
        Node temp=head;
        while(temp.next!=null) temp=temp.next;
        temp.next=newNode;
    }

    void printList() {
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            if(temp.next!=null) System.out.print(" → ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListDeleteByValue list=new LinkedListDeleteByValue();
        list.insertEnd(10); list.insertEnd(20); list.insertEnd(30); list.insertEnd(40);
        list.deleteByValue(30);
        System.out.print("LinkedList: ");
        list.printList();
    }
}
