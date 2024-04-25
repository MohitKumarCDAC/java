package TestApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import static utils.Taskutils.*;

import com.app.task.Task;

import compare.CompareByDate;

public class TestMain {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			List<Task> tasklist=new ArrayList<Task>();
			populatedTask(tasklist);
			int choice;
		do
		{
			System.out.println("1.Add Task:");
			System.out.println("2.Display All Task(Pending,IN_Progress,Complete)");
			System.out.println("3.Display all Pending task:");
			System.out.println("4.Display all pending tasks for today :");
			System.out.println("5.Display all tasks sorted by taskDate:");
			System.out.println("6.Task False if task is complete:");
			System.out.println("7.Update Task Status:");
			System.out.println("8.Delete All task That has been Complete");
			System.out.println("0.Exit");
			
			System.out.println("Choose Your Choice:");
			choice=sc.nextInt();
			try
			{
				switch (choice) {
				case 1:
					addTask(tasklist);
					break;
				case 2:
					//display all task
					displayAllTask(tasklist);
					break;
				case 3:
					//display all pending task
					displayPendingTask(tasklist);
					break;
				case 4:
					//display all pending task for today
					todayPendingTask(tasklist);
					break;
				case 5:
					//Display all tasks sorted by taskDate
					Collections.sort(tasklist,new CompareByDate());
					tasklist.forEach(i->System.out.println(i));
					break;
				case 6:
					// task false when task is completed
					taskfalse(tasklist);
					break;
				case 7:
					updateTaskStatus(tasklist);
					break;
				case 8:
					//delete task
					deleteTask(tasklist);
					break;
				case 0:
					System.out.println("bye...bye");
					break;
				}
			}catch (Exception e) {
				e.getStackTrace();
			}
			
		}while(choice!=0);
		}
	}

}
