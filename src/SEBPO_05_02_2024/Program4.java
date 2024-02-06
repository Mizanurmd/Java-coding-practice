package SEBPO_05_02_2024;

public class Program4 {
	public static void main(String[] args) {
		new Minor();
		//System.out.println(y); //ans: compilation fails
	}

}

class Uber{
	static int y =2;
 Uber(int x) {
		this();
		y= y*2;
	}
 public Uber() {
	y++;
}
}

// Another class child 
class Minor extends Uber{
	Minor(){
		super(y);
		y = y+3;
	}
	
}
