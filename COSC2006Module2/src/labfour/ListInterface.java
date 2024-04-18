package labfour;

public interface ListInterface<T> {
	
	public boolean isEmpty(); 
	public int size();
	public T remove(int i); 
	public void removeAll(); 
	public T get(int i);
	public void add(T item, int i);
}
