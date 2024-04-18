package assignmentfour;

public class InfixCalcStack {
	
	final int MAX_STACK = 150;
	private String items[];
	private int top;
	
	// Constructor
	public InfixCalcStack() {
		items = new String[MAX_STACK];
		top = -1;
	}
	
	// Constructor
	public InfixCalcStack(int size) {
		items = new String[size];
		top = -1;
	}
	
	public boolean isEmpty() {
		return top < 0;
	}

	public boolean isFull() {
		return top == MAX_STACK-1;
	}

	public void push(String newItem) throws InfixCalcException {
		if (!isFull()) {
			items[++top] = newItem;
		} else {
			throw new InfixCalcException("InfixCalcException on push: stack full");
		}
		
	}

	public String pop() throws InfixCalcException {
		if (!isEmpty()) {
			return items[top--];
		} else {
			throw new InfixCalcException("InfixCalcException on pop: stack empty");
		}
	}

	public void popAll() {
		items = new String[MAX_STACK];
		top = -1;
	}

	public String peek() throws InfixCalcException {
		if (!isEmpty()) {
			return items[top];
		} else {
			throw new InfixCalcException("InfixCalcException on peek: stack empty");
		}
	}
	
	public String toString() {
		for (int i = 0; i < items.length; i++) {
			if (items[i] != null) {
				System.out.println(i + ": " + items[i]);
			}
		}
		return "";
	}
	
	
}
