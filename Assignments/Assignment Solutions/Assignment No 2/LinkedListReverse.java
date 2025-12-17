/*
19. Reverse a LinkedList. 
Testcase: Existing LinkedList: [10, 20, 30, 40] 
Expected Output: LinkedList: 40 → 30 → 20 → 10 
Existing LinkedList: [] 
Expected Output: LinkedList: (empty)
*/

class LinkedListReverse {
    Node head;

    void reverse() {
        Node prev=null, curr=head, next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    void insertEnd(int data) {
        Node newNode=new Node(data);
        if(head==null){ head=newNode; return; }
        Node temp=head;
        while(temp.next!=null) temp=temp.next;
        temp.next=newNode;
    }

    void printList() {
        if(head==null){ System.out.println("LinkedList: (empty)"); return; }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            if(temp.next!=null) System.out.print(" → ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListReverse list=new LinkedListReverse();
        list.insertEnd(10); list.insertEnd(20); list.insertEnd(30); list.insertEnd(40);

        System.out.print("Original LinkedList: ");
        list.printList();

        list.reverse();
        System.out.print("Reversed LinkedList: ");
        list.printList();

        // Test empty LinkedList
        LinkedListReverse emptyList=new LinkedListReverse();
        emptyList.reverse();
        emptyList.printList();
    }
}
