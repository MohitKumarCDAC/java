package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

import com.app.core.Student;

public interface IOUtils {
	
	public static void storeDataInBinary(Map<String, Student> students,String filename)throws IOException
	{
		//javaApp--->OOS---->bin strm------>FOS----->binary File
		//write in file
		try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(filename))) {
			out.writeObject(students);
		}
		
	}
	//read in file
	//javaApp<------OOS<---------binstrem<------FOS<--------binaryFile
	public static Object readFromFile(String filename)throws IOException,ClassNotFoundException
	{
		try(ObjectInputStream in=new ObjectInputStream(new FileInputStream(filename)))
		{
			return in.readObject();
		}
		
	}

}
