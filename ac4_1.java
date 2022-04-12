package bj_problem_ac;

import java.util.Scanner;

public class ac4_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int F = sc.nextInt();
		sc.close();
		int M = N/100;
		
		for(int i = 0; i < F; i++) {
			if((M*100 + i) % F == 0) {
				if(0<=i && i <=9) {
					System.out.println("0" + i);
				}else {
					System.out.println(i);					
				}
			}
		}
	}

}