package bin_IO;

import java.util.Scanner;
import static Utils.IOUtils.*;
public class RestoreCustomerDetails {

	public static void main(String[] args) {
	//try with resources
		try (Scanner sc=new Scanner(System.in)){
			System.out.println("Enter File name:");
			Object details=restoreDetails(sc.next());
			System.out.println(details.getClass());
			System.out.println(details);
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}
