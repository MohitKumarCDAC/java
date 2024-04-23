package tester;
import static utils.StudentCollectionUtils.*;

import java.util.Map;

import com.app.core.Student;
import com.app.core.Subject;
public class Test6 {

	public static void main(String[] args) {
		//Suppose a subject faculty is unavailable n then subject is cancelled . Collect the specified subject student into the list n display it.
		//i/p : subject name
		Map<String, Student> studentMap = populateMap(populateList());
		Subject subjectname=Subject.valueOf("JAVA");
		studentMap.values().//Collection<Student>
		stream().      //Stream<Student>
		filter(student->student.getSubject().equals(subjectname));
		
	}

}
