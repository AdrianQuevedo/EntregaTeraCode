package entity;

import java.util.ArrayList;
import java.util.HashMap;

import calculator.CalculatorAbs;
import entity.rol.EmployeeAbs;
import entity.rol.Person;

public class School {
	
	private String name;
	private String address;
	private String level;
	private ArrayList<Person> students;
	private ArrayList<EmployeeAbs> employees;
	
	public School(String name, String address, String level) {
		this.name = name;
		this.address = address;
		this.level = level;
	}
	public School(String name, String address, String level, ArrayList<Person> students, ArrayList<EmployeeAbs> employees) {
		this.name = name;
		this.address = address;
		this.level = level;
		this.students = students;
		this.employees = employees;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}
	
	public HashMap<String, Object> getStudents(CalculatorAbs calculator){
		return calculator.calcular(this.students);
	}

}
