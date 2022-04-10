package bj_problem_ac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class ac3_3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a ;
		BigInteger b = new BigInteger("0");
		
		for(int i = 0; i <3; i++) {
			a= Integer.parseInt(br.readLine());
			BigInteger sum = b;
			
			for(int j = 0; j < a; j++) {
				BigInteger now = new BigInteger(br.readLine());
				sum = sum.add(now);
			}
			if(sum.compareTo(b) == 0) {
				System.out.println(0);
			}
			else if(sum.compareTo(b) == 1) {
				System.out.println("+");
			}
			else {
				System.out.println("-");
			}
		}
	}

}
