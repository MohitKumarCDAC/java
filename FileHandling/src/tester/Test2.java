package tester;

import static utils.StudentCollectionUtils.populateList;
import static utils.StudentCollectionUtils.populateMap;

import java.util.Map;

import com.app.core.Student;

public class Test2 {

	public static void main(String[] args) {
		//.2 Print average of  marks of students from the specified state
				//i/p : name of the state
		Map<String, Student> studentMap = populateMap(populateList());
		System.out.println("All students:");
		//studentMap.forEach((k,v)->System.out.println(v));
		String state="MH";
		 double average=studentMap.values().//collection<Student>
		stream().//Stream<Student?
		filter(student->student.getAddress().getState().equals(state))//filtered Stream<Student>
		.mapToDouble(i->i.getGpa())//DoubleStream
		 .average()
		 .orElseThrow();
		 System.out.println(average);
		
		
	}

}
