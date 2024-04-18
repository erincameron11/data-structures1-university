package finalexampractice;

public class Queue<T> implements QueueInterface {
	
	private T[] queue;
	private int numElements;
	
	// 2-arg Constructor
	@SuppressWarnings("unchecked")
	public Queue(int MAX_SIZE) {
		numElements = 0;
		queue = (T[])new Object [MAX_SIZE];
	}
	
	@Override
	public boolean isEmpty() {
		return numElements == 0;
	}

	@Override
	public boolean full() {
		return false;
	}

	@Override
	public Queue enqueue(Object x) throws Exception {
		if (queue.length != numElements) {
			for (int i = 0; i <= queue.length; i++) {
				if (i == numElements) {
					queue[i] = (T)x;
				}
			}
			numElements++;
			
		} else {
			throw new Exception("QueueException: at enqueue. Queue is full.");
		}
		return null;
	}

	@Override
	public Queue dequeue() throws Exception {

		Queue newQ = new Queue(numElements);
		
		if (!isEmpty()) {
//			System.out.println("\nDequeued: " + queue[0]);
			for (int i = 0; i < numElements - 1; i++) {
				if (i == 0) {
					newQ.enqueue(queue[i]);
				}
				
				queue[i] = queue[i + 1];
//                newQ.enqueue(queue[i + 1]);
            }
//			queue[numElements - 1] = null;
			--numElements;
			
		} else {
			throw new Exception("QueueException: on dequeue. Queue empty.");
		}
		
		return newQ;
		
	}

	@Override
	public Object peek() throws Exception {
		if (!isEmpty()) {
			return queue[0];
			
		} else {
			throw new Exception("QueueException: on peek. Queue empty.");
		}
	}

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
	
	
	/** TESTING Module 3 Unit 5 practice 
	 * Removes all elements from the queue
	 * @throws Exception 
	 */
	public void emptyTheQueue(Queue q) throws Exception {
		while(!isEmpty()) {
			dequeue();
		}
	}

	
	/** TESTING prep for Final Exam Question 5 */
	public void pushAllIntoStack() throws Exception {
		Stack<String> temp = new Stack<String>(numElements);
		Stack<String> stack = new Stack<String>(numElements);
	
		// Dequeue the queue and store in temp stack
		while (!isEmpty()) {
			temp.push(peek());
			dequeue();
		}
		
		// Pop temp stack into main stack in reverse order
		while (!temp.isEmpty()) {
			stack.push(temp.pop());
		}
		System.out.println("Stack in reverse order: ");
		stack.toString();
		
		numElements = 0;
	}
	
	
	/** TESTING practice for Final Exam Question 6 */
	public void reverseN(Queue q, int n) throws Exception {
		
		Stack<String> stack = new Stack<String>(numElements);
		int count = 0;
		int middle = numElements - (n * 2);  // This is the AMOUNT of middle values
		int end = n + middle;  // This is the right side amount of numbers to reverse
		
		while (count < numElements) {
			
			// Do the left hand side of the element swapping
			if (count == 0) {
				for (int i = 0; i < n; i++) {
					stack.push(peek());
					dequeue();
				}
				
				for (int i = 0; i < n; i++) {
					System.out.print(stack.top() + ", ");
					enqueue(stack.pop());
				}
				count++;
			}
			
			// Do the middle section
			else if (count == middle) {
				for (int i = 0; i < middle; i++) {
					stack.push(peek());
					System.out.print(peek() + ", ");
					dequeue();
					enqueue(stack.pop());
				}
				count++;
			}
			
			// Do the right hand side of the element swapping
			else if (count == end + 1) {

				for (int i = 0; i < n; i++) {
					stack.push(peek());
					dequeue();
				}
				
				for (int i = 0; i < n; i++) {
					System.out.print(stack.top() + ", ");
					enqueue(stack.pop());
				}
				count++;
			} 
			
			// If none apply, just increase the count
			else {
				count++;
			}	
		}
	}
	
	
	
	// final
	public void insertToQueue(Queue q) throws Exception {
		
		int[] array = new int[100];
		
		// Add 100 integers to the array
		for (int i = 0; i < 100; i ++) {
			array[i] = i;
		}
		
		int count = 0;
		// Add each integer to the queue
		while (count < 100) {
			enqueue(array[count]);
			count++;
		}
		
	}
	
	
	
	// final
	public void splitTheQueue (Queue q, Queue odd, Queue even) throws Exception {
		
		while (!q.isEmpty()) {
			
			// Check the number to determine what it is
			if ((int)q.peek() % 2 == 0) {
				even.enqueue(q.peek());
				q.dequeue();
			} else {
				odd.enqueue(q.peek());
				q.dequeue();
			}
		
		}
	}
	
	
	
	
	public static void main(String[] args) throws Exception {
		
		// TESTING practice for Final Exam 
//		Queue<String> q = new Queue<String>(20);
//		String s = "One";
//		String t = "Two";
//		String v = "Three";
//		String r = "Four";
//		String b = "Five";
//		
//		q.enqueue(s);
//		
//		q.enqueue(t);
//		
//		q.enqueue(v);
//		
//		q.enqueue(r);
//		
//		q.enqueue(b);
		
//		System.out.println(q.peek());
		
//		q.toString();
		
//		q.dequeue();
//		System.out.println(q.dequeue());
		
//		System.out.println();
//		q.toString();
//		System.out.println();
//		q.pushAllIntoStack();
		
		
		
		// TESTING practice for Final Exam Question 6
//		Queue<String> que = new Queue<String>(8);
//
//		que.enqueue("1");
//		que.enqueue("2");
//		que.enqueue("3");
//		que.enqueue("4");
//		que.enqueue("5");
//		que.enqueue("6");
//		que.enqueue("7");
//		que.enqueue("8");
//
//		que.toString();
//		System.out.println();
//		que.reverseN(que, 3);
		
		
		// TESTING Module 3 Unit 5 practice
//		que.emptyTheQueue(que);
//		System.out.println(que.isEmpty());
		
		
		// Final testing
//		Queue<Integer> qq = new Queue<Integer>(100);
//		
//		qq.insertToQueue(qq);
//		qq.toString();
		
		
		
		Queue<Integer> q = new Queue<Integer>(100);
		Queue<Integer> odd = new Queue<Integer>(50);
		Queue<Integer> even = new Queue<Integer>(50);
		
		q.insertToQueue(q);
		
		q.splitTheQueue(q, odd, even);
		odd.toString();
		
		
	}
	
	
}
