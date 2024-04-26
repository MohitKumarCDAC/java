package utils;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import com.app.customer.Customer;

public interface IOUtils {
	
	public static  void storedataInFile(List<Customer>list,String filename)throws IOException
	{
		try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(filename))) {
			out.writeObject(list);	
		}
	}
	
	public static Object restoreDataFile(String filename)throws IOException,ClassNotFoundException
	{
		try(ObjectInputStream in=new ObjectInputStream(new FileInputStream(filename))) {
			return in.readObject();
		}
	}
	
	
		
	

}
