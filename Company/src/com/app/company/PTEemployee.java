package com.app.company;

import java.time.LocalDate;

public class PTEemployee extends Employee{
	
		private double hourlypayment;

		public PTEemployee(String name, LocalDate dateOfjoining, String phoneNumber, String aadharnumber,
				double hourlypayment) {
			super(name, dateOfjoining, phoneNumber, aadharnumber);
			this.hourlypayment = hourlypayment;
		}

		public String toString()
		{
			return super.toString()+":"+"Hourly Payment:"+hourlypayment;
		}
		
}
