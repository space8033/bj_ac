package bj_problem_ac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ac3_8 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int era = 1;
			
			if( a == 0) {
				break;
			}
			
			for(int i = 0; i <2*a; i++) {
				int b = Integer.parseInt(st.nextToken());
				
				if(i%2 == 0) {
					era *= b;
				}else {
					era -= b;
				}
			}
			System.out.println(era);
		}
	}

}
