package demoadtlinkedlist;

public class N {
	private int stuNum;
	private double mark;
	private N next;
	
	public N() {
		next = null;
	}
	
	// 2-arg Constructor - for first nodes
	public N(int stuNum, double mark) {
		this.stuNum = stuNum;
		this.mark = mark;
		next = null;
	}
	
	// 3-arg Constructor
	public N(int newStuNum, double newMark, N next) {
		this.stuNum = newStuNum;
		this.mark = newMark;
		this.next = next;
	}
		
//	// 1-arg Constructor
//	public N(Object newItem) {
//		item = newItem;
//		next = null;
//	}
//	
//	// 2-arg Constructor
//	public N(Object newItem, N<T> nextNode) {
//		item = newItem;
//		next = nextNode;
//	}
	
	public void setStuNum(int newStuNum) { 
		stuNum = newStuNum;
	}
	
	public Object getStuNum() { 
		return stuNum;
	}
	
	public void setMark(double mark) { 
		this.mark = mark;
	}
	
	public Object getMark() { 
		return mark;
	}
	
	public void setNext(N nextNode) { 
		next = nextNode;
	}
	
	public N getNext() { 
		return next;
	}	
}
