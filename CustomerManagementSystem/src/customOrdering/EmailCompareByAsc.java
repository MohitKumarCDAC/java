package customOrdering;

import java.util.Comparator;

import com.app.customer.Customer;

public class EmailCompareByAsc implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		return o1.getEmail().compareTo(o2.getEmail());
	}


}
