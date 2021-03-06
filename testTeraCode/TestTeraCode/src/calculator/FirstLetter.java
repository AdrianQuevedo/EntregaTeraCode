package calculator;

import java.util.ArrayList;
import java.util.HashMap;

import entity.rol.Person;

public class FirstLetter extends CalculatorAbs {

	@Override
	public HashMap<String, Object> calcular(ArrayList<Person> students) {

		HashMap<String, Object> studentsGroup = new HashMap<>();
		for(Person student: students) {
			if(student.getLastName() != null && student.getLastName().length() > 0) {
				String firstLetter = String.valueOf(student.getLastName().charAt(0));
				if(studentsGroup.containsKey(firstLetter)) {
					((ArrayList<Person>) studentsGroup.get(firstLetter)).add(student);
				}
				else {
					ArrayList<Person> studentList = new ArrayList<>();
					studentList.add(student);
					studentsGroup.put(firstLetter, studentList);
				}
			}
		}
		return studentsGroup;
	}
	
	

}
