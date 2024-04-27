package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.List;

import com.store.app.Items;

public class IOUtils {
	
	public static void storeItemInFile(List<Items>list,String filename)throws IOException
	{
		try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(filename))){
			out.writeObject(list);			
		}
	}
	
	public static Object restoreDataFromFile(String filename)throws IOException,ClassNotFoundException
	{
		try (ObjectInputStream in=new ObjectInputStream(new FileInputStream(filename))){
			return in.readObject();
		}
	}
	
	

}
