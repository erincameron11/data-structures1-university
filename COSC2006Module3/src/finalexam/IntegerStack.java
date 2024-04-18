package finalexam;

public class IntegerStack {
	private final int MAX_STACK = 1500;
	private int items[];
	int top;
	
	public IntegerStack() {
		items = new int[MAX_STACK];
		top = -1;
	}
	
	
	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	public void push(int obj) throws StackException {
		if (top != MAX_STACK - 1) {
			items[++top] = obj;
		}
		
	}

	public int pop() throws StackException {
		if (!isEmpty()) {
			return items[top--];
		} 
		return items[top];
	}

	public int top() throws StackException {
		if (!isEmpty()) {
			return items[top];
		} 
		return items[top];
	}

	public void popAll() {
		// TODO Auto-generated method stub
		
	}
	
	
	public static void main(String[] args) throws StackException {
		
		IntegerStack is = new IntegerStack();
		
		for (int i = 100; i > 80; i = i - 2) {
		if (i % 3 != 0) {
			System.out.println(i);
			is.push(i);
		}
		
		while (is.top() % 4 != 0) {
			is.pop();
		}
		
		while (!is.isEmpty()) {
			System.out.println(is.pop());
			if (!is.isEmpty())
				System.out.println("-");
		}
	}
		
	}
}
