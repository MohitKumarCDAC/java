package bin_file_operation;
import static utils.IOUtils.*;
import java.util.Scanner;

public class ReadDataFromBinaryFile {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter File name");
			Object details=readFromFile(sc.next());
			System.out.println(details.getClass());
			System.out.println(details);
			System.out.println("Data Restored");
			
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}
