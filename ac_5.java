package bj_problem_ac;

import java.util.Scanner;

public class ac_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L  = sc.nextInt();
		int P  = sc.nextInt();
		
		for(int i = 0; i <5; i++) {
			int N = sc.nextInt();
			System.out.print(N - L*P + " ");
		}
		sc.close();
	}

}
