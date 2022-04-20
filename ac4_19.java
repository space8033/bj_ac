package bj_problem_ac;

import java.util.Scanner;

public class ac4_19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		int a =1;
		int cnt =0;
		
		while(N>0) {
			if(N < a) {
				a =1;
			}
			N -= a;
			cnt++;
			a++;
		}
		System.out.println(cnt);
	}

}
