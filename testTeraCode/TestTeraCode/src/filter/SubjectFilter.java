package filter;

import entity.rol.Person;
import entity.rol.Student;

public class SubjectFilter implements IFilterAbs {
	
	private String nameSubject;
	
	public SubjectFilter(String nameSubject) {
		super();
		this.nameSubject = nameSubject;
	}

	@Override
	public boolean isValid(Person person) {
		for(String subject:((Student)person).getSignature()) {
			if(subject.equals(nameSubject))
				return true;
		}
		return false;
	}

}
