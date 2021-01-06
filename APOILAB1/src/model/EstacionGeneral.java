package model;

import java.util.ArrayList;

public class EstacionGeneral {
	
	private ArrayList<Estacion> estaciones;
	
	public EstacionGeneral() {
		estaciones = new ArrayList<>();
	}
	
	public void agregarEstacion(int id, int numBicicletas, double longitud, double latitud, Person personaEncargada, String nombreEstacion) {
		Estacion estacion = new Estacion(id,numBicicletas, longitud, latitud, personaEncargada, nombreEstacion);
		estaciones.add(estacion);
	}
	
	public String generarInformePersonaE() {
		String s = "";
		for(int i=0; i<estaciones.size();i++) {
			Estacion estacionActual = estaciones.get(i);
			Person persona = estacionActual.getPersonaEncargada();
			s += "persona" + persona.toString();
			s += "\n";
			s += estacionActual.getNombreEstacion();
			s += "\n";
		}
		return s;
	}
	
/*	public int cantidadBicicletas() {
		int s = 0;
		for (int i=0; i<estaciones.size();i++) {
			Estacion estacion = estaciones.get(i);
			s = estacion.getNumBicicletas();
		}
		return s; 
	}*/
	
	public int obtenerNumBicicletasEstacion(int id) {
		for(int i=0; i<estaciones.size(); i++) {
			Estacion estacionActual = estaciones.get(i);
			if(id==estacionActual.getId()) {
				return estacionActual.getNumBicicletas();
			}
		}
		return -1;
		
	}
	
/*	public double distanciaRutas() {
		 double suma = 0;
		 for(int i=0; i<estaciones.size();i++) {
			 Estacion estacion1 = estaciones.get(i);
			 Estacion estacion2 = estaciones.get(i+1);
			 double latitud1 = estacion1.getLatitud();
			 double longitud1 = estacion1.getLongitud(); 
			double latitud2 = estacion2.getLatitud();
			 double longitud2 = estacion2.getLongitud();
		 }
		 return suma;		 
	}*/
	

}
