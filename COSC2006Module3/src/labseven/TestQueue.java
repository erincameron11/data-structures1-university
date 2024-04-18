package labseven;

public class TestQueue {
	
	public static void main(String[] args) {
		// Create a queue of string values that can hold a maximum of 10 items
		Queue<String> queue = new Queue<String>(10);
		
		// Add 10 names to the queue - print after each
		System.out.println("Enqueue 10 names to the queue: ");
		
		queue.enqueue("Brad");
		queue.toString();
		System.out.println();
		
		queue.enqueue("Gary");
		queue.toString();
		System.out.println();
		
		queue.enqueue("Harry");
		queue.toString();
		System.out.println();
		
		queue.enqueue("Piotr");
		queue.toString();
		System.out.println();
		
		queue.enqueue("Beth");
		queue.toString();
		System.out.println();
		
		queue.enqueue("Jennifer");
		queue.toString();
		System.out.println();
		
		queue.enqueue("Hannah");
		queue.toString();
		System.out.println();
		
		queue.enqueue("Taylor");
		queue.toString();
		System.out.println();
		
		queue.enqueue("Hayley");
		queue.toString();
		System.out.println();
		
		queue.enqueue("Cari");
		queue.toString();
		System.out.println();

		
		// Remove some names from the queue - print after each
		System.out.println("\nDequeue 4 names from the queue: ");		
		
		queue.dequeue();
		queue.toString();
		System.out.println();
		
		queue.dequeue();
		queue.toString();
		System.out.println();
		
		queue.dequeue();
		queue.toString();
		System.out.println();
		
		queue.dequeue();
		queue.toString();
		System.out.println();
		
		
		
//		queue.dequeue();	// Displays exception if un-commented out
//		queue.dequeue();
//		queue.dequeue();
//		queue.dequeue();
//		queue.dequeue();
//		queue.dequeue();
//		queue.dequeue();
		
		
//		queue.dequeueAll();	// Displays exception if un-commented 
//		queue.toString();
		
		
		// Print the item at the start of the queue and how many items are in the queue
		System.out.println("\nItem at the start of the queue: " + queue.peek());
		System.out.println("\nNumber of items in the queue: " + queue.size());
	}
	
}
