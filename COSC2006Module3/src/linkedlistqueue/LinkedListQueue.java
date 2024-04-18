/*
 * https://www.youtube.com/watch?v=Vn716JTGowM&t=97s
 */

package linkedlistqueue;

public class LinkedListQueue {
	
	private LinkedNode lastNode;
	
	public LinkedListQueue() {
		lastNode = null;
	}
	
	
	/** Method to determine if queue is empty */
	public boolean isEmpty() {
		return lastNode == null;
	}
	
	
	/** Method to determine if queue is full */
	public boolean isFull() {
		return false;  // Linked List is never full
	}
	
	
	/** Method to dequeue all items */
	public void dequeueAll() {
		lastNode = null;
	}
	
	
	/** Method to enqueue a new item */
	public void enqueue(Object newItem) {
		LinkedNode newNode = new LinkedNode(newItem);
		
		if (isFull()) {
			throw new QueueException("QueueException on enqueue: queue is full");
		}
		
		if (isEmpty()) {
			newNode.setNext(newNode);  // Insertion into empty queue
		} else {
			newNode.setNext(lastNode.getNext());
			lastNode.setNext(newNode);  // Insertion into nonempty queue
		} 
		
		lastNode = newNode;
	}
	
	
	/** Method to dequeue an item */
	public Object dequeue() throws QueueException {
		
		if (!isEmpty()) {  // If queue is not empty, remove front
			LinkedNode firstNode = lastNode.getNext();
			
			if (firstNode == lastNode) {
				lastNode = null;  // Special case - 1 node in queue
			} else {
				lastNode.setNext(firstNode.getNext());
			}
			
			return firstNode.getItem();
		
		} else {
			throw new QueueException("QueueException on dequeue: queue empty.");
		}
	}
	
	
	/** Method to peek at top of stack */
	public Object peek() throws QueueException {
		if (!isEmpty()) {
			LinkedNode firstNode = lastNode.getNext();
			return firstNode.getItem();
		} else {
			throw new QueueException("QueueException: on peek. Queue empty.");
		}
	}
	
	
	
}
