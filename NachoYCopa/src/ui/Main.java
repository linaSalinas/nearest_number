package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
	
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String m = br.readLine();
		String[] arrM = m.split(" ");
		int M = Integer.parseInt(arrM[0]);
		int N = Integer.parseInt(arrM[1]);
		int dolars = 0;
		
		String ln = br.readLine();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(M, Collections.reverseOrder());
		String[] arrN = ln.split(" ");
		
		for(int i = 0; i<M; i++) {
			
			int n = Integer.parseInt(arrN[i]);
			pq.offer(n);
			
		}	
		for(int i = 0; i< N; i++) {
			
			int valorMax = pq.poll();
			dolars += valorMax;
			pq.offer(valorMax-1);
			
		}
		System.out.println(""+ dolars);
		
		br.close();
	}

}
