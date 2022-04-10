package bj_problem_ac;

import java.util.Scanner;

public class ac3_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		int a = 5;
		
		for(int i = 1; i <N; i ++) {
			a = (a+3*i+4)%45678;
			
		}
		System.out.println(a);
		
	}

}
// %위치가 저기가 맞음? 모르겠다