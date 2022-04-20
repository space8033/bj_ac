package bj_problem_ac;

import java.util.Scanner;

public class ac4_20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int L = sc.nextInt();
		int[] a = new int[N];
		sc.close();
		a[0] = 1;
		for(int i =1; i<N; i++) {
			a[i] =0;
		}
		
		int start =0;
		int cnt = 0;
		
		
		while(true) {
			
			if(a[start] == M) {
				System.out.println(cnt);
				break;
			}
			cnt++;
			
			if(a[start] %2 == 0) {
				if(start < L) {
					start += N;
				}
				start -= L;
				a[start] ++;

			}else {
				if(start+L >= N) {
					start -= N;
				}
				start += L;
				a[start] ++;
			}
			
		}
	}

}
