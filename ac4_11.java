package bj_problem_ac;

import java.util.Scanner;

public class ac4_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();		
		long[] a = new long[N];
				
		for(int i =0; i <N; i++) {
			a[i] = sc.nextLong();
		}
		
		int b = sc.nextInt();
		long cnt = 0;
		sc.close();
		
		for(int i =0; i <N; i++) {
			if(a[i] == 0) {
				continue;
			}
			if(a[i]%b != 0) {
				cnt += (a[i]/b + 1);
			}else {
				cnt += a[i]/b;
			}
		}
		
		System.out.println(cnt*b);
	}

}