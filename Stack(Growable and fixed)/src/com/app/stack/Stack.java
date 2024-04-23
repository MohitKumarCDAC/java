package com.app.stack;

import java.util.EmptyStackException;

public interface Stack {
	int stack_size=5;
	Customer pop()throws StackUnderFlowException;
	void push(Customer customer)throws StackOverFlowException;

}
