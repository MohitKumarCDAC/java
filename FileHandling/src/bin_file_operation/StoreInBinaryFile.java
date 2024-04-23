package bin_file_operation;
import static utils.IOUtils.*;
import static utils.StudentCollectionUtils.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.app.core.Student;
public class StoreInBinaryFile {

	public static void main(String[] args) {
		//try with resource
		try (Scanner sc=new Scanner(System.in) ){
			Map<String, Student> students = populateMap(populateList());
			System.out.println("Enter File Name");
			storeDataInBinary(students, sc.next());
			System.out.println("Saved");
			
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}
