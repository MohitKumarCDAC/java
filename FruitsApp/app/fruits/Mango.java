package com.app.fruits;

public class Mango extends Fruit {
//	public Mango(String name,String color,double weight)
//	{
//		super(name,color,weight);
//	}
	public Mango() {
		super();
	}
	@Override
	public String toString()
	{
		return ("Mango:"+super.toString()+" "+"Fresh:"+super.isFresh());
	}
	public String getTaste()
	{
		return("sweet");
	}
	public void pulp() {
		System.out.println("Fruit Nname:"+getName()+" "+"Fruit color:"+getColor()+":"+"creating pulp");
	}
}
