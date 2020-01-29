package ui;

public class Main {

	public final static void main(String args[]) {

		int[][] A = new int[][] {{1,5},{4,7}};
		int[][] B = new int[][] {{5,7},{5,7}};
		int [][] C = (sumaMatriz(A,B));
		imprimeMatriz(C);

	}

	public static int[][] sumaMatriz(int[][] A, int[][] B) {

		int[][] C = new int[A.length][A[0].length];
		return sumaMatriz(A, B, 0, A.length-1, C);


	}
	private static int[][] sumaMatriz(int[][] A, int[][] B, int i, int j, int[][] C) {

		if(i==j) {
			C[i]= sumarArreglo(A[i], B[i]);
			return C;
		}
		else {
			int m = (i+j)/2;
			sumaMatriz(A, B, i, m, C);
			sumaMatriz(A, B, m+1, j, C);
		}

		return C;
	}

	public static int[] sumarArreglo(int[] A, int[] B) {

		int[] C = new int[A.length];
		return sumarArreglo(A, B, 0, A.length-1, C);


	}

	private static int[] sumarArreglo(int[] A, int[] B, int i, int j, int[] C) {

		if(i==j) {
			C[i]= A[i]+B[i];
			return C;
		}
		else {
			int m = (i+j)/2;
			sumarArreglo(A, B, i, m, C);
			sumarArreglo(A, B, m+1, j, C);

			return C;
		}

	}
	public static void imprimeMatriz(int[][] C) {

		for (int i = 0; i < C.length; i++) {
			for(int j = 0; j< C[i].length; j++) {
				System.out.print(C[i][j] + " ");
			}
			System.out.println();

		}

	}

}
