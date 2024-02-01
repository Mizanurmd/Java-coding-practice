package ComparableVsComaparator;

import java.util.Comparator;

public class ComaratorTest implements Comparator<Employee> {

	@Override
	public int compare(Employee e, Employee e2) {
		// TODO Auto-generated method stub
		return e.getId()-e2.getId();
	}

}
