package com.app.fruits;

import java.util.Scanner;

public abstract class Fruit {
	//data members
	private String name;
	private String color;
	private double weight;
	private boolean fresh;
	Scanner sc=new Scanner(System.in);
	
	
	public boolean isFresh() {
		return fresh;
	}
	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}
	//constructor(parametrize)
//	public Fruit(String name,String color,double weight)
//	{
//		super();
////		this.name=name;
////		this.color=color;
////		this.weight=weight;
//		System.out.println("Fruits name:");
//		name=sc.next();
//		System.out.println("Fruits Color:");
//		color=sc.next();
//		System.out.println("How many kg you take:");
//		weight=sc.nextDouble();
//	}
	public Fruit()
	{
		super();
		System.out.println("Fruits name:");
		name=sc.next();
		System.out.println("Fruits Color:");
		color=sc.next();
		System.out.println("How many kg you take:");
		weight=sc.nextDouble();
		System.out.println("Fruits Fresh(msg:true) or not Fresh(msg:false):");
		fresh=sc.nextBoolean();
	}
	@Override
	public String toString()
	{
		return ("Fruit:"+"Name:"+name+" "+"color:"+color+" "+"Weight:"+weight);
	}
	//taste method for all(mango,apple,orange)here we declare only and use all sub classes
	
	public abstract String getTaste();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	

}
