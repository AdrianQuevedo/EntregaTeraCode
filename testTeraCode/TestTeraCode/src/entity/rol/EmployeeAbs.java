package entity.rol;

import java.util.Date;

public abstract class EmployeeAbs extends Person {
	
	protected double salary;
	private Date initLaboral;
	
	protected EmployeeAbs(String id, String name, String lastName, Date date, double salary, Date initLaboral) {
		super(id, name, lastName, date);
		this.setSalary(salary);
		this.setinitLaboral(initLaboral);
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getinitLaboral() {
		return initLaboral;
	}

	public void setinitLaboral(Date initLaboral) {
		this.initLaboral = initLaboral;
	}
	
	public abstract double getSalary ();

}
