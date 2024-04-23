package tester;

import static utils.StudentCollectionUtils.populateList;
import static utils.StudentCollectionUtils.populateMap;

import java.util.Comparator;
import java.util.Map;

import com.app.core.Student;
import com.app.core.Subject;

public class Test3 {
//Print name of specified subject  topper
	//i/p : subject name

	public static void main(String[] args) {
		Map<String, Student> studentMap = populateMap(populateList());
		System.out.println("All students:");
		
		Subject sub=Subject.valueOf("JAVA");
		
		Comparator<Student> comp = (i,j) -> ((Double)i.getGpa()).compareTo(j.getGpa());
		
		Student student = studentMap.values().//Stream<Student>
				stream().
				filter(i->i.getSubject().equals(sub)).max(comp).get();
				
		System.out.println(student);
		
		
		
		 
		

	}

}
