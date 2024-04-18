package assignment3;

public class NodeNew {
	int stuNum;
	double mark;
	NodeNew next;
	
	// TESTING for Final Exam: Constructor
	NodeNew() {
		next = null;
	}
	
	// Constructor
	NodeNew(int stuNum, double mark) {
		this.stuNum = stuNum;
		this.mark = mark;
		next = null;
	}
	
	public NodeNew next() {
		return next;
	}
	
	public void setNext(NodeNew next) {
		this.next = next;
	}
	
	public double getMark() {
		return mark;
	}
	
	public void setMark(double mark) {
		this.mark = mark;
	}
	
	public int getStuNum() {
		return stuNum;
	}
	
	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}
}
