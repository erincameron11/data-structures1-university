package labfive;

public class TestLinkedList {

	/** Create a new Linked List that holds String values */
	private static SortedDoubleLinkedList<String> list = new SortedDoubleLinkedList<>();
	
	/** Main Method */
	public static void main(String[] args) {
		
		/** Insert values into the list - print after each insertion */
//		System.out.println(list.isEmpty());
		
		list.insert("Milk");
		System.out.println(list);
		
//		System.out.println(list.isEmpty());
//		System.out.println(list.size());
//		System.out.println(list.get(0));
		
		list.insert("Eggs");
		System.out.println(list);
		
		list.insert("Celery");
		System.out.println(list);
		
		list.insert("Bananas");
		System.out.println(list);
		
		list.insert("Apples");
		System.out.println(list);
		
		list.insert("Oranges");
		System.out.println(list);
		
		list.insert("Cookies");
		System.out.println(list);
		
		list.insert("Steak");
		System.out.println(list);
		
		/** Remove Celery and Oranges from the list - print after each removal */
//		list.remove(3);  // Celery
//		System.out.println(list);
		
//		list.remove(6);  // Oranges
//		System.out.println(list);
		
		
		/** Remove everything from the list - print */
//		list.removeAll();  // Remove everything
//		System.out.println(list);
//		System.out.println(list.isEmpty());
		
		
	}

}
