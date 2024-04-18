package demoadtlinkedlist;

public class DemoADTLinkedList {
	static TestNode head;
	
	// Inner node class
	static class TestNode {
		int stuNum;
		double mark;
		TestNode next;
	
		// Constructor
		TestNode(int stuNum, double mark) {
			this.stuNum = stuNum;
			this.mark = mark;
			next = null;
		}
	
	}
	
	public static DemoADTLinkedList insert(DemoADTLinkedList list, int stuNum, double mark) {
        // Create a new node with given data
        TestNode newNode = new TestNode(stuNum, mark);
        newNode.next = null;

        if (head == null) {
            head = newNode;
        } else {
            TestNode end = head;
            while (end.next != null) {
            	end = end.next;
            }

            end.next = newNode;
        }
        return list;
	}
	
	
	
	
	public boolean remove(int stuNum) {
        TestNode prev = head;
        
     // If the list is empty
        if (prev == null) {
        	// Do nothing
        } else if (prev.stuNum == stuNum) {
            head = head.next;
        }
        
        
        while (true) {
        	TestNode next = prev.next;
        	
            if (next == null) {
                return false;
            } else if (next.stuNum == stuNum) {
                break;
            }
            prev = next;
        }
        
        TestNode next = prev.next;
        prev.next = next.next;
        next.next = null;
        return true;
    }
	
	
	
    public static void printList(DemoADTLinkedList list) {
        TestNode currNode = head;
    
        System.out.print("LinkedList: ");
    
        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print("\n" + currNode.stuNum + " " + currNode.mark);
    
            // Go to next node
            currNode = currNode.next;
        }
    }

}
