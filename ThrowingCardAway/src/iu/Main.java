package iu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	
	public static void main(String args[] ) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = br.read();
		
		while (N != 0) {
			
			Queue<Integer> q = new LinkedList<>();
			
			for(int i=1; i <= N; i++) {
				q.offer(N);
			}
			
			int [] a = new int [N-1];
			int i = 0;
			
			while (q.size()>1) {
				
				a[i] = q.poll();
				i++;
				q.offer(q.poll());
				
			}
			
		}
		
		
		
		
		
	}

}
