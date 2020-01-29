package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String [] t = br.readLine().split(" ");
		int M = Integer.parseInt(t[0]);
		int N = Integer.parseInt(t[1]);
		int n = Integer.parseInt(br.readLine());
		int [][] A = new int[M][N];
		for (int i = 0; i < A.length; i++) {

			String [] valores = br.readLine().split(" ");

			for (int j = 0; j < A[i].length; j++) {

				A[i][j] = Integer.parseInt(valores[j]);

			}
		}

		System.out.println(masCercano(A,0,A.length-1, n));
		br.close();
	}

	public static int masCercano(int [][] A, int i, int j, int n) {

		if(i==j){

			return divideMatriz(A, 0, A.length-1, n);

		}
		else {
			int m = (i+j)/2;
			int izq = masCercano(A, i, m, n);
			int dere = masCercano(A, m+1, j, n);

			if(Math.abs(dere-n) < Math.abs(izq-n)) {

				return dere;
				 
			}
			else {

				if((Math.abs(izq-n)) == (Math.abs(dere-n))) {
					if(izq>dere) {
						return izq;
						
					}
					else {
						return dere;
					}
				}
				else {

					return izq;
				}
			}
		}
	}

	private static int divideMatriz(int[][] A, int i, int j, int n) {

		if(i==j) {

			return dividirArreglo(A[i], 0, A[0].length-1, n);

		}
		else {

			int m = (i+j)/2;
			int izq = divideMatriz(A, i, m, n);
			int dere = divideMatriz(A, m+1, j, n);

			if(Math.abs(dere-n) < Math.abs(izq-n)) {

				return dere;
			}
			else {

				if((Math.abs(izq-n)) == (Math.abs(dere-n))) {
					if(izq>dere) {
						return izq;
						
					}
					else {
						return dere;
					}
				}
				else {

					return izq;
				}
			}
		}
	}

	private static int dividirArreglo(int[] B, int i, int j, int n) {

		if(i==j) {

			return B[i];
		}
		else {
			int m = (i+j)/2;
			int izq = dividirArreglo(B, i, m, n);
			int dere = dividirArreglo(B, m+1, j, n);

			if(Math.abs(dere-n) < Math.abs(izq-n)) {

				return dere;
			}
			else {

				if((Math.abs(izq-n)) == (Math.abs(dere-n))) {
					if(izq>dere) {
						return izq;
						
					}
					else {
						return dere;
					}
				}
				else {
					
					return izq;
				}
			}
		}
	}
}
