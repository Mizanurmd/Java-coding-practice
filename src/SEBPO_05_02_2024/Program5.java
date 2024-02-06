package SEBPO_05_02_2024;

public class Program5 {
	public static void main(String[] args) {
		Beagle b1 = new Beagle();
		Dog dog1 = new Dog();
		Dog dog2 = b1;
		
		Beagle b2 = (Beagle)dog1;
		//Beagle b3 =dog2;
		//Beagle b4 =dog1;
		
		
	}

}

// Create a class 
class Dog{
	
}

// Create another class
class Beagle extends Dog{
	
}
