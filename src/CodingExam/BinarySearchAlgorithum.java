package CodingExam;



public class BinarySearchAlgorithum {
	public static void main(String[]args) {
		
		int []a ={10,20,30,4,0,1,6,40,80,300,70,100};
		
		int item =40;
		int left = 0, right = a.length-1, mid;
		
		
		
		while(left <= right) {
			mid =(left + right)/2;
			if(a[mid]==item) {
				System.out.println("Index number is founded = "+ mid);
				return;
			}else if(a[mid] < item) {
				left = mid +1;
			}else {
				right = mid -1;
			}
			
		}
		
		System.out.println("Index number is not founded.");
		
	}

}
