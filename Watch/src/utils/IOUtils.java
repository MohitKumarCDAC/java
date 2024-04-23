package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import Watch.Watch;

public class IOUtils {
	
	public static void InsertDataIntoFile(List<Watch> list,String filename)throws IOException
	{
		try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(filename))) {
			out.writeObject(list);			
		}
	}
	public static Object readDataFromFile(String filename)throws IOException,ClassNotFoundException
	{
		try (ObjectInputStream in=new ObjectInputStream(new FileInputStream(filename))){
			return in.readObject();	
		}
	}

}
