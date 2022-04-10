package bj_problem_ac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ac3_1_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int a, b;
		int r;
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			r = customPower(a,b);
			
			if(r == 0) {
				System.out.println("10");
			}else {
				System.out.println(r);
			}
			
		}
	}
	
	public static int customPower(int a, int b) {
		int res = 1;
		for(int i = 0; i < b; i ++) {
			if(res>10) {
				res %= 10;
			}
			res *= a;
		}
		return res%10;
	}

}
