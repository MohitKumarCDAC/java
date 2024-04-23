package Bin_file;

import java.util.List;
import java.util.Scanner;
import static utils.IOUtils.*;

import Watch.Watch;

public class RestoreData {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter File name:");
			Object details=readDataFromFile(sc.next());
			System.out.println(details.getClass());
			System.out.println(details);
			System.out.println("Record Fetch:");
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}
