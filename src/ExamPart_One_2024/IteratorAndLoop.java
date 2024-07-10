package ExamPart_One_2024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorAndLoop {
	public static void main(String[] args) {
		//Q #10) Write a Java Program to iterate ArrayList using for-loop, while-loop, and advance for-loop.
		List<Integer>list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(50);
		list.add(5);
		list.add(30);
		System.out.println(list);
		System.out.println("=====print using Iterator=========");
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println("\n=======Print using Advanced Loop======");
		for(Object obj :list) {
			System.out.print(obj+" ");
		}
		System.out.println("\n=======Print using for Loop======");
		for(int i =0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		
	}

}
