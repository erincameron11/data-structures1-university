package demodoublylinked;

import java.util.NoSuchElementException;

public class DoublyLinkedDemo<T> {
 
    private Node head;
    private Node tail;
    private int size;
     
    public DoublyLinkedDemo() {
        size = 0;
    }
    
    
    private class Node {
        T element;
        Node next;
        Node prev;
 
        public Node(T element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }
 
    
    public int size() { 
    	return size; 
    }
     
   
    public boolean isEmpty() { 
    	return size == 0; 
    }
     
   
    public void addFirst(T element) {
        Node temp = new Node(element, head, null);
        
        if(head != null ) {
        	head.prev = temp;
        }
        
        head = temp;
        
        if  (tail == null) { 
        	tail = temp;
        }
        size++;
        System.out.println("adding first: " + element);
    }
     
   
    public void addLast(T element) {
         
        Node temp = new Node(element, null, tail);
        
        if(tail != null) {
        	tail.next = temp;
        }
        
        tail = temp;
        if(head == null) { 
        	head = temp;
        }
        size++;
        System.out.println("adding last: " + element);
    }
     
    
    public void iterateForward(){
         
        System.out.println("Forward: ");
        Node temp = head;
        while(temp != null){
            System.out.println(temp.element);
            temp = temp.next;
        }
    }
     
   
    public void iterateBackward(){
         
        System.out.println("Backwards: ");
        Node temp = tail;
        while(temp != null){
            System.out.println(temp.element);
            temp = temp.prev;
        }
    }
     
   
    public T removeFirst() {
        if (size == 0) 
        	throw new NoSuchElementException();
       
        Node temp = head;
        head = head.next;
        head.prev = null;
        size--;
        System.out.println("deleted: " + temp.element);
        return temp.element;
    }
     
    
    public T removeLast() {
        if (size == 0) 
        	throw new NoSuchElementException();
        
        Node temp = tail;
        tail = tail.prev;
        tail.next = null;
        size--;
        System.out.println("deleted: " + temp.element);
        return temp.element;
    }
     
    public static void main(String a[]){
         
    	DoublyLinkedDemo<String> list = new DoublyLinkedDemo<String>();
        list.addFirst("Hello");
        list.addFirst("I'm First Now");
        list.addLast("I'm Last");
        System.out.println(list.isEmpty());
        
        list.iterateForward();
    }
}