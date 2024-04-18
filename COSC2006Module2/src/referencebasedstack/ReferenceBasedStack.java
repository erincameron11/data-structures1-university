/*
 * https://www.youtube.com/watch?v=looZMrdHwhU&t=27s
 */

package referencebasedstack;

import arraybasedstack.MyStackException;
import arraybasedstack.MyStackInterface;

public class ReferenceBasedStack implements MyStackInterface {
	private RefNode top;

	public ReferenceBasedStack() {
		top = null;
	}
	
	public boolean isEmpty() {
		return (top == null);
	}
	
	public boolean isFull() {
		return false;
	}
	
	public void push(Object newItem) {
		top = new RefNode(newItem, top);
	}
	
	public Object pop() throws MyStackException {
		if (!isEmpty()) {
			Object temp = top.getItem();
			top = top.getNext();
			return temp;
		} else {
			throw new MyStackException("Stack Exception on pop: stack empty");
		}
	}
	
	public void popAll() {
		top = null;
	}
	
	public Object peek() throws MyStackException {
		if (!isEmpty()) {
			return top.getItem();
		} else {
			throw new MyStackException("Stack Exception on peek: stack empty");
		}
	}
	
}
