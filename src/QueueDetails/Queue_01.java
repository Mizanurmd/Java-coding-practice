package QueueDetails;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_01 {
	public static void main(String[] args) {
		Queue<String> q = new PriorityQueue<>();

		q.add("Bangladesh");
		q.add("India");
		q.add("Nepal");
		q.add("Malaysia");
		q.add("Pakistan");
		q.add("Buthun");
		q.add("Sri-Longka");
		System.out.println("All countries are : " + q.size());
		System.out.println("All countries are : " + q);
		System.out.println("Show from Queue : " + q.element());// If Queue is empty the throw noSearchElement exception
		System.out.println("Peek from Queue : " + q.peek());// if Queue is empty then return null

		System.out.println("Remove element from Queue : " + q.remove());// If Queue is empty the throw noSearchElement
																		// exception
		System.out.println("All countries are : " + q.size());
		System.out.println("Remove element from Queue : " + q.poll());// if Queue is empty then return null
		System.out.println("All countries are : " + q.size());

	}

}
