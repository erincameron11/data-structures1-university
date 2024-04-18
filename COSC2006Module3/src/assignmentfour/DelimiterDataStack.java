package assignmentfour;

public class DelimiterDataStack {
	
	final int MAX_STACK = 50;
	int size = 0;
	private DelimiterData stack[];
	private int top;
	
	// Constructor
	public DelimiterDataStack(int size) {
		stack = new DelimiterData[size];
		top = -1;
	}
	
	public boolean isEmpty() {
		return top < 0;
	}
	
	public boolean isFull() {
		return top == MAX_STACK-1;
	}
	
	public void push(DelimiterData item) throws DelimiterDataException {
		if (!isFull()) {
			stack[++top] = item;
		} else {
			throw new DelimiterDataException("DelimiterDataException on push: stack full");
		}
	}
	
	public DelimiterData pop() {
		if (!isEmpty()) {
			return stack[top--];
		} 
		else {
			throw new DelimiterDataException("DelimiterDataException on pop: stack empty");
		}
	}
	
	public void popAll() {
		stack = new DelimiterData[size];
		top = -1;
		
	}
	
	public DelimiterData peek() {
		if (!isEmpty()) {
			return stack[top];
		} else {
			throw new DelimiterDataException("DelimiterDataException on peek: stack empty");
		}
	}
	
//	public String toString() {
//		for (int i = 0; i < stack.length; i++) {
//			if (i == 0) {
//				System.out.print(stack[i]);
//			} else if (stack[i] == null){
//				// Do nothing
//			} else {
//				System.out.print(", " + stack[i]);
//			}
//		}
//		return "";
//	}
	
}
