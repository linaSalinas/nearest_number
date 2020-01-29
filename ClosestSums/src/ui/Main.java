package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String b = br.readLine();
		int tamanoArreglo = Integer.parseInt(b);
		String e = br.readLine();
		int numeroConsultas = Integer.parseInt(e);
		int [] arreglo = new int [tamanoArreglo];
		String num = br.readLine();
		int numeroBuscar = Integer.parseInt(num);
		
		for (int i = 0; i < tamanoArreglo; i++) {
			
			arreglo [i] = Integer.parseInt(br.readLine());
			
		}
		
		br.close();
		
		}
	
	public static int sumaCercana(int [] arreglo, int i, int j, int numeroBuscar) {
		
		if(i==j) {
			return divideArreglo(arreglo, 0, arreglo.length-1, numeroBuscar);
		}
		
		else {
			
			int m = (i+j)/2;
			int izq = sumaCercana(arreglo, i, m, numeroBuscar);
			int der = sumaCercana(arreglo, m+1, j, numeroBuscar);
			 
		}
		
		return numeroBuscar;
		
	}
	
	public static int divideArreglo(int [] arreglo, int i, int j, int numeroBuscar) {
		return numeroBuscar;
		
		
		
	}
}