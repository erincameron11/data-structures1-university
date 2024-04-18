package finalexam;

public class ArrayStack  implements Stack {
	
	private final int MAX_STACK = 50;
	private Object items[];
	int top;
	
	public ArrayStack() {
		items = new Object[MAX_STACK];
		top = -1;
	}
	
	
	@Override
	public boolean isEmpty() {
		return top == -1;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void push(Object obj) throws StackException {
		if (top != MAX_STACK - 1) {
			items[++top] = obj;
		}
		
	}

	@Override
	public Object pop() throws StackException {
		if (!isEmpty()) {
			return items[top--];
		} 
		return items[top];
	}

	@Override
	public Object top() throws StackException {
		if (!isEmpty()) {
			return items[top];
		} 
		return items[top];
	}

	@Override
	public void popAll() {
		// TODO Auto-generated method stub
		
	}
	
	
	public static void main(String[] args) throws StackException {
		ArrayStack as = new ArrayStack();
		
		System.out.println(as.isEmpty());
		as.push("HI");
		System.out.println(as.isEmpty());
		System.out.println(as.top());
		as.pop();
		System.out.println(as.isEmpty());
	}
	
	
}
