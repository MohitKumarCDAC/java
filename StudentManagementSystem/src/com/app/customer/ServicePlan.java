package com.app.customer;
//SILVER : 1000 
//GOLD : 2000
//DIAMOND : 5000
//PLATINUM : 10000
//service plan 
public enum ServicePlan {
	SILVER(1000),GOLD(2000),DIAMOND(5000),PLATINUM(10000);
	
	private double plan;
	//constructor
	private ServicePlan(double plan)
	{
		this.plan=plan;
	}
	public double getPlan()
	{
		return plan;
	}
	@Override
	public String toString()
	{
		return name()+":"+plan;
	}

}
