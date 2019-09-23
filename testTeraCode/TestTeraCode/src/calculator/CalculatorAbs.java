package calculator;

import java.util.ArrayList;
import java.util.HashMap;

import entity.rol.Person;

public abstract class CalculatorAbs {
	
	public abstract HashMap<String, Object> calcular(ArrayList<Person> estudiantes);

}
