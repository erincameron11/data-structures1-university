package labfive;

public interface LinkedListInterface<T> {
	
	public boolean isEmpty();
	
	public int size();
	
	public void insert(T item); 
	
	public T remove(int i); 
	
	public void removeAll(); 
	
	public T get(int i);
	
}