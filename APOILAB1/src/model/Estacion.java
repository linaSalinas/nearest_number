package model;

public class Estacion {
	
	private int id;
	private int numBicicletas;
	private double longitud;
	private double latitud;
	private Person personaEncargada;
	private String nombreEstacion;
	
	public Estacion(int id,int numBicicletas, double longitud, double latitud, Person personaEncargada, String nombreEstacion) {
	this.longitud = longitud;
	this.latitud = latitud;
	this.numBicicletas = numBicicletas;
	this.personaEncargada = personaEncargada;
	this.nombreEstacion = nombreEstacion;
	}

	public double getLongitud() {
	return longitud;
	}

	public void setLongitud(double longitud) {	
	this.longitud = longitud;
	}

	public double getLatitud() {	
	return latitud;
	}

	public void setLatitud(double latitud) {
	this.latitud = latitud;
	}

	public Person getPersonaEncargada() {
		return personaEncargada;
	}

	public void setPersonaEncargada(Person personaEncargada) {
		this.personaEncargada = personaEncargada;
	}

	public String getNombreEstacion() {
		return nombreEstacion;
	}

	public void setNombreEstacion(String nombreEstacion) {
		this.nombreEstacion = nombreEstacion;
	}

	public int getNumBicicletas() {
		return numBicicletas;
	}

	public void setNumBicicletas(int numBicicletas) {
		this.numBicicletas = numBicicletas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


}
