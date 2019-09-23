package calculator;

import java.util.ArrayList;
import java.util.HashMap;

import entity.rol.Person;
import entity.rol.Student;
import filter.IFilterAbs;

public class SubjectCalculator extends CalculatorAbs {
	
	private IFilterAbs filter;
		
	public SubjectCalculator(IFilterAbs filter) {
		super();
		this.filter = filter;
	}
	
	@Override
	public HashMap<String, Object> calcular(ArrayList<Person> students) {
		HashMap<String, Object> studentsGroup = new HashMap<>();
		for(Person student: students) {
			if(!studentsGroup.containsKey(student.getId())) {
				if(((Student) student).getSignature()!=null) {
					if(filter.isValid(student)) {
						studentsGroup.put(student.getId(), student);
					}
				}
			}
		}
		return studentsGroup;
	}

}
