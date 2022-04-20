package bj_problem_ac;

import java.util.Scanner;

public class ac4_17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		
		for(int i =0; i <N; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		
		int cnt = 0;
		
		for(int i =0; i<N; i++) {
			for(int j = i+1; j <N; j++) {
				if(a[i] == a[j]) {
					cnt++;
					break;
				}
			}
		}
		
		System.out.println(cnt);
	}

}
