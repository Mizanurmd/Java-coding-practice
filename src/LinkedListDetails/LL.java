package LinkedListDetails;

public class LL {
	// Create a node class
	Node head;
	class Node{
		String data;
		Node next;
		
		// Create constructor
		Node(String data){
			this.data= data;
			this.next= null;
		}
	}
	
	// add fast
	public void addFast(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
		
	}
	
	// addlast 
	
	public void addLast(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		Node currNode = head;
		while(currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;
	}
	
	// print list
	public void prinList() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		Node currNode = head;
		while(currNode != null) {
			System.out.print(currNode.data + " ->");
			currNode = currNode.next;
		}
		System.out.println("NULL");
	}
	

	public static void main(String[] args) {
		LL list = new LL();
		list.addFast("A");
		list.addFast("B");
		list.addFast("C");
		list.addFast("D");
		
		list.prinList();
		
		list.addLast("List");
		
		list.prinList();
		
		list.addFast("Fast");
		
		list.prinList();
		
		
	}

}
