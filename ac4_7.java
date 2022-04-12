package bj_problem_ac;

import java.util.Scanner;

public class ac4_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();
		sc.close();
		
		int[] sum = new int[81];
		int max = 0;
		int ans = 0;
		
		for(int i = 1; i <= s1; i++) {
			for(int j = 1; j <= s2; j++) {
				for(int k = 1; k<= s3; k++) {
					sum[i+j+k]++;
				}
			}
		}
		
		for(int i =0; i <81; i++) {
			if(max < sum[i]) {
				max = sum[i];
				ans = i;
			}
		}
		
		System.out.println(ans);
	}

}
