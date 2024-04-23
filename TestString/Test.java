package TestString;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1=new String("Hello i am here and you are here");
		System.out.println("indexOf operator:"+s1.indexOf("am"));
		System.out.println("lastIndexOf:"+s1.lastIndexOf("here"));//find last value which u search
		//charAt find 4th number character
		System.out.println("charAt:"+s1.charAt(4));
		//charAt find first and last char
		System.out.println(s1.charAt(0)+" "+s1.charAt(s1.length()-1));
	}

}
