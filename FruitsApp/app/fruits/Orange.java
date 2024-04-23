package com.app.fruits;

public class Orange extends Fruit {
//	public Orange(String name,String color,double weight)
//	{
//		super(name,color,weight);
//	}
	public Orange()
	{
		super();
	}
	@Override
	public String toString()
	{
		return ("orange:"+super.toString()+" "+"Fresh:"+super.isFresh());
	}
	public String getTaste()
	{
		return("sour");
	}
	public void juice()
	{
		System.out.println("Fruit Name:"+getName()+" "+"Fruit Weight:"+getWeight()+" "+"extracting juice!");
	}

}
