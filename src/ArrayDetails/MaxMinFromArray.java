package ArrayDetails;

public class MaxMinFromArray {
	public static void main(String[] args) {
		int []num = {40,50,60,320,80,90,300,70,100,500};
		int max= num[0], min = num[0];
		for(int i =0; i<num.length; i++) {
			if(num[i]> max) {
				max =num[i];
				
			}else if(num[i]<min) {
				min = num[i];
			}
			
		}
		
		System.out.println("Max ="+ max);
		System.out.println("Min = "+ min);
		
		
	}

}
