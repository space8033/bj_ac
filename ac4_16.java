package bj_problem_ac;

import java.util.Scanner;

public class ac4_16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		sc.nextLine();
		int ans = 0;
		
		if(N>=M) {
			int[] a = new int[N];
			int[] b = new int[N];

			for(int i=0; i<N; i++) {
				a[i] = sc.nextInt();
			}
			sc.nextLine();
			
			for(int i=0; i<M; i++) {
				b[i] = sc.nextInt();
			}
			for(int i=M; i<N; i++) {
				b[i] = 0;
			}
			
			for(int i=0; i<N; i++) {
				ans += a[i]-b[i];
			}
			System.out.println(ans);
			
		}else {
			int[] a = new int[M];
			int[] b = new int[M];

			for(int i=0; i<N; i++) {
				a[i] = sc.nextInt();
			}
			for(int i=N; i<M; i++) {
				a[i] = 0;
			}
			sc.nextLine();
			for(int i=0; i<M; i++) {
				b[i] = sc.nextInt();
			}
			for(int i=0; i<M; i++) {
				ans += a[i]-b[i];
			}
			System.out.println(ans);
		}
		
		sc.close();
		
	}

}
