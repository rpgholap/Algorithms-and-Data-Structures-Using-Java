import java.util.Arrays;

class QueueProblems {

    // ---------------- Q1: Queue using Array ----------------
    static class ArrayQueue {
        int[] arr;
        int front, rear, size, capacity;

        ArrayQueue(int capacity) {
            this.capacity = capacity;
            arr = new int[capacity];
            front = 0;
            rear = -1;
            size = 0;
        }

        void enqueue(int val) {
            if (size == capacity) {
                System.out.println("Queue Overflow");
                return;
            }
            rear = (rear + 1) % capacity;
            arr[rear] = val;
            size++;
        }

        int dequeue() {
            if (size == 0) {
                System.out.println("Queue Underflow");
                return -1;
            }
            int val = arr[front];
            front = (front + 1) % capacity;
            size--;
            return val;
        }

        void display() {
            System.out.print("Queue: ");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[(front + i) % capacity] + " ");
            }
            System.out.println();
        }
    }

    // ---------------- Q2: Queue using Linked List ----------------
    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    static class LinkedListQueue {
        Node front, rear;

        void enqueue(int val) {
            Node node = new Node(val);
            if (rear != null) rear.next = node;
            rear = node;
            if (front == null) front = rear;
        }

        int dequeue() {
            if (front == null) {
                System.out.println("Queue Underflow");
                return -1;
            }
            int val = front.data;
            front = front.next;
            if (front == null) rear = null;
            return val;
        }

        void display() {
            System.out.print("Queue: ");
            Node temp = front;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    // ---------------- Q4: Circular Queue using Array ----------------
    static class CircularQueue {
        int[] arr;
        int front, rear, size, capacity;

        CircularQueue(int capacity) {
            this.capacity = capacity;
            arr = new int[capacity];
            front = rear = -1;
        }

        void enqueue(int val) {
            if ((front == 0 && rear == capacity - 1) || (rear + 1 == front)) {
                System.out.println("Circular Queue Overflow");
                return;
            }
            if (front == -1) front = 0;
            rear = (rear + 1) % capacity;
            arr[rear] = val;
        }

        int dequeue() {
            if (front == -1) {
                System.out.println("Circular Queue Underflow");
                return -1;
            }
            int val = arr[front];
            if (front == rear) front = rear = -1;
            else front = (front + 1) % capacity;
            return val;
        }

        void display() {
            if (front == -1) { System.out.println("Queue is empty"); return; }
            System.out.print("Circular Queue: ");
            int i = front;
            while (true) {
                System.out.print(arr[i] + " ");
                if (i == rear) break;
                i = (i + 1) % capacity;
            }
            System.out.println();
        }
    }

    // ---------------- Q5: Check if Queue is Palindrome ----------------
    static boolean isPalindromeQueue(int[] queue, int size) {
        int left = 0, right = size - 1;
        while (left < right) {
            if (queue[left++] != queue[right--]) return false;
        }
        return true;
    }

    // ---------------- Q6: Double Ended Queue (Deque) ----------------
    static class Deque {
        int[] arr;
        int front, rear, size, capacity;

        Deque(int capacity) {
            this.capacity = capacity;
            arr = new int[capacity];
            front = -1;
            rear = 0;
        }

        boolean isFull() { return (front == 0 && rear == capacity - 1) || (front == rear + 1); }
        boolean isEmpty() { return front == -1; }

        void insertFront(int val) {
            if (isFull()) { System.out.println("Deque Overflow"); return; }
            if (front == -1) { front = 0; rear = 0; }
            else if (front == 0) front = capacity - 1;
            else front--;
            arr[front] = val;
        }

        void insertRear(int val) {
            if (isFull()) { System.out.println("Deque Overflow"); return; }
            if (front == -1) { front = rear = 0; }
            else if (rear == capacity - 1) rear = 0;
            else rear++;
            arr[rear] = val;
        }

        int deleteFront() {
            if (isEmpty()) { System.out.println("Deque Underflow"); return -1; }
            int val = arr[front];
            if (front == rear) front = rear = -1;
            else front = (front + 1) % capacity;
            return val;
        }

        int deleteRear() {
            if (isEmpty()) { System.out.println("Deque Underflow"); return -1; }
            int val = arr[rear];
            if (front == rear) front = rear = -1;
            else if (rear == 0) rear = capacity - 1;
            else rear--;
            return val;
        }

        void display() {
            if (isEmpty()) { System.out.println("Deque is empty"); return; }
            System.out.print("Deque: ");
            int i = front;
            while (true) {
                System.out.print(arr[i] + " ");
                if (i == rear) break;
                i = (i + 1) % capacity;
            }
            System.out.println();
        }
    }

    // ---------------- Q7: Priority Queue using Array ----------------
    static class PriorityQueueArray {
        int[] arr;
        int size, capacity;

        PriorityQueueArray(int capacity) {
            arr = new int[capacity];
            this.capacity = capacity;
            size = 0;
        }

        void enqueue(int val) {
            if (size == capacity) { System.out.println("Queue Overflow"); return; }
            int i = size - 1;
            while (i >= 0 && arr[i] > val) {
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = val;
            size++;
        }

        int dequeue() {
            if (size == 0) { System.out.println("Queue Underflow"); return -1; }
            return arr[--size];
        }

        void display() {
            System.out.print("Priority Queue: ");
            for (int i = 0; i < size; i++) System.out.print(arr[i] + " ");
            System.out.println();
        }
    }

    // ---------------- Q8: Reverse First K Elements ----------------
    static void reverseK(int[] queue, int size, int K) {
        int[] stack = new int[K];
        int top = -1;
        // Push first K elements to stack
        for (int i = 0; i < K; i++) stack[++top] = queue[i];
        // Pop from stack and put back
        for (int i = 0; i < K; i--) queue[i] = stack[top--];
    }

    // ---------------- Q9: Queue using Two Stacks ----------------
    static class QueueTwoStacks {
        int[] s1, s2;
        int top1, top2, capacity;

        QueueTwoStacks(int capacity) {
            this.capacity = capacity;
            s1 = new int[capacity];
            s2 = new int[capacity];
            top1 = top2 = -1;
        }

        void enqueue(int val) { s1[++top1] = val; }

        int dequeue() {
            if (top2 == -1) {
                while (top1 != -1) s2[++top2] = s1[top1--];
            }
            if (top2 == -1) { System.out.println("Queue Underflow"); return -1; }
            return s2[top2--];
        }
    }

    // ---------------- Q10: Stack using Two Queues ----------------
    static class StackTwoQueues {
        int[] q1, q2;
        int front1, rear1, front2, rear2, capacity;

        StackTwoQueues(int capacity) {
            this.capacity = capacity;
            q1 = new int[capacity];
            q2 = new int[capacity];
            front1 = rear1 = -1;
            front2 = rear2 = -1;
        }

        boolean isEmpty() { return front1 == -1; }

        void enqueue(int[] q, int val, int[] front, int[] rear) {
            if (front[0] == -1) front[0] = rear[0] = 0;
            else rear[0]++;
            q[rear[0]] = val;
        }

        int dequeue(int[] q, int[] front, int[] rear) {
            if (front[0] == -1) return -1;
            int val = q[front[0]];
            if (front[0] == rear[0]) front[0] = rear[0] = -1;
            else front[0]++;
            return val;
        }

        void push(int val) {
            enqueue(q2, val, new int[]{front2}, new int[]{rear2});
            while (front1 != -1) {
                enqueue(q2, dequeue(q1, new int[]{front1}, new int[]{rear1}), new int[]{front2}, new int[]{rear2});
            }
            // swap q1 and q2
            int[] tempQ = q1; q1 = q2; q2 = tempQ;
            int tempF = front1; front1 = front2; front2 = tempF;
            int tempR = rear1; rear1 = rear2; rear2 = tempR;
        }

        int pop() { return dequeue(q1, new int[]{front1}, new int[]{rear1}); }
    }

    // ---------------- MAIN ----------------
    public static void main(String[] args) {
        // You can test each queue implementation here
        ArrayQueue aq = new ArrayQueue(5);
        aq.enqueue(1); aq.enqueue(2); aq.enqueue(3);
        aq.display();
        System.out.println("Dequeue: " + aq.dequeue());
        aq.display();

        LinkedListQueue llq = new LinkedListQueue();
        llq.enqueue(10); llq.enqueue(20); llq.display();
        System.out.println("Dequeue: " + llq.dequeue());
        llq.display();

        CircularQueue cq = new CircularQueue(5);
        cq.enqueue(1); cq.enqueue(2); cq.enqueue(3); cq.display();
        System.out.println("Dequeue: " + cq.dequeue()); cq.display();

        int[] palindromeQueue = {1, 2, 3, 2, 1};
        System.out.println("Is Palindrome? " + isPalindromeQueue(palindromeQueue, palindromeQueue.length));

        Deque deque = new Deque(5);
        deque.insertFront(10); deque.insertRear(20); deque.display();

        PriorityQueueArray pq = new PriorityQueueArray(5);
        pq.enqueue(30); pq.enqueue(10); pq.enqueue(20); pq.display();

        int[] ngeArr = {4,5,2,25};
        System.out.println("Next Greater Element: " + Arrays.toString(nextGreaterElement(ngeArr)));
    }
}
