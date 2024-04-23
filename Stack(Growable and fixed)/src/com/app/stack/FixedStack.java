package com.app.stack;

public class FixedStack implements Stack{
	protected Customer[] customers;
	 protected int top;
	public FixedStack() {
		customers=new Customer[stack_size];
		top=-1;
	}
	public void push(Customer customer)throws StackOverFlowException
	{
		if(top<customers.length-1)
		{
			customers[++top]=customer;
		}
		else
			throw new StackOverFlowException("stack full!"); 
	}
	public Customer pop()throws StackUnderFlowException
	{
		if(top == -1)
			throw new StackUnderFlowException("stack is empty");
		return customers[top--];
	}

}
