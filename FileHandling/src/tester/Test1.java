package tester;
import static utils.StudentCollectionUtils.*;

import java.nio.file.DirectoryStream.Filter;
import java.util.Comparator;
import java.util.Map;

import com.app.core.Student;
import com.app.core.Subject;
public class Test1 {

	public static void main(String[] args) {
		//Dispaly student details(map)
		//sorted as per 
// Display  student details for specified subject , sorted as per DoB

		Map<String, Student> studentMap = populateMap(populateList());
		System.out.println("All students:");
		studentMap.forEach((k,v)->System.out.println(v));
		Subject subject=Subject.DBT;//subject name
		Comparator<Student>studentcpm=(s1,s2)->s1.getDob().compareTo(s2.getDob());
		System.out.println("Sorted student");
		studentMap.values().//collection<Student
		stream().//Stream<Student>
		filter(s->s.getSubject()==subject).//Stream<Subject>filter student
		sorted(studentcpm).//sorted data
		forEach(s->System.out.println(s));//terminal operation
		
		
		
		
		
		
		
		
		
	}

}
