package bj_problem_ac;

import java.util.Scanner;

public class ac2_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.close();
		
		if(N % 2 == 0) {
			System.out.println((N+2)*(N+2)/4);
		}else{
			System.out.println((N+3)*(N+1)/4);
		}
	}

}
