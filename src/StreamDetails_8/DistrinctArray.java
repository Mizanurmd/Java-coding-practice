package StreamDetails_8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DistrinctArray {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(15);
		list.add(25);
		list.add(10);
		list.add(50);
		list.add(10);
		list.add(50);
		System.out.println(list);
		Set<Integer>orgin = new HashSet<>();
		
		for(Integer l : list) {
			if(!orgin.add(l)) {
				
			}
			
		}
		System.out.println("Orginal ="+ orgin);
		System.out.println("============ Distrinc value of Array=========");
		List<Integer>or= list.stream().filter(e-> !orgin.add(e)).collect(Collectors.toList());
		System.out.println(or);
		
	}

}
