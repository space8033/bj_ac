package bj_problem_ac;

import java.util.Scanner;

public class ac2_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();
		
		if( A >= B && B >= C) {
			System.out.println(C + " " + B + " " + A );
		}
		else if ( B >= C && C >= A) {
			System.out.println(A + " " + C + " " + B );
		}
		else if ( C >= B && B >= A) {
			System.out.println(A + " " + B + " " + C );
		}
		else if ( C >= A && A >= B) {
			System.out.println(B + " " + A + " " + C );
		}
		else if ( A >= C && C >= B) {
			System.out.println(B + " " + C + " " + A );
		}else {
			System.out.println(C + " " + A + " " + B );			
		}
	}

}
