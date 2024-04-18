package labfour;

public class ADTList<T> implements ListInterface<T> {

	private final int MAX_LIST_SIZE;
	private T[] list;
	private int numItems;
	
	@SuppressWarnings("unchecked")
	public ADTList(int max) {
		MAX_LIST_SIZE = max;
		list = (T[]) new Object[MAX_LIST_SIZE];
		numItems = 0;
	}
	
	@Override
	public boolean isEmpty() {
		return (numItems == 0);
	}
	
	@Override
	public int size() {
		return numItems;
	}

	@Override
	public T remove(int i) throws ListException {
		// Throw exception if index out of bounds
		if (i >= 1 && i <= numItems) {
			
			// Search for i in the list and remove
			for (int pos = i; pos <= size(); pos++) {
				list[pos - 1] = list[pos];
			}
			numItems--;
			return list[i];
			
		} else {
			// If the index is out of range
			throw new ListException("ListException: Index out of range. Item not removed.");
		}
		
	}

	@Override
	public void removeAll() {
		for (int i = 0; i < list.length; i++) {
			list[i] = null;
		}
		
	}

	@Override
	public T get(int i) {
		return list[i];
	}
	
	
	@Override
	public void add(T item, int i) throws ListException {
		// Check if the list is full
		if (numItems >= MAX_LIST_SIZE) {
			throw new ListException("ListException: Array is full. Item not added.");
		}
		
		for(int from = numItems - 1; from >= i; from--) {  // From = moving an element from index
			list[from + 1] = list[from];  // Move elements from 1 index, to one index above
		}
		list[i] = item;
		numItems++;
		
	}
	
	
	/** Method to Print the list elements with a comma between them (minus the last item) */
	@Override
	public String toString() {
		System.out.print("\n");
		int i = 0;
		boolean firstRun = true;
		while (list[i] != null) {
			if (firstRun) {
				System.out.print(list[i]);
				firstRun = false;
			} else {
				System.out.print(", " + list[i]);
			}
			
			i++;
		}
		
		
		return list + "";
	}

}
