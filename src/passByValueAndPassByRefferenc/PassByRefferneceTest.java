package passByValueAndPassByRefferenc;

public class PassByRefferneceTest {
	public static void main(String[] args) {
		PassByRefferenc a = new PassByRefferenc();
		a.name ="BMW";
		a.mileAge = 10.5f;
		a.cost = 175;
		System.out.println("===========First time A ==================");
		System.out.println(a.name);
		System.out.println(a.mileAge);
		System.out.println(a.cost);
		
		PassByRefferenc b;
		System.out.println("=================first time b ============");
		b = a;
		System.out.println(b.name);
		System.out.println(b.mileAge);
		System.out.println(b.cost);
		
		b.name="TATA";
		b.mileAge = 20.8f;
		b.cost = 580;
		System.out.println("============Second time b==============");
		System.out.println(b.name);
		System.out.println(b.mileAge);
		System.out.println(b.cost);
		
		
		System.out.println("===========First time A ==================");
		System.out.println(a.name);
		System.out.println(a.mileAge);
		System.out.println(a.cost);
		
		if(a == b) {
			System.out.println("True");
		}else {
			System.out.println("false");
		}
		
	}

}
