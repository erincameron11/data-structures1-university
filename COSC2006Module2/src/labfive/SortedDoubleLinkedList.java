package labfive;

public class SortedDoubleLinkedList<T extends Comparable<T>> implements LinkedListInterface<T> {
	
	DoubleNode<T> head;

	public SortedDoubleLinkedList() {

	}
	
	/** Method to return a boolean if the list is empty or not */
	@Override
	public boolean isEmpty() {
		return (head == null);
	}

	
	/** Method to return the size of the list */
	@Override
	public int size() {
		int count = 0;
		while (head != null) {
			head.next();
			count++;
			return count;
		}
		return count;
	}

	
	// STILL NEED TO SORT THE DATA!!!
	// STILL NEED TO GET INSERTING WORKING FOR VALUES OTHER THAN THE FIRST ITEM
	/** Method to insert new nodes and sort the data in the list */
	@Override
	public void insert(T item) throws LinkedListException {
		DoubleNode<T> newNode = new DoubleNode<T>(item);
		DoubleNode<T> curr = head; 
		
		// If list is empty
		if (head == null) {
			head = newNode;
			head.setNext(newNode);
			head.setPrev(null);
			
		} else {
//			
//			while (curr.next() != null) {
//				curr = curr.next();
//			}
//			curr = curr.next();
//			curr.setNext(newNode);
//			newNode.setPrev(curr);
//			curr = newNode;
//			curr.setNext(null);
//			
////			for (int k = 0; k < size(); k++) {	
//////				if (curr.next() != null && curr.next().item().compareTo(newNode.item()) < 0) {
////				if (curr.next() != null && item.compareTo(curr.next().item()) < 0) {
////					curr = curr.next();
////				} else {
////					curr = curr.next();
////					curr.setNext(newNode);
////					newNode.setPrev(curr);
////					curr = newNode;
////					curr.setNext(null);
////					
////				}
////			}
//		}
		
			while(curr.next() != null) {
				if (curr.next().next() == null) {
					newNode.setNext(curr.next());
					curr.setNext(newNode);
					
//					newNode.setNext(curr.next());
//					curr.setNext(newNode);
					break;
				}
				curr = curr.next();
			}
		
		}
		
	}

	
	/** Method to remove an element at a specified index of the list */
	@Override
	public T remove(int i) throws LinkedListException {
		DoubleNode<T> curr = head;
		
		for (int k = 0; k < size(); k++) {
			
			curr = curr.next();
			
			// If the index specified is the first index to remove
			if (i == 0) {
				head = head.next();
				
			} else if (k == (i - 1)) {
				curr.setNext(curr.next());
				
			} else {
				// Throw an exception if the index does not exist
				throw new LinkedListException("LinkedListException: the index of " + i + " does not exist. Item not removed.");
			}
		}
		return curr.item();
	}

	
	/** Method to remove all items from the list */
	@Override
	public void removeAll() {
		head = null;
	}

	
	/** Method to return a specific index item */
	@Override
	public T get(int i) {
		DoubleNode<T> curr = head;
		
		for (int k = 0; k < size(); k++) {
			
			curr = curr.next();
			
			// If the index specified is the first index to remove
			if (k == i) {
				return curr.item();
				
			} else {
				// Throw an exception if the index does not exist
				throw new LinkedListException("LinkedListException: the index of " + i + " does not exist. No item to display.");
			}
		}
		return (T)curr.item();
	}
	
	
	/** Method to print the list elements with an arrow -> between them minus the last item */
	@Override
	public String toString() {
		DoubleNode<T> curr = head;
		boolean firstRun = true;
		
		while (curr.next() != null) {
			curr = curr.next();
	  
	        if (firstRun) {
	        	firstRun = false;
	        	return curr.item() + "";
	        	
	        } else {
	        	return " -> " + curr.item();
	        }
		}
		return "";
	}

}
