package finalexampractice;

public class Stack<T> implements StackInterface {

	final int MAX_STACK = 50;
	private T items[];
	private int top;
	int size;
	
	// Constructor
	public Stack() {
		items = (T[]) new String[MAX_STACK];
		top = -1;
	}
		
	// Constructor
	public Stack(int size) {
		items = (T[]) new String[size];
		top = -1;		
	}
	
	
	@Override
	public void push(Object value) {
		if (top != MAX_STACK - 1) {
			items[++top] = (T)value;
		}
	}

	@Override
	public Object pop() {
		if (!isEmpty()) {
			return items[top--];
		} 
		return items[top];
	}

	@Override
	public Object top() {
		if (!isEmpty()) {
			return items[top];
		} 
		return items[top];
	}

	@Override
	public boolean isEmpty() {
		return top == -1;
	}

	@Override
	public int length() {
		int count = 0;
		
		for (int i = 0; i < items.length; i++) {
			if (items[i] == null) {
				break;
			}
			
			count++;
		}
		return count;
	}

	public String toString() {
		for (int i = 0; i < items.length; i++) {
			if (items[i] != null) {
				System.out.println(i + ": " + items[i]);
			}
		}
		return "";
	}
	
	
	/** TESTING Module 3 Unit 5 practice 
	 * Prints the stack in reverse order
	 * @throws Exception 
	 */
	public static void printStackReverse(Stack s) {
		Stack temp = new Stack();
		
		// Pop into new temp stack
		while (!s.isEmpty()) {
			temp.push(s.top());
			s.pop();
		}
		
		// Pop back into s stack and read (backwards)
		while (!temp.isEmpty()) {
			System.out.print(temp.top() + ", ");
			s.push(temp.top());
			temp.pop();
		}
	}
	
	
	
	// TESTING Final Exam question 4
	// Check if a given item is on the stack
	public boolean search(Object value) {
		int count = 0;
		T[] newItems = (T[]) new Object[length()];
		
		// Pop if not the value
		while (items[count] != value && !isEmpty()) {
			newItems[count] = (T)pop();
			count++;
		}		
		
		// If the value is found
		if (items[count] == value) {
			count--;
			while (count != 0) {
				push(newItems[count]);
				count--;
			}
			return true;
		}
		return false;
	}
	
	
	public static void main (String[] args) {
//		Stack<String> stack = new Stack<String>(5);
//		String s = "one";
//		String t = "two";
//		String v = "three";
//		String o = "four";
//		
//		stack.push(s);
//		stack.push(t);
//		stack.push(v);
//		stack.push(o);
		
//		System.out.println(stack.length());
		
//		System.out.println(stack.isEmpty());
		
//		System.out.println(stack.top());
		
//		System.out.println(stack.pop());
		
//		System.out.println(stack.top());
		
//		stack.toString();
		
//		System.out.println(stack.search(o));
		
//		stack.toString();
		
		
		// TESTING practice Module 3 Unit 5
//		stack.printStackReverse(stack);
		
		
		// Final
//		Stack<String> stack = new Stack<String>();
//		for (int i = 100; i > 80; i = i - 2) {
//			if (i % 3 != 0) {
//				stack.push(i);
//			}
//			
//			while ((int)stack.top() % 4 != 0) {
//				stack.pop();
//			}
//			
//			while (!stack.isEmpty()) {
//				System.out.println(stack.pop());
//				if (!stack.isEmpty())
//					System.out.println("-");
//			}
//		}
		
		
		
//		// final
//		Stack<String> s = new Stack<String>();
//		s.push("5");
//		s.push("6");
//		s.push("7");
//		String v = (String) s.pop();
//		s.push("8");
//		s.push("9");
//		String w = (String) s.top();
//		String x = (String) s.pop();
//		String y = (String) s.pop();
//		String z = (String) s.pop();
//		
//		
//		System.out.println("w: " + w + " v: " + v + " x: " + x + " y: " + y + " z: " + z);
		
	}
	
}
