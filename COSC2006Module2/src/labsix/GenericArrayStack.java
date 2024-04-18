package labsix;

public class GenericArrayStack<T> {
	
	final int MAX_STACK = 50;
	int size = 0;
	private T items[];
	private int top;
	
	// Constructor
	@SuppressWarnings("unchecked")
	public GenericArrayStack(int size) {
		items = (T[]) new Object[size];
		top = -1;
	}
	
	public boolean isEmpty() {
		return top < 0;
	}
	
	public boolean isFull() {
		return top == MAX_STACK-1;
	}
	
	public void push(T item) throws GenericArrayException {
		if (!isFull()) {
			items[++top] = item;
		} else {
			throw new GenericArrayException("GenericArrayException on push: stack full");
		}
	}
	
	public T pop() {
		if (!isEmpty()) {
			return items[top--];
		} 
		else {
			throw new GenericArrayException("GenericArrayException on pop: stack empty");
		}
	}
	
	@SuppressWarnings("unchecked")
	public void popAll() {
		items = (T[]) new Object[size];
		top = -1;
		
//		items = temp;
//		temp = items;
//		top = -1;
	}
	
	public T peek() {
		if (!isEmpty()) {
			return items[top];
		} else {
			throw new GenericArrayException("GenericArrayException on peek: stack empty");
		}
	}
	
}
