/*
 * https://www.youtube.com/watch?v=rK7nl38CGYY&t=29s
 */

package arraybasedstack;

public class ArrayBasedStack implements MyStackInterface {

	final int MAX_STACK = 50;
	private Object items[];
	private int top;
	
	// Constructor
	public ArrayBasedStack() {
		items = new Object[MAX_STACK];
		top = -1;
	}
	
	@Override
	public boolean isEmpty() {
		return top < 0;
	}

	@Override
	public boolean isFull() {
		return top == MAX_STACK-1;
	}

	@Override
	public void push(Object newItem) throws MyStackException {
		if (!isFull()) {
			items[++top] = newItem;
		} else {
			throw new MyStackException("StackEcxeption on push: stack full");
		}
		
	}

	@Override
	public Object pop() throws MyStackException {
		if (!isEmpty()) {
			return items[top--];
		} else {
			throw new MyStackException("StackException on pop: stack empty");
		}
	}

	@Override
	public void popAll() {
		items = new Object[MAX_STACK];
		top = -1;
	}

	@Override
	public Object peek() throws MyStackException {
		if (!isEmpty()) {
			return items[top];
		} else {
			throw new MyStackException("StackException on peek: stack empty");
		}
	}
	
}
