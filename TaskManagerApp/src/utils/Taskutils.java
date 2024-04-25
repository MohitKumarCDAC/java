package utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static utils.Validation.*;

import com.app.task.Task;
import com.app.task.TaskStatus;

import exception.TaskExcepton;

public class Taskutils {
private  static Scanner sc=new Scanner(System.in);
	public static void addTask(List<Task> tasklist)
	{
		System.out.println("Enter Task Name:");
		String taskName=sc.next();
		
		System.out.println("Enter Description:");
		sc.nextLine();
		String description=sc.nextLine();
		
		System.out.println("Enter Task Date:");
		LocalDate date=validateDate(sc.next());
		
		tasklist.add(new Task(taskName, description, date));
	}
	public static void displayPendingTask(List<Task>tasklist)
	{
		tasklist.stream().filter(p->p.getStatus().equals(TaskStatus.PENDING))
		.forEach(i->System.out.println(i));
	}
	public static void displayAllTask(List<Task>tasklist)
	{
		tasklist.forEach(i->System.out.println(i));
	}
	public static void todayPendingTask(List<Task>tasklist)
	{
		tasklist.stream().filter(i->i.getTaskDate().equals(LocalDate.now()))
		.forEach(i->System.out.println(i));
	}
	
	public static void updateTaskStatus(List<Task>tasklist)throws TaskExcepton
	{
		//update task by taskID
		System.out.println("Enter TaskID:");
		int taskID=sc.nextInt();
		int index=tasklist.indexOf(new Task(taskID));
		if(index==-1)
		{
			throw new TaskExcepton("ID not found:");
		}
		System.out.println("Enter Task Status");
		String status=sc.next();
		tasklist.get(index).setStatus(validateTaskStatus(status));
		
		
	}
	public static void deleteTask(List<Task>tasklist)
	{
		List<Task>removelist=new ArrayList<Task>();
		tasklist.stream().filter(i->i.getStatus().equals(TaskStatus.COMPLETE))
		.forEach(i->{
			System.out.println(i);
			removelist.add(i);
		});
		removelist.forEach(r->tasklist.remove(r));
		System.out.println("Removed");

		for(Task t:tasklist)
		{
			
		}
	
	}
	public static void taskfalse(List<Task>tasklist) {
//		System.out.println("Enter Task Id");
//		int taskId=sc.nextInt();
        for (Task task : tasklist) {
            if (task.getStatus().equals(TaskStatus.COMPLETE)) {
                task.setActive(false);
                return;
            }
            }
        }

	public static void populatedTask(List<Task>tasklist)
	{
		tasklist.add(new Task("Program", "java", LocalDate.parse("2023-10-10")));
		tasklist.add(new Task("calculate", "file", LocalDate.parse("2024-04-25")));
		tasklist.add(new Task("FunctionManage", "Quantum", LocalDate.parse("2024-01-10")));
		tasklist.add(new Task("Program", "cpp", LocalDate.parse("2023-11-20")));
		tasklist.add(new Task("check", "sirMessage", LocalDate.parse("2024-02-10")));
		tasklist.add(new Task("market", "sellLaptop", LocalDate.parse("2024-03-20")));
		tasklist.add(new Task("program", "onPython", LocalDate.parse("2024-04-25")));
		tasklist.add(new Task("Program", "os", LocalDate.parse("2023-10-10")));
		
	}
}
