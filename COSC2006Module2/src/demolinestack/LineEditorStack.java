package demolinestack;

public class LineEditorStack<T> {
	final int MAX_STACK = 50;
	int size = 0;
	private T items[];
//	private T temp[];
	private int top;
	
	// Constructor
	@SuppressWarnings("unchecked")
	public LineEditorStack(int size) {
		items = (T[]) new Object[size];
		top = -1;
	}
	
	public boolean isEmpty() {
		return top < 0;
	}
	
	public boolean isFull() {
		return top == MAX_STACK-1;
	}
	
	public void push(T item) throws LineEditorStackException {
		if (!isFull()) {
			items[++top] = item;
		} else {
			throw new LineEditorStackException("LineEditorStackException on push: stack full");
		}
	}
	
	public T pop() {
		if (!isEmpty()) {
			return items[top--];
		} 
		else {
			throw new LineEditorStackException("LineEditorStackException on pop: stack empty");
		}
	}
	
	@SuppressWarnings("unchecked")
	public void popAll() {
		items = (T[]) new Object[size];
		top = -1;
	}
	
	public T peek() {
		if (!isEmpty()) {
			return items[top];
		} else {
			throw new LineEditorStackException("LineEditorStackException on peek: stack empty");
		}
	}
}
