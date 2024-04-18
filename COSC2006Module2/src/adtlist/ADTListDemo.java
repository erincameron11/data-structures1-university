package adtlist;

public class ADTListDemo {
	
	private Object[] data;
	private int size;
	
	public ADTListDemo() {
		data = new Object[1];
		size = 0;
	}
	
	public int size() { 
		return size; 
	}
	
	public Object get(int index) {
		return data[index];
	}
	
	
	/** Method to add an element to the list 
	 * - INCREASES ARRAY BY SIZE 1 EACH TIME - INEFFICIENT - SEE CODE BELOW for resizing */
//	public void add(Object obj) {
//		Object[] bigger = new Object[data.length + 1];
//		for (int i = 0; i < data.length; i++) {
//			bigger[i] = data[i];
//		}
//		
//		data = bigger; // Change the reference to the new array that is bigger
//		data[data.length - 1] = obj; // Add value to the end of the array you just created
//	}

	
	/** Method to resize the array to twice the size if full */
	private void resizeIfFull() {  // Private because no one should be able to alter the size of array
		if (size < data.length) {
			return;
		}
		Object[] bigger = new Object[2 * data.length];
		for (int i = 0; i < data.length; i++) {
			bigger[i] = data[i];
		}
		data = bigger;
	}
	
	
	/** Method to add an object to the end of the array list */
	public void add(Object obj) {
		resizeIfFull();  // If full make bigger
		data[size] = obj;
		size++;
	}
	
	
	/** Method to add an item at a particular index */
	public void add(int index, Object obj) {
		resizeIfFull();
		for(int from = size - 1; from >= index; from--) {  // From = moving an element from index
			data[from + 1] = data[from];  // Move elements from 1 index, to one index above
		}
		data[index] = obj;
		size++;
	}
	
	
	/** Method to remove an object from the end of an array list */
	public void remove(Object obj) {
		data[size - 1] = obj;
		size--;
	}
	
	
	/** Method to remove an item from a particular index */
	public void remove(int index, Object obj) {
		for(int from = size - 1; from >= index; from--) {  // From = moving an element from index
			data[from - 1] = data[from];  // Move elements from 1 index, to one index above
		}
		data[index] = obj;
		size--;
	}
	
	/** Main Method */
	public String toString() {
		for (int i = 0; i < data.length; i++) {
			return data[i] + "";
		}
		return "";
	}

}
