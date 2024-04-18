package finalexampractice;

public interface QueueInterface {
	public boolean isEmpty();
	public boolean full();
	public Queue enqueue(Object x) throws Exception; 
	public Object dequeue() throws Exception;
	public Object peek() throws Exception;
}
