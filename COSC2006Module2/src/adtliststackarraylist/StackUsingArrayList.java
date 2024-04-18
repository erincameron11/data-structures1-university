/*
 * https://www.youtube.com/watch?v=oDhdzwd_34k&t=75s
 */

package adtliststackarraylist;

import java.util.ArrayList;

public class StackUsingArrayList {
	
	private ArrayList<Integer> stackDemo;
	
	public StackUsingArrayList() {
		stackDemo = new ArrayList<Integer>();
	}
	
	public void push(Integer N) {
		stackDemo.add(N);
	}
	
	public Integer pop() {
		if (stackDemo.size() == 0) {
			throw new IllegalStateException("Stack is empty.");
		}
		return stackDemo.remove(stackDemo.size() - 1);
	}
	
	public Integer peek() {
		if (stackDemo.size() == 0) {
			throw new IllegalStateException("Stack is empty.");
		}
		return stackDemo.get(stackDemo.size() - 1);
	}
	
	public boolean isEmpty() {
		return (stackDemo.size() == 0);
	}
	
	public int size() {
		return stackDemo.size();
	}
	
	public String toString() {
		return "" + stackDemo.toString();
	}
	
	public static void main(String[] args) {
		
		StackUsingArrayList sual = new StackUsingArrayList();
		
		sual.push(12);
		sual.push(20);
		sual.push(32);
		sual.push(44);
		
		System.out.println("Given stack using arraylist is: " + sual);
		System.out.println("Stack size is: " + sual.size());
		System.out.println("Peek operation: " + sual.peek());
		System.out.println("Stack after peek operation: " + sual);
		System.out.println("Pop operation: " + sual.pop());
		System.out.println("Stack after pop operation: " + sual);
		System.out.println("Is the stack empty? " + sual.isEmpty());
	
		sual.pop();
		sual.pop();
		sual.pop();
		System.out.println("Stack after 3 pop operations: " + sual);
		System.out.println("Is the stack empty? " + sual.isEmpty());
	}
}
