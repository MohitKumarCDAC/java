package tester;

import static utils.StudentCollectionUtils.populateList;
import static utils.StudentCollectionUtils.populateMap;

import java.util.Map;

import com.app.core.Student;
import com.app.core.Subject;

public class Test4 {

	public static void main(String[] args) {
		
//		Print no of  failures for the specified subject chosen  from user.
	//	i/p : subject name
		//(failure is GPA < 5.0)

		Map<String, Student> studentMap = populateMap(populateList());
		Subject sub=Subject.valueOf("JAVA");
		double failure=studentMap.values().
				stream().
				filter(i->i.getSubject().equals(sub) && i.getGpa()<5.0).
				count();
		System.out.println(failure);

	}

}
