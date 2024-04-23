package com.app.stack;

public class GrowableStack extends FixedStack{

	@Override
	public void push(Customer customer)  {
		if(top<customers.length-1)
		{
			customers[++top]=customer;
		}
		else
		{
			Customer[] temp=new Customer[customers.length*2];
			//array copy
			for(int i=0; i<customers.length; i++)
			{
				temp[i]=customers[i];
				customers=temp;
				customers[++top]=customer;
			}
		}
			 
	}
	
	
	
}
