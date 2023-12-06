package CodingExam;

import java.util.HashSet;
import java.util.Set;

public class FindoutCommonElementOfArraay {
	public static void main(String[]args) {
		
		int []arr = {80,35,40,75,100,60};
		int []arr2 = {80,90,40,75,50,70};
		
		
		

		
		commonElement(arr, arr2);
		System.out.println("==========================");
		printUnion(arr, arr2);
	}
	
	////////// Create a method ///////////
	static void commonElement(int arr[], int arr2[]) {
		Set<Integer>s = new HashSet<>();
		
		for(int i = 0; i < arr.length; i++) {
			s.add(arr[i]);
		}
		
		for(int i = 0; i < arr2.length; i++) {
			if(s.contains(arr2[i])) {
				System.out.println(arr2[i]+" ");
			}
		}
		
	}
	
	//////////////// Create a method for Union elements from this element///////////
	static void printUnion(int []arr, int []arr2) {
		Set<Integer> u = new HashSet<>();
		
		for(int i = 0 ; i <arr.length; i++) {
			u.add(arr[i]);
		}
		
		for(int i = 0 ; i <arr2.length; i++) {
			u.add(arr2[i]);
		}
		System.out.println("=============Union ===========");
		System.out.println(u);
	}
}
