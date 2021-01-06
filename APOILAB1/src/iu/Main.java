package iu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import model.EstacionGeneral;
import model.Person;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		menu();

	}
	
	public static void menu() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		EstacionGeneral estacionGeneral = new EstacionGeneral();
		estacionGeneral.agregarEstacion(1,5, 15.5, 43.6, new Person ("lina", "2245", "6352"), "Icesi");
		estacionGeneral.agregarEstacion(2, 6, 45.3, 76.3, new Person ("Madison", "487363", "74638"), "Javeriana");
		estacionGeneral.agregarEstacion(3, 10, 87.23, 85.33, new Person("Carol", "8237473", "873463"), "SanBuenaventura");
		System.out.println("Dijite el numero de la opcion");
		System.out.println("1. Información del personal");
		System.out.println("2. Cantidad bicicletas en una estación");
		int opcionE = Integer.parseInt(br.readLine());
		
		switch(opcionE) {
		case 1 : System.out.println(estacionGeneral.generarInformePersonaE());
		break;
		case 2 : System.out.println("Ingrese el Id de la estación");
		reconocerId();
		break;
		}
		
		}
	
	public static void reconocerId() throws NumberFormatException, IOException {
		EstacionGeneral estacionGeneral = new EstacionGeneral();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int opcion = Integer.parseInt(br.readLine());
		System.out.println(estacionGeneral.obtenerNumBicicletasEstacion(opcion));
		
	}

}
