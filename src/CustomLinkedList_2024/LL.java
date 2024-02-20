package CustomLinkedList_2024;

public class LL {
	Node head;
	private int size;
	LL(){
		this.size =0;
	}

	// Create a Node class here
	class Node {
		String data;
		Node next;

		Node(String data) {
			this.data = data;
			this.next = null;
			size++;

		}
	}

	/// Create a method for adding into LinkedList == add==> First

	public void addFirst(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
			
		}
		newNode.next = head;
		head = newNode;

	}

	/// Create a method for adding into LinkedList == add==> last
	public void addLast(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			newNode = head;
			return;
		}
		Node curNode = head;
		while (curNode.next != null) {
			curNode = curNode.next;
		}
		curNode.next = newNode;

	}
	// Print LinkedList method

	public void printNode() {
		if (head == null) {
			System.out.println("Node is empty");
			return;
		}
		Node curNode = head;
		while (curNode != null) {
			System.out.print(curNode.data + " ==> ");
			curNode = curNode.next;

		}
		System.out.println("NULL");

	}
	
	// Create a method delete first
	public void deleteFirst() {
		if(head == null) {
			System.out.println("Node is empty");
			return;
		}
		size--;
		head = head.next;
	}
	
	// Create a method delete node last
	public void deleteLast() {
		if(head == null) {
			System.out.println("Node is empty");
			return;
		}
		size--;
		if(head.next == null) {
			head = null;
			return;
		}
		
		Node secondNode = head;
		Node lastNode = head.next;
		while(lastNode.next != null) {
			lastNode = lastNode.next;
			secondNode = secondNode.next;
		}
		secondNode.next = null;
		
	}
	
	public int getSize() {
		return size;
		
	}

	public static void main(String[] args) {
		LL list = new LL();
		list.addFirst("a");
		list.addFirst("is");
		list.printNode();
		
		list.addLast("list");
		list.printNode();
		list.addFirst("This");
		list.printNode();
		 list.deleteLast();
		 list.printNode();
		 
		 System.out.println(list.getSize());

	}

}
