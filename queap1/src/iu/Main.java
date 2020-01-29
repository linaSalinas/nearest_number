package iu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;


public class Main {
	
	public static PriorityQueue<Integer> priorityQueue;
	
	public static void main(String args[]) throws IOException {
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String max = br.readLine();
		int N = Integer.parseInt(max);
		int i = 0;
		
		while(i<N) {
			
			String ln = br.readLine();
			String[] values = ln.split(" ");
			int n = Integer.parseInt(values[0]);
			
			
			if(n==1) {
				
				int number = Integer.parseInt(values[1]);
				pq.offer(number);
								
			}
			else if(n==2) {
				
				int number = Integer.parseInt(values[1]);
				pq.remove(number);

			}
			
			else if(n==3) {
				System.out.println(pq.peek());
				
			}
			i++;
			
		}
		
	}

}
