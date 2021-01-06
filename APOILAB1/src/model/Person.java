package model;

public class Person {
	
	public String name;
	public String id;
	public String rut;
	
	public Person (String name, String id, String rut) {
		this.name = name;
		this.id =id;
		this.rut = rut;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", rut=" + rut + "]";
	}
	
	

}
