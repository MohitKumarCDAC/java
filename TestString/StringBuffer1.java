package TestString;

public class StringBuffer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s1=new StringBuffer();
		System.out.println("capacity:"+s1.capacity());
		s1.insert(0, "hello anjali how are You!i am fine bebs and how are you bebs!jhdfghjgf");
		System.out.println(s1);
		s1.setCharAt(0, 'm');
		System.out.println(s1);
		System.out.println("length:"+s1.length());
		System.out.println("capacity:"+s1.capacity());
		s1.setLength(2000);
		System.out.println("capacity:"+s1.capacity());//change capacity of stringBuffer
		s1.insert(10,"momo u are getting drink");
		System.out.println("After insert new value:"+s1);
		//delete
		System.out.println("delete text:"+s1.delete(10, 30));
		//replace
		s1.replace(10,16, "momo");
		System.out.println(s1);
		

	}

}
