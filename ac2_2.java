package bj_problem_ac;

import java.util.Scanner;

public class ac2_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int D = sc.nextInt();
		sc.close();
		
		C += D;
		B += C/60;
		C %= 60;
		A += B/60;
		B %= 60;
		A %= 24;
		
		System.out.println(A + " " + B + " " + C);
	}

}
