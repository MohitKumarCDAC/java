package Pojo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Student implements Serializable{
	private String name;
	private int roll;
	private int marks;
	
	

	public Student(String name, int roll, int marks) {
		super();
		this.name = name;
		this.roll = roll;
		this.marks = marks;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", marks=" + marks + "]";
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getRoll() {
		return roll;
	}



	public void setRoll(int roll) {
		this.roll = roll;
	}



	public int getMarks() {
		return marks;
	}



	public void setMarks(int marks) {
		this.marks = marks;
	}



	public static void main(String[] args) {
		//create a list of student
		ArrayList<Student> s=new ArrayList<Student>();
		s.add(new Student("Rohan", 1, 230));
		s.add(new Student("Sohan", 2, 240));
		s.add(new Student("Mohan", 3, 250));
		s.add(new Student("Cohan", 4, 220));
		
		//call serialization method
		serializeStudent(s);
		
		ArrayList<Student> deserialization=deserializedStudent();
		for(Student std:deserialization)
		{
			System.out.println("Deserialized Student:"+std);
		}
		
	}

	public static void serializeStudent(ArrayList<Student> s)
	{
		try
		{
			//create a file stream
			FileOutputStream fs=new FileOutputStream("student.txt");
			//create a object stream 
			//object--->byte stream
			ObjectOutputStream out=new ObjectOutputStream(fs);
			out.writeObject(s);
			out.close();
			fs.close();
			System.out.println("onject serialized and data is saved");
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static ArrayList<Student> deserializedStudent()
	{
		ArrayList<Student> student=null;
		try {
		//create a fileInputStream object to fetch the data
		FileInputStream fi=new FileInputStream("student.txt");
		//create a ObjectInputStream
		ObjectInputStream in=new ObjectInputStream(fi);
		student=(ArrayList<Student>) in.readObject();
		in.close();
		fi.close();
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		return student;
	}
}
