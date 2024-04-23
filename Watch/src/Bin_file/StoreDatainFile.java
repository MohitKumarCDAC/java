package Bin_file;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static utils.IOUtils.*;

import static utils.utils.*;
import Watch.Watch;

public class StoreDatainFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(Scanner sc=new Scanner(System.in)) {
			List<Watch> list=new ArrayList<Watch>();
			populatelist(list);
			System.out.println("Enter File name:");
			InsertDataIntoFile(list, sc.next());
			System.out.println("Data Saved into file!");
			
			
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}
