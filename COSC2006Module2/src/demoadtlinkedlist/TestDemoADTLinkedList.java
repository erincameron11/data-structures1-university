package demoadtlinkedlist;

public class TestDemoADTLinkedList {

	public static void main(String[] args) {
		Integer num = 6;
		DemoADTLinkedList list = new DemoADTLinkedList();
		
		list.insert(list, 12333, 98.0);
		list.insert(list, 32111, 80.0);
		list.insert(list, 56733, 65.0);
		list.insert(list, 98734, 77.8);
		
		list.printList(list);

		list.remove(12333);
		
		System.out.println("\n");
		
		list.printList(list);
		
	}

}
