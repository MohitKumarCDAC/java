package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import com.app.company.Employee;

import CustomException.CompanyException;

public interface IOUtils {
	public static void storeDataInFile(List<Employee>list,String filename)throws IOException
	{
		try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(filename))) {
			out.writeObject(list);
		}
	}
	
	public static Object restoreData(String filename)throws IOException,ClassNotFoundException,InvalidClassException
	{
		try (ObjectInputStream in=new ObjectInputStream(new FileInputStream(filename))){
			return in.readObject();
		}
	}

}
