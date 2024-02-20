package LinkedListDetails;

public class LinkedListPractise {
	Node head;
	
	// create a class here 
	class Node{
		String data;
		Node next;
		
		Node(String data){
			this.data = data;
			this.next = null;
		}
			
	}
	
	// Create a method for first add
	public void addFirst(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		newNode.next= head;
		head = newNode;
	
	}
	
	// Create a method add last
	public void addLast(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
	Node curNode = head;
	while(curNode.next !=null) {
		curNode = curNode.next;
	}
	curNode.next = newNode;
		
	}
	
	// print 
	public void printList() {
		if(head == null) {
			System.out.println("Node is empty");
			return;
		}
		Node curNode = head;
		while(curNode !=null) {
			System.out.print(curNode.data+ " => ");
			curNode = curNode.next;
		}
		System.out.println("NULL");
	}
	
	// Create a method for delete first
	public void deleteFirst() {
		if(head == null) {
			System.out.println("Node is empty");
			return;
		}
		head = head.next;
	}
	// Create a method for delete first
	public void deleteLast() {
		if(head == null) {
			System.out.println("Node is empty");
			return;
		}
		
		if(head.next ==null) {
			head = null;
			return;
		}
		
		
		Node secondNode = head;
		Node lastNode = head.next;
		while(lastNode.next !=null) {
			lastNode = lastNode.next;
			secondNode = secondNode.next;
		}
		secondNode.next=null;
	}
	
	public static void main(String[] args) {
		
		LinkedListPractise list = new LinkedListPractise();
		list.addFirst("a");
		list.addFirst("is");
		list.printList();
		list.addLast("list");
		list.printList();
		list.addFirst("This");
		list.printList();
		list.deleteFirst();
		list.printList();
		
	}
	

}
