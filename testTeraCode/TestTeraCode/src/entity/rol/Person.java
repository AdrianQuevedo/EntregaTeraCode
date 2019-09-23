package entity.rol;

import java.util.Date;

public class Person {
	
	private String name;
	private String lastName;
	private Date birthday;
	private String id;
	
	public Person (String id, String name, String lastName, Date date){
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.birthday = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Person "+id+": "+ name + ", " + lastName;
	}
	
}
