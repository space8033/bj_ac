package bj_problem_ac;

import java.util.Scanner;

public class ac2_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			int h1 = sc.nextInt();
			int m1 = sc.nextInt();
			int s1 = sc.nextInt();
			int h2 = sc.nextInt();
			int m2 = sc.nextInt();
			int s2 = sc.nextInt();
			
			if(s2 < s1) {
				s2 += 60;
				m2 -= 1;
				if (m2 < 0) {
					m2 += 60;
					h2 -= 1;
				}
			}
			if(m2 < m1) {
				m2 += 60;
				h2 -= 1;
			}
			
			System.out.println((h2-h1) + " " + (m2-m1) + " " + (s2-s1));
		}
		sc.close();
		
	}

}
