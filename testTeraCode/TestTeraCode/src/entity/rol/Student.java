package entity.rol;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student extends Person {

	private List<String> signature = new ArrayList<>();
	
	public Student (String id, String name, String lastName, Date date, ArrayList<String> signatures) {
		super(id, name, lastName, date);
		this.signature = signatures;
	}
	
	public Student (String id, String name, String lastName, Date date) {
		super(id, name, lastName, date);
	}

	public List<String> getSignature() {
		return signature;
	}

	public void setSignature(List<String> signatures) {
		this.signature = signatures;
	}
	
	public void addSignature(String signature) {
		this.signature.add(signature);
	}
	
	public String deleteSignature(int pos) {
		if (pos < this.signature.size())
			return this.signature.remove(pos);
		else
			return null;
	}
	
	@Override
	public String toString() {
		return "Student: "+this.getName()+", "+this.getLastName()+" |Signatures: "+this.getSignature();
	}
}
