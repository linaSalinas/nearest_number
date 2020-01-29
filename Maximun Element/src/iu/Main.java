package iu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> st = new Stack<>();
		
		String max = br.readLine();
		int N = Integer.parseInt(max);
		int i = 0;
		
		while (i<N) {
			
			String num2 = br.readLine();
			String[] arreglo = num2.split(" ");
			
			int number2 = Integer.parseInt(arreglo[0]);
			
			if(number2 == 1) {  
				
				int number = Integer.parseInt(arreglo[1]);
				st.push(number);
				
			}
			else if(number2 == 2) {
				
				st.pop();
				
			}
			if(number2 == 3) {
				
				//cear un elemento temporal y luego volver a ingresarlo a la pila, debo volver a recalcular el maximo si se elimino
				
				int [] a = new int[st.size()-1];
				int valorMax = st.pop();
				
				for(int j = 0; j<st.size(); j++) {
					
					a[i]= valorMax;
						
					}
				
				}
				
				
				
			}
			
			i++;
			br.close();	
		}
		
		

	}


