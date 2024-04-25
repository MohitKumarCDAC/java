package utils;

import java.time.LocalDate;
import java.util.List;

import com.app.task.Task;
import com.app.task.TaskStatus;

public class Validation {
	
	public static TaskStatus validateTaskStatus(String status)
	{
		
		return TaskStatus.valueOf(status.toUpperCase());
	}
	
	public static LocalDate validateDate(String date)
	{
		return LocalDate.parse(date);
	}

}
