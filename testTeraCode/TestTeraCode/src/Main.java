import java.util.ArrayList;
import java.util.Date;

import calculator.CalculatorAbs;
import calculator.FirstLetter;
import calculator.SubjectCalculator;
import entity.School;
import entity.rol.EmployeeAbs;
import entity.rol.Janitor;
import entity.rol.Person;
import entity.rol.Principal;
import entity.rol.Student;
import filter.IFilterAbs;
import filter.SubjectFilter;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> subjects = new ArrayList();		
		subjects.add("English");
		subjects.add("Mathematics");
		subjects.add("Handwriting");
		subjects.add("Health");	
		subjects.add("Art");	

		ArrayList<String> subjects1 = new ArrayList();		
		subjects1.add("English");
		subjects1.add("Geography");
		subjects1.add("Algebra");
		subjects1.add("Geometry");
		
		ArrayList<String> subjects2 = new ArrayList();		
		subjects2.add("English");
		subjects2.add("Social Studies");
		subjects2.add("Sports");
		subjects2.add("Painting");

		Student student = new Student("4","Camila","Formaini", new Date());
		Student student1 = new Student("1","Adrian","Quevedo", new Date(), subjects);		
		Student student2 = new Student("2","Jorje","Perez", new Date(),subjects1);
		Student student3 = new Student("3","Marta","Rodriguez", new Date(),subjects2);
		
		
		ArrayList<Person> students = new ArrayList<>();
		students.add(student);
		students.add(student1);
		students.add(student2);
		students.add(student3);	
		
		Principal principal = new Principal("5","Seymour ","Skinner", new Date(), 45000, new Date(),5000);
		Janitor janitor = new Janitor("6","William","McDougal", new Date(), 20000, new Date(), "Gardener");
		ArrayList<EmployeeAbs> employees = new ArrayList<>();
		employees.add(principal);
		employees.add(janitor);

		School school = new School("Escuela Tecnica N°2", "Alem 890", "Secundary",students,employees);
		
		IFilterAbs filterSubject = new SubjectFilter("English");
		
		CalculatorAbs calculatorFirstLetter = new FirstLetter();
		System.out.println(school.getStudents(calculatorFirstLetter).toString());
		
		
		CalculatorAbs calculatorSubjects = new SubjectCalculator(filterSubject);
		System.out.println(school.getStudents(calculatorSubjects).toString());

	}

}
