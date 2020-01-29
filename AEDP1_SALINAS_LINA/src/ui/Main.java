package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String num = br.readLine();
		int T = Integer.parseInt(num);
		String n = br.readLine();
		String [] nombres = n.split(" ");
		int i=0;	
		
		while(i<T) {
			divideArreglo(nombres, 0, nombres.length-1);
			i++;
		}
		
	}
	
	public static String divideArreglo(String [] nombres, int izq, int dere) {
		if(izq==dere) {
			return comparaNombre(nombres, 0, nombres[0].length()-1);
		}
		else {
			//int m=(izq+dere)/2;
			//String[] izquierdo = (nombres, izq, m);
			//String[] derecho = (nombres, m+1, dere);
			//if(derecho[i].equals(izquierdo[i])){
				//return comparaNombre(nombres, 0, nombres[0].length()-1);
		
		}
		return null;
		
	}
	private static String comparaNombre(String[] nombres, int izq, int dere) {
		if(izq==dere) {
			//return nombres[];
		}
		else {
			//int m=(izq+dere)/2;
			//String[] izquierdo = (nombres, izq, m);
			//String[] derecho = (nombres, m+1, dere);
			//if(derecho[i].equals(izquierdo[i])){
				//return comparaNombre(nombres, 0, nombres[0].length()-1);
			
		}
	
		return null;
		
		
	}

}

