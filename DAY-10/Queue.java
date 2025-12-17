// Implementation of queue using array:

public class Queue{
	int size = 5;
	int Q[] = new int[size];
	int rear, front;
	
	Queue(){
		rear = -1;
		front = -1;
	}
	
	boolean isEmpty(){
		return (front == -1);
	}
	
	boolean isFull(){
		return (rear == size - 1);    
	}
	
	void enqueue(int x){
		if(isFull()){
			System.out.println("Queue is full.");
			return;
		} else{
			if(front == -1){   
				front = 0;
			}
			rear++;
			Q[rear] = x;
			System.out.println(x + " Inserted.");
		}
	}
	
	int dequeue(){
		if(isEmpty()){
			System.out.println("Queue is Empty.");
			return 0;
		} else{
			int x = Q[front];
			System.out.println(x + " Deleted.");
			
			if(front >= rear){   //to check all queue is empty or not
				front = -1;
				rear = -1;
			} else{
				front++;
			}
			return x;
		}
	}
	
	void display(){
		if(isEmpty()){
			System.out.println("Queue is Empty.");
		} else{
			for(int i = front; i <= rear; i++){
			System.out.println(Q[i] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]){
		Queue q = new Queue();
		q.enqueue(11);
		q.enqueue(12);
		q.enqueue(13);
		q.enqueue(14);
		q.enqueue(15);
		q.enqueue(100);
		
		System.out.println();
		
		q.display();
		
		q.dequeue();
		System.out.println();
		q.display();
		
		
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.display();
	}
}

/*
11 Inserted.
12 Inserted.
13 Inserted.
14 Inserted.
15 Inserted.
Queue is full.

11
12
13
14
15

11 Deleted.

12
13
14
15

12 Deleted.
13 Deleted.
14 Deleted.
15 Deleted.
Queue is Empty.

*/