package customOrdering;

import java.util.Comparator;

import com.app.customer.Customer;

public class sortByDob implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		return o1.getdob().compareTo(o2.getdob());
	}

}
