package bin_IO;

import java.util.HashMap;
import java.util.Map;
import static Utils.CustomerData.*;
import static Utils.IOUtils.*;
import java.util.Scanner;

import com.app.Customer.Customer;

public class StoreCustomerDetails {
	public static void main(String[] args)
	{
		//try with resources
		try (Scanner sc=new Scanner(System.in)){
			Map<String, Customer> customerMap=new HashMap<>();
			populatedlist(customerMap);
			System.out.println("Enter File Name:");
			storeCustomerDetails(customerMap, sc.next());
			System.out.println("Data Saved into file");
			
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
