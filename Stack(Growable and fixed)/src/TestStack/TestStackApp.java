package TestStack;

import java.util.Scanner;

import com.app.stack.Customer;
import com.app.stack.FixedStack;
import com.app.stack.GrowableStack;
import com.app.stack.Stack;

public class TestStackApp {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			boolean exit=false;
			Stack ref=null;
			while(!exit)
			{
				System.out.println("1.Fixed stack");
				System.out.println("2.Grwoable stack");
				System.out.println("3.push");
				System.out.println("4.pop");
				System.out.println("5.exit");
				try {
				
				switch(sc.nextInt())
				{
				case 1:
					if(ref==null)
						ref=new FixedStack();
					else
						System.out.println("you have already chose a stack");
				break;
				case 2:
					if(ref==null)
						ref=new GrowableStack();
					else
						System.out.println("you have already chose a stack");
				break;
				case 3://push
					System.out.println("Enter customer Details:");
					ref.push(new Customer());
					break;
				case 4:
					//pop
					System.out.println("Customer Details:");
					System.out.println(ref.pop());
					break;
				
					
				case 5:
					exit=true;
					break;
				}
				}catch(Exception e)
				{
					System.out.println(e);
				}
			}
		}

	}

}
