package Utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.app.Customer.Customer;
import com.app.Customer.ServicePlan;
import com.app.Customer.ServicePlan.*;

public interface CustomerData {
	

	//add a static method  to return list of Customer
	public static void populatedlist(Map<String, Customer> list)
	{
		
		list.put("mg97274@gmail.com",new Customer("mohit", "kumar", "mg97274@gmail.com", "mohit", 1000, parse("1999-10-10"),ServicePlan.SILVER ));
		list.put("rg97274@gmail.com",new Customer("rohit", "kumar", "rg97274@gmail.com", "rohit", 2000, parse("2000-10-10"),ServicePlan.GOLD ));
		list.put("rg@gmail.com",new Customer("ritesh", "kumar", "rg@gmail.com", "ritesh", 50000, parse("1997-10-10"),ServicePlan.DIAMOND ));
		list.put("anjali@gmail.com",new Customer("anjali", "kumari", "anjali@gmail.com", "anjali", 1000, parse("1996-10-10"),ServicePlan.SILVER ));
		list.put("manisha@gmail.com",new Customer("mansiha", "kumari", "manisha@gmail.com", "manisha", 10000, parse("1992-10-10"),ServicePlan.PLATINUM ));
		list.put("vishal@gmail.com",new Customer("vishal", "kumar", "vishal@gmail.com", "vishal", 1000, parse("1991-10-10"),ServicePlan.SILVER ));
		list.put("kundan@gmail.com",new Customer("kundan", "kumar","kundan@gmail.com", "kundan", 2000, parse("1990-10-10"),ServicePlan.DIAMOND ));
		
		
	}

	static LocalDate parse(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
