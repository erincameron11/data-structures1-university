package finalexam;

public interface Stack {

	public boolean isEmpty();
	
	public boolean isFull();
	
	public void push(Object obj) throws StackException;
	
	public Object pop() throws StackException;
	
	public Object top() throws StackException;
	
	public void popAll();
	
}
