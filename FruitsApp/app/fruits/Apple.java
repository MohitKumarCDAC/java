package com.app.fruits;

public class Apple extends Fruit {
//	public Apple(String name,String color,double weight)
//	{
//		super(name,color,weight);
//	}
	public Apple()
	{
		super();
	}
	@Override
	public String toString()
	{
		return ("Apple:"+super.toString()+" "+"Fresh:"+super.isFresh());
	}
	public String getTaste()
	{
		return ("Sweet and sour");
	}
	public void jam()
	{
		System.out.println("Fruit Name:"+getName()+" "+"making jam");
	}

}
