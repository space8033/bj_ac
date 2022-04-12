package bj_problem_ac;

import java.util.Scanner;

public class ac4_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int m = sc.nextInt();
		int M = sc.nextInt();
		int T = sc.nextInt();
		int R = sc.nextInt();
		sc.close();
		
		int total = 0;
		int now = m;
		int exe = 0;
		
		while(exe<N) {
			if((now + T) <= M) {
				exe++;
				now += T;
				total++;
			}
			else {
				if((now -R) < m) {
					now = m;
					total++;
				}
				else {
					total++;
					now -= R;
				}
			}
			
			if(now + T > M && now == m) {
				System.out.println("-1");
				return;
			}
			
		}
		System.out.println(total);		
	}

}
// while문 이해도가 더 필요할듯