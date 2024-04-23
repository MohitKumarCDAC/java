package custom_ordering;

import java.util.Comparator;

import com.app.Customer.Customer;

public class CustomerAscDOBComparetor implements Comparator<Customer> {

	public int compare(Customer o1,Customer o2)
	{
		//ascending order
		return o1.getDob().compareTo(o2.getDob());
	}

}
