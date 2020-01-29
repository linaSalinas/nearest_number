package iu;

public class Main {
	
	public static void main(String args[]) {
		
		int[] A= new int[] {33,5,7,5};
		int[] B= new int[] {2,4,9,0};
		System.out.println(productoPunto(A,B));
	
	}
	
	public static int productoPunto(int[] A, int[] B) {
		if(A.length == B.length) {
		
			return productoPunto(A, B, 0, A.length-1 );
			
		}
		return 0;
		
	}
	private static int productoPunto(int [] A, int [] B, int i, int j) {
		if(i==j) {
			return A[i]*B[i];
		}
		else {
			int m= (i+j)/2;
			return productoPunto(A, B, i, m) + productoPunto(A, B, m+1, j);
			
		}
		
		
	}

	
		
	}


