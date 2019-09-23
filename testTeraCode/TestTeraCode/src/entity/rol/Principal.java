package entity.rol;

import java.util.Date;

public class Principal extends EmployeeAbs {
	
	private double bonoPorCargo;
	
	public Principal(String id, String nombre, String apellido, Date fechaNacimiento, double salario, Date fechaInicioLaboral, double bono) {
		super(id,nombre,apellido,fechaNacimiento,salario,fechaInicioLaboral);
		this.bonoPorCargo = bono;
	}

	public double getBonoPorCargo() {
		return bonoPorCargo;
	}

	public void setBonoPorCargo(double bonoPorCargo) {
		this.bonoPorCargo = bonoPorCargo;
	}
	
	@Override
	public double getSalary() {
		return (this.salary * 1.2) + bonoPorCargo;
	}
	
}
