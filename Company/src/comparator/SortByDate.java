package comparator;

import java.util.Comparator;

import com.app.company.Employee;

public class SortByDate implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getDateOfjoining().compareTo(o2.getDateOfjoining());
	}

}
