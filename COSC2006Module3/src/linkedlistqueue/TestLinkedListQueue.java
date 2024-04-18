package linkedlistqueue;

public class TestLinkedListQueue {

	public static void main(String[] args) {
		
		LinkedListQueue llq = new LinkedListQueue();
		
		System.out.println(llq.isEmpty());
		
		llq.enqueue(llq);
		llq.enqueue(llq);
		llq.enqueue(llq);
		llq.enqueue(llq);
		
		System.out.println(llq.isEmpty());
		
		System.out.println(llq.isFull());
		
//		System.out.println(llq.peek());
		
//		System.out.println(llq.toString());

//		System.out.println(llq.dequeue());
		
//		System.out.println(llq.toString());
	}

}
