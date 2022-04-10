package bj_problem_ac;

import java.util.Scanner;

public class ac2_7 {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double D = sc.nextDouble();
		sc.close();
		
		if(A/C >= B/D) {
			System.out.println(L - (int)(Math.ceil(A/C)));
		}else {
			System.out.println(L - (int)(Math.ceil(B/D)));
		}
	}

}
