/*
 * https://www.youtube.com/watch?v=rK7nl38CGYY&t=29s
 */

package arraybasedstack;

public interface MyStackInterface {
	public boolean isEmpty();
	public boolean isFull();
	public void push(Object newItem) throws MyStackException;
	public Object pop() throws MyStackException;
	public void popAll();
	public Object peek() throws MyStackException;
}
