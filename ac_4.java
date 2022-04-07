package bj_problem_ac;

import java.util.Scanner;

public class ac_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double D = sc.nextDouble();
		double E = sc.nextDouble();
		sc.close();
		
		
		System.out.println((int)((Math.pow(A, 2)+Math.pow(B, 2)+Math.pow(C, 2)+Math.pow(D, 2)+Math.pow(E, 2))%10));
	}

}
