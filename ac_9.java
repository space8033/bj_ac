package bj_problem_ac;

import java.util.Scanner;

public class ac_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		sc.close();
		
		System.out.println((a+b+c+d)/60);
		System.out.println((a+b+c+d)%60);
	}

}
