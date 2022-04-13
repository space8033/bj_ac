package bj_problem_ac;

import java.util.Scanner;

public class ac5_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String [] a = new String[N];
		
		for(int i = 0; i < N; i++) {
			a[i] = sc.next();
		}
		
		boolean b = false;
		
		for(int i = 0; i < a[0].length(); i++) {
			b = false;
			for(int j = 0; j < N-1; j++) {
				if(a[j].charAt(i) != a[j+1].charAt(i)) {
					b = true;
					break;
				}
			}
			if(b == true) {
				System.out.print("?");
			}
			else {
				System.out.print(a[0].charAt(i));
			}
		}
		sc.close();
		
	}

}
