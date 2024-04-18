package adtlinkedlist;

public class ADTLinkedList<T> {
	
	public class LinkNode2 {
		Object item;
		LinkNode2 next;
		
		public LinkNode2(Object newItem) {
			item = newItem;
			this.next = null;
		}
			
		// 2-arg Constructor
		LinkNode2(Object item, LinkNode2 nextNode) {
			this.item = item;
			this.next = nextNode;
		}

	}
	
	
	static LinkNode head;
	LinkNode tail;
	LinkNode dummy;
	
//	public ADTLinkedList() {
//		head = tail = dummy = null;
//		head.setNext(dummy);
//		dummy.setNext(tail);
//	}
//	
//	public ADTLinkedList(Object item) {
//		head = tail = dummy = null;
//		head.setNext(dummy);
//		dummy.setNext(tail);
//		dummy.setItem(item);
//	}
	
	public static boolean isEmpty() {
		return (head == null);
	}
	
	public int size() {
		int count = 0;
		while (head != null) {
			head.getNext();
			count++;
			return count;
		}
		return count;
	}
	
	public void insert(LinkNode newNode) {
		// If list is empty
		if (isEmpty()) {
//			head = newNode;
//			head.setNext(newNode);
			
			newNode.setNext(head);
            head = newNode;
            tail = newNode.getNext();
		}
		
		LinkNode curr = head.getNext();
		
		while(curr.getNext() != null) {
			System.out.println("inside");
			if (curr.getNext() == this.tail) {
				newNode.setNext(curr.getNext());
				curr.setNext(newNode);
				break;
			}
			curr.setNext(curr.getNext());
		}
	}
	
	public void delete(Object item) {
		LinkNode curr = head.getNext();
		
		while(curr.getNext().getNext() != null && curr.getItem() != item) {
			if(curr.getNext().getItem() == item){
				LinkNode temp = curr.getNext().getNext(); curr.setNext(null);
				curr.setNext(temp);
			}
			curr = curr.getNext();
		}
	}
	
	public void showData() {
		LinkNode curr = head.getNext();
		int i = 0; 
		
		while(curr.getNext().getNext() != null) {
			System.out.println("Item " + i + " : " + curr.getItem()); 
			
			if(curr.getNext() == null) {
				break; 
			}
			i++;
			curr = curr.getNext();
		}
	}
	
	
	

	public static void main(String[] args) {
		
		ADTLinkedList<String> list = new ADTLinkedList<String>();
		
		list.insert(new LinkNode("Hello1"));
		list.showData();
		
	}
}
