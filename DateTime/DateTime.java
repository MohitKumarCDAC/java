package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class DateTime {
	public static void main(String[] args)
	{
		LocalDateTime time=LocalDateTime.now();
		System.out.println(time);
		LocalDate date=LocalDate.now();
		System.out.println(date);
		LocalTime t=LocalTime.NOON;
		LocalTime t1=LocalTime.MIDNIGHT;
		LocalTime t2=LocalTime.now();
		System.out.println(t);
		System.out.println(t1);
		System.out.println(t2);
		ZoneId zone=ZoneId.of("Asia/Kolkata");
		LocalTime time1=LocalTime.now(zone);
		System.out.println("India:"+time1);
		LocalTime time3=LocalTime.of(11,44,40);
		System.out.println("myTime:"+time3);
	
	}

}
