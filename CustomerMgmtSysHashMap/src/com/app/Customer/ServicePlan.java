 package com.app.Customer;

public enum ServicePlan {
	SILVER(1000),GOLD(2000),PLATINUM(10000),DIAMOND(5000);
	
	private int plan;
	//constructor for getting plan value
	private ServicePlan(int plan)
	{
		this.plan=plan;
	}
	@Override
	public String toString()
	{
		return name()+"::"+plan;
	}
	public int getPlan()
	{
		return plan;
	}
	
}
