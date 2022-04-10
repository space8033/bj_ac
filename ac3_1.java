package bj_problem_ac;

import java.util.Scanner;

public class ac3_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i ++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int z = (int)(Math.pow(a%10, b%4));
			
			if(z%10 == 0) {
				System.out.println(10);
			}else {
				System.out.println(z%10);
			}
			
		}
		sc.close();
		
	}

}
// 이게 도대체 왜 틀린건지 이해가 안됨.