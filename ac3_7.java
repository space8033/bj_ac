package bj_problem_ac;

import java.util.Scanner;

public class ac3_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		int xa,ya;
		int xb,yb;
		
		if(a%4 == 0) {
			xa = a/4;
			ya = 4;
		}else {
			xa = a/4+1;
			ya = a%4;
		}
		if(b%4 == 0) {
			xb = b/4;
			yb = 4;
		}else {
			xb = b/4+1;
			yb = b%4;
		}
		
		System.out.println(Math.abs(xa-xb)+Math.abs(ya-yb));
	}

}
