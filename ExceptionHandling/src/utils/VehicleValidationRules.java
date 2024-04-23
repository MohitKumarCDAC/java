package utils;




import java.time.LocalDate;
import java.util.Date;

import custom_exceptions.FuelTypeCheck;
import custom_exceptions.LisenceExpir;
import custom_exceptions.SpeedOutOfRangeException;
import tester.TestValidateSpeed;
//import utils.VechicleFuelTypeCheck.Fuel;

/*
 * Will contain different method for validation rules
 */
public class VehicleValidationRules {
	enum Fuel
	{
		PETROL,CNG,EV;
	}
	// add speed limits as constants
	public static final int MIN_SPEED;
	public static final int MAX_SPEED;
	public static  Date DATE;
	static {
		// init static data members
		MIN_SPEED = 40;
		MAX_SPEED = 80;
		
		
	}

//add public static (since it's not using any instance vars) 
//	 method to validate speed
//	 can satisfy the javac : using try-catch OR throws
//	 using throws : to use centralized exc handling
	
	//validate speed method
	public static void validateSpeed(int speed) 
			throws SpeedOutOfRangeException {
		
		if (speed < MIN_SPEED)
			throw new SpeedOutOfRangeException("Speed too low !!!!");
		if (speed > MAX_SPEED)
			throw new SpeedOutOfRangeException("Speed too high , FATAL !!!!");
		System.out.println("speed within range...");
	}
	
	//lisence checking method 
	
	public static void checkLisence(LocalDate ld) throws LisenceExpir{
		
		if(ld.isBefore(LocalDate.now())) {
			throw new LisenceExpir("You use this Liceance..........");
		}
		else if(ld.isAfter(LocalDate.now())) {
			throw new LisenceExpir("lisence Expired");
		}
		else if(ld.isEqual(LocalDate.now()))
		{
			throw new LisenceExpir("Today is Last day of yor Lisence!Pls Renew it.. ");
		}
		else
			throw new LisenceExpir("Date Mismatch!!!!!!!!!");
		
	}
		
//		if(ld.before(DATE)) {
//			System.out.println("Now you Use");
//		}if(ld.after(ld))
//			//System.out.println("Your lisence Expired!pls do Renewal");
//			throw new LisenceExpir("Your lisence Expired!pls do Renewal");
//		}
		
	//Fuel checking method 
	
	public static void fuelCheck(String fuel)throws FuelTypeCheck
	{
		if((fuel.equals(Fuel.PETROL.name()))||(fuel.equals(Fuel.CNG.name()))||(fuel.equals(Fuel.EV.name())))
		{
			System.out.println("Permit to Fuel");
		}else
			
			throw new FuelTypeCheck("Wrong Entered!");
		}

	
	

	
}
