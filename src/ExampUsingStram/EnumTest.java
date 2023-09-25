package ExampUsingStram;

enum Day {
	STARTDAY, SUNDAY, MONDAY, WESNESDAY, THRUSDAY, FRIDAY
}

public class EnumTest {
	public static void main(String[] args) {
		System.out.println(Day.FRIDAY);
		System.out.println("All Enum data prin here ==========");

		for (Day d : Day.values()) {
			System.out.println(d);
		}

	}

}
