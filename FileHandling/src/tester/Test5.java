package tester;
import static utils.StudentCollectionUtils.*;

import java.nio.file.DirectoryStream.Filter;
import java.util.Map;

import com.app.core.Student;
import com.app.core.Subject;
public class Test5 {

	public static void main(String[] args) {
		//  Display names of students enrolled in a specified subject , securing marks > specified marks
		//i/p : subject name , marks
		Map<String,Student>studentmap=populateMap(populateList());
		Subject sub=Subject.valueOf("JAVA");
		double minmarks=4.5;
		studentmap.values().
		stream().
		filter(student->student.getSubject().equals(sub)&& student.getGpa()>minmarks).
		map(student ->student.getName()).forEach(i->System.out.println(i));
		
		
	}

}
