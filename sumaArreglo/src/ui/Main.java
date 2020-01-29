package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public final static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String t = br.readLine();
		int tamanoMatriz = Integer.parseInt(t);
		int [] A = new int [tamanoMatriz];
		int [] B = new int [tamanoMatriz];
		int [] C = new int [tamanoMatriz];
			
		String [] valoresA = br.readLine().split(" ");
		
		for (int i = 0; i < A.length; i++) {
			
			A[i] = Integer.parseInt(valoresA[i]);
			
		}
		String [] valoresB = br.readLine().split(" ");
		
		for (int i = 0; i < B.length; i++) {
			
			
			B[i] = Integer.parseInt(valoresB[i]);
			
		}
		sumarArreglo(A, B, 0, A.length-1, C);
		imprimeArreglo(C);
	
		br.close();
	}

	private static void sumarArreglo(int[] A, int[] B, int i, int j, int[] C) {

		if(i==j) {
			C[i]= A[i]+B[i];
			}
		else {
			int m = (i+j)/2;
			sumarArreglo(A, B, i, m, C);
			sumarArreglo(A, B, m+1, j, C);
			
		}
//T(1)= 2
//T(n)= 2T(n/2)+3		
	}
	
	public static void imprimeArreglo(int [] C) {
		for (int i = 0; i < C.length; i++) {
			System.out.print(C[i] + " ");
		}
		System.out.println();
	}
	
}



