package StreamDetails_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamUsingFiltter {
	public static void main(String[] args) {
		List<String>languages = new ArrayList<>();
		languages.add("English");
		languages.add("German");
		languages.add("French");
		languages.add("Bangla");
		languages.add("Arabic");
		
		System.out.println(languages);
		System.out.println("============Using for loop =============");
		for(String s : languages) {
			System.out.println(s);
		}
		
		System.out.println("============Using Stream Api =============");
		languages.stream().forEach(System.out::println);
		System.out.println("============Using Stream Api of filtter =============");
		languages.stream().filter(e ->e.equalsIgnoreCase("Bangla"))
		.forEach(System.out::println);
		
		 // Creating an integer Arraylist to store marks 
        ArrayList<Integer> marks = new ArrayList<Integer>(); 
  
        // These are marks of the students 
        // Considering 5 students so input entries 
        marks.add(30); 
        marks.add(78); 
        marks.add(26); 
        marks.add(96); 
        marks.add(79);
        marks.add(33); 
        marks.add(40);
        marks.add(50); 
        marks.add(60);
        System.out.println("============Using Stream Api of filtter =============");
      marks.stream().filter(e-> e >=40).forEach(s->System.out.println(s));
      System.out.println("====================40 number===========");
     List<Integer>inMarks= marks.stream().filter(e-> e <40).map(e-> e +10).collect(Collectors.toList());
      System.out.println(inMarks);
      System.out.println("====================even number===========");
      marks.stream().filter(e->e %2==0).forEach(System.out::println);
      // Creating an integer Arraylist to store marks 
      ArrayList<Integer> marks1 = new ArrayList<Integer>(); 
      Set<Integer> marks2 = new HashSet<>();
      Set<Integer> marks3 = new HashSet<>();
      // These are marks of the students 
      // Considering 5 students so input entries 
      marks1.add(30); 
      marks1.add(78); 
      marks1.add(26); 
      marks1.add(96); 
      marks1.add(79);
      marks1.add(33); 
      marks1.add(40);
      marks1.add(50); 
      marks1.add(60);
      marks1.add(40);
      marks1.add(50); 
      marks1.add(60);
      System.out.println("==============================");
      System.out.println(marks1);
      for(Integer m : marks1) {
    	marks2.add(m);
      }
      System.out.println("Print with duplicate value1====="+marks1);
      System.out.println("Print with duplicate value2====="+ marks2);
      
     
	}

}
