package Utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

import com.app.Customer.Customer;

public interface IOUtils {
	//add a static method to store product details(map) in binary file user.ser
	static void storeCustomerDetails(Map<String, Customer> students,String filename)throws IOException
	{
		// Java App --> OOS --> bin strm --> FOS --> bin file
		try (ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(filename))){
			out.writeObject(students);
		}
	}
	
	static Object restoreDetails(String filename)throws IOException,ClassNotFoundException,InvalidClassException
	{
		// Java App <----OIS <----FIS <--- bin file
		try (ObjectInputStream in=new ObjectInputStream(new FileInputStream(filename))){
			return in.readObject();	
		}
		
	}
}
