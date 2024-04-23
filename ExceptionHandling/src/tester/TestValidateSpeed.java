package tester;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

//import custom_exceptions.FuelTypeCheck;
import custom_exceptions.SpeedOutOfRangeException;

//import static utils.VechicleFuelTypeCheck.fuelCheck;

import static utils.VehicleValidationRules.*;

public class TestValidateSpeed {

	

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {//try with reference
			
			//fuel check method
			
			System.out.println("Enter Fuel type:");
			String fuel=sc.nextLine().toUpperCase();
			fuelCheck(fuel);
			
			//speed check method
			
			System.out.println("Enter current speed");
			validateSpeed(sc.nextInt());
			//License expiry date check
			System.out.println("Enter date as(dd/mm/yyyy)");
			sc.nextLine();
			
			//check lisence validate
			
			System.out.println("Enter Date(yyyy-mm-dd)and check Lisence Validate:");
			LocalDate ld=LocalDate.parse(sc.next());//parse string to date
			checkLisence(ld);
			
			
			
			
			
			System.out.println("end of try...");
		} // JVM : sc.close() => clean up of the resources :std i/p stream
		catch (Exception e) {
			System.out.println(e);//name + err mesg
		}
		System.out.println("main over....");
		
		
			
		
		

	}

}
