package bj_problem_ac;

import java.util.Scanner;

public class ac2_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		int g = sc.nextInt();
		int h = sc.nextInt();
		sc.close();
		
		int S = a + b + c + d;
		int T = e + f + g + h;
		
		if(S>T) {
			System.out.println(S);
		}else {
			System.out.println(T);
			
		}
	}

}
