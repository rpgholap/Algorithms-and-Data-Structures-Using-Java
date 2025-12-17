/*
15. Delete the last node of a LinkedList.
Testcase:
Existing LinkedList: [10, 20, 30, 40]
Expected Output: LinkedList: 10 → 20 → 30
*/

class LinkedListDeleteLast {
    Node head;

    void deleteLast() {
        if (head==null || head.next==null) { head=null; return; }
        Node temp=head;
        while(temp.next.next!=null) temp=temp.next;
        temp.next=null;
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
        LinkedListDeleteLast list=new LinkedListDeleteLast();
        list.insertEnd(10); list.insertEnd(20); list.insertEnd(30); list.insertEnd(40);
        list.deleteLast();
        System.out.print("LinkedList: ");
        list.printList();
    }
}
