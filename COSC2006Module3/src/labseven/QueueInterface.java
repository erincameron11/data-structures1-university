package labseven;

public interface QueueInterface<T> {
	
	public boolean isEmpty();
	
	public void enqueue(T item); 
	
	public T dequeue();
	
	public void dequeueAll(); 
	
	public T peek();
	
	public int size();
}
