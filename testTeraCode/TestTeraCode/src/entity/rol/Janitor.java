package entity.rol;

import java.util.Date;

public class Janitor extends EmployeeAbs {
	
	private String work;

	public Janitor(String id, String name, String lastName, Date date, double salary, Date initLaboral, String work) {
		super(id, name, lastName, date, salary, initLaboral);
		this.setWork(work);
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	@Override
	public double getSalary() {
		return this.salary;
	}

}
