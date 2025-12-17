/*
17. Search for an element in a LinkedList.
Testcase:
Existing LinkedList: [10, 20, 30, 40]
Element to search: 30
Expected Output: Element found at index 2
*/

class LinkedListSearch {
    Node head;

    int search(int key) {
        Node temp=head; int index=0;
        while(temp!=null){
            if(temp.data==key) return index;
            temp=temp.next; index++;
        }
        return -1;
    }

    void insertEnd(int data) {
        Node newNode=new Node(data);
        if(head==null){ head=newNode; return; }
        Node temp=head;
        while(temp.next!=null) temp=temp.next;
        temp.next=newNode;
    }

    public static void main(String[] args) {
        LinkedListSearch list=new LinkedListSearch();
        list.insertEnd(10); 
		list.insertEnd(20); 
		list.insertEnd(30); 
		list.insertEnd(40);
        int index=list.search(30);
        if(index!=-1) 
			System.out.println("Element found at index " + index);
        else 
			System.out.println("Not found");
    }
}
