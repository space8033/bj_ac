package bj_problem_ac;

import java.util.Scanner;

public class ac4_21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		int[] b = new int[N];
		
		for(int i =0; i <N; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		
		for(int i =0; i<N; i++) {
			b[i] = a[N-i-1];
		}
		
		int cnta =1;
		int cntb =1;
		
		for(int i=0; i <N-1; i++) {
			if(a[i]<a[i+1]) {
				cnta++;
			}else {
				a[i+1] = a[i];
			}
		}
		for(int i=0; i <N-1; i++) {
			if(b[i]<b[i+1]) {
				cntb++;
			}else {
				b[i+1] = b[i];
			}
		}
		
		System.out.println(cnta);
		System.out.println(cntb);
		
	}

}
