package labseven;
// Array based queue

public class Queue<T> implements QueueInterface<T> {

	private T[] queue;
	private int numElements;
	
	// 2-arg Constructor
	@SuppressWarnings("unchecked")
	public Queue(int MAX_SIZE) {
		numElements = 0;
		queue = (T[]) new Object [MAX_SIZE];
	}

	/** Method to check whether the array is empty or not */
	@Override
	public boolean isEmpty() {
		return numElements == 0;
	}

	
	/** Method to add an element to the back of the array */
	@Override
	public void enqueue(T item) throws QueueException {
		if (queue.length != numElements) {
			for (int i = 0; i <= queue.length; i++) {
				if (i == numElements) {
					queue[i] = item;
				}
			}
			numElements++;
			
		} else {
			throw new QueueException("QueueException: at enqueue. Queue is full.");
		}
	}

	
	/** Method to remove an element from the front of the array */
	@Override
	public T dequeue()  throws QueueException {
		if (!isEmpty()) {
			for (int i = 0; i < size() - 1; i++) {
                queue[i] = queue[i + 1];
            }
			queue[size() - 1] = null;
			
//			for (int i = 1; i < size() - 1; i++) {
//				if (i == size()) {
//					queue[i] = null;
//				} else {
//					queue[i - 1] = queue[i];
//				}
//			}
			--numElements;
		
		} else {
			throw new QueueException("QueueException: on dequeue. Queue empty.");
		}
		
		
		
		return queue[0]; // Probably not correct - shows the first element AFTER dequeuing
	}
	

	/** Method to remove all elements from the array */
	@SuppressWarnings("unchecked")
	@Override
	public void dequeueAll() {
		queue = (T[]) new Object [queue.length];
//		for (int i = 0; i < queue.length; i++) {
//			queue[i] = null;
//		}
		numElements = 0;
	}

	/** Method to display the top element from the array */
	@Override
	public T peek() {
		if (!isEmpty()) {
			return queue[0];
			
		} else {
			throw new QueueException("QueueException: on peek. Queue empty.");
		}
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return numElements;
	}
	
	
	/** Method to display the queue elements with comma's between them */
	public String toString() {
		for (int i = 0; i < queue.length; i++) {
			if (i == 0) {
				System.out.print(queue[i]);
			} else { 
				System.out.print(", " + queue[i]);
			}
		}
		return "";
	}

}
