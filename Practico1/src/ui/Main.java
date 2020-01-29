package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String num = br.readLine();
		int T = Integer.parseInt(num);
		
		int i=0;	
		while(i<T) {
			
			String n = br.readLine();
			String [] nombres = n.split(" ");
			divideArreglo(nombres);
			System.out.println(" "+divideArreglo(nombres));
			i++;
		}
	}
	
	public static String divideArreglo(String[] nombres) {
		
		String nombre = " ";
		return encontrarNombre(nombres, 0, nombres.length-1, nombre);

	}
	
	public static String encontrarNombre(String[] nombres, int i, int j, String nombre) {
		if(i==j) {
			nombre = nombres[i];
			return nombre;
		}
		else {
			int m = (i+j)/2;
			if((m+1)%2 == 0 && (nombres[m].equals(nombres[m-1]))) {
				nombre = encontrarNombre(nombres, m+1, j, nombre);
			}
			else if((m+1)%2 == 1 && (nombres[m].equals(nombres[m+1]))) {
				nombre = encontrarNombre(nombres, m+1, j,nombre);
			}
			else {
				nombre = encontrarNombre(nombres, i, m, nombre);
			}
			return nombre;
		}
	}

}
