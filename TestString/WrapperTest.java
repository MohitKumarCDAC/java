package TestString;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class WrapperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> k=new ArrayList<Integer>();
		k.add(1);
		k.add(2);
		k.add(3);
		System.out.println(k);
		//autoboxing(conver primiptive data type to wrapper that means Object)
		int a=10;
		Integer i= Integer.valueOf(a);//convert int(primitive) to Integer(wrapper)
		Integer j=a;//autoboxing(convert wraper object to primptive)
		System.out.println(j);
		
		//unboxing()
		Integer b=new Integer(3);
		int n=b.intValue();//converting Integer to int
		int u=b;//unboxing
		System.out.println(u);
		

	}

}
