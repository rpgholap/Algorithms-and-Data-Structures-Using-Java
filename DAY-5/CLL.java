// Circular Linked List
public class CLL {
    private static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    private Node last; // null when empty; last.next is the head

    public boolean isEmpty() { return last == null; }

    // -------- Insertions --------

    // Insert at beginning (new head) – O(1)
    public void insertAtBeginning(int data) {
        Node n = new Node(data);
        if (last == null) {
            n.next = n;
            last = n;
        } else {
            n.next = last.next; // old head
            last.next = n;      // new head
        }
    }

    // Insert at end (new last) – O(1)
    public void insertAtEnd(int data) {
        Node n = new Node(data);
        if (last == null) {
            n.next = n;
            last = n;
        } else {
            n.next = last.next; // head
            last.next = n;
            last = n;           // new last
        }
    }

    // Insert after first occurrence of key – O(n)
    public boolean insertAfter(int key, int data) {
        if (last == null) return false;
        Node cur = last.next; // head
        do {
            if (cur.data == key) {
                Node n = new Node(data);
                n.next = cur.next;
                cur.next = n;
                if (cur == last) last = n; // inserted after last -> move last
                return true;
            }
            cur = cur.next;
        } while (cur != last.next);
        return false;
    }

    // -------- Deletions --------

    // Delete head (first node) – O(1)
    public void deleteHead() {
        if (last == null) return;
        if (last.next == last) { // single node
            last = null;
        } else {
            last.next = last.next.next; // skip old head
        }
    }

    // Delete first occurrence of key – O(n)
    public boolean deleteKey(int key) {
        if (last == null) return false;

        Node prev = last;
        Node cur  = last.next; // head

        do {
            if (cur.data == key) {
                // Single-node case
                if (cur == last && cur.next == last) {
                    last = null;
                } else {
                    prev.next = cur.next;
                    if (cur == last) last = prev; // deleted last -> move back
                }
                cur.next = null; // help GC
                return true;
            }
            prev = cur;
            cur  = cur.next;
        } while (cur != last.next);

        return false; // not found
    }

    // -------- Traversal --------

    public void traverse() {
        if (last == null) { System.out.println("(empty)"); return; }
        Node head = last.next, t = head;
        do {
            System.out.print(t.data);
            t = t.next;
            if (t != head) System.out.print(" -> ");
        } while (t != head);
        System.out.println();
    }

    // Utility: size – O(n)
    public int size() {
        if (last == null) return 0;
        int c = 0;
        Node head = last.next, t = head;
        do { c++; t = t.next; } while (t != head);
        return c;
    }

    // Demo
    public static void main(String[] args) {
        CLL cll = new CLL();

        cll.insertAtEnd(2);
        cll.insertAtEnd(3);
        cll.insertAtEnd(4);
        cll.traverse();              // 2 -> 3 -> 4

        cll.insertAtBeginning(5);
        cll.traverse();              // 5 -> 2 -> 3 -> 4

        cll.insertAfter(3, 99);
        cll.traverse();              // 5 -> 2 -> 3 -> 99 -> 4

        cll.deleteHead();
        cll.traverse();              // 2 -> 3 -> 99 -> 4

        cll.deleteKey(4);
        cll.traverse();              // 2 -> 3 -> 99

        System.out.println("Size: " + cll.size()); // 3
    }
}