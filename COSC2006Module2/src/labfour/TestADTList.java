package labfour;

public class TestADTList {

	private static ADTList<String> list = new ADTList<>(10);
	
	/** Main Method */
	public static void main(String[] args) {
		
		/** ADD ALL ITEMS TO THE LIST - PRINT EACH TIME */
		list.add("Milk", 0);
		list.toString();
		
		list.add("Eggs", 1);
		list.toString();

		list.add("Celery", 2);
		list.toString();
		
		list.add("Bananas", 3);
		list.toString();
		
		list.add("Apples", 4);
		list.toString();
		
		list.add("Oranges", 5);
		list.toString();
		
		list.add("Cookies", 6);
		list.toString();
		
		list.add("Steak", 7);
		list.toString();
		
		
		/** REMOVE THE CELERY AND ORANGES FROM THE LIST - PRINT */
		System.out.println();
		list.remove(3);
		list.toString();
		
		list.remove(5);
		list.toString();
		
//		list.remove(31);  // THROWS exception
		
		
		
		/** SWAP TWO ITEMS IN THE LIST - PRINT BEFORE & AFTER SWAP */
		System.out.println();
		list.toString();
		
		swap(list, 1, 4);  // Eggs and cookies are swapped
		
		list.toString();
		
		
		/** SWAP - SHOW THAT THE swap() METHOD WILL THROW AN EXCEPTION WHEN INVALID INDEXES */
//		swap(list, 11, 13);
//		list.toString();
		
//		swap(list, -1, 1);
//		list.toString();
		
	}
	
	
	/** SWAP TWO ITEMS IN THE LIST - PRINT BEFORE & AFTER SWAP */
	public static void swap(ADTList<String> list, int i, int j) throws ListException {
		
		// Check if the two indices exist in the list		
		if (list.size() < i || list.size() < j) {
			// Throw error if indices provided are not in the list
			throw new ListException("ListException: Swap method indices do not exist.");
		
		} else if (j < 0 || i < 0) {
			// Throw error if indices provided are less than 0
			throw new ListException("ListException: Swap method indices cannot be less than 0.");
		
		} else {
			// Swap the indices
			String jIndex = list.get(j);
			String iIndex = list.get(i);
			
			list.remove(j + 1);
			list.add(iIndex, j);
			
			list.remove(i + 1);
			list.add(jIndex, i);
		}
	}

}
