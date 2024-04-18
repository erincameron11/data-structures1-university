package referencebasedstack;

public class TestReferenceBasedStack {

	public static void main(String[] args) {
		final int MAX_ITEMS = 15;
		ReferenceBasedStack stack = new ReferenceBasedStack();
		Integer items[] = new Integer[MAX_ITEMS];
		System.out.println("Pushing: ");

		for (int i = 0; i < MAX_ITEMS; i++) {
			items[i] = new Integer(i);
			if (!stack.isFull()) {
				System.out.println(" " + i);
				stack.push(items[i]);
			}
		}
		
		System.out.println("Popping: ");
		
		while (!stack.isEmpty()) {
			// cast result of pop to Integer
			System.out.println(" " + (Integer)(stack.pop()));
		}

	}

}
