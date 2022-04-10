package bj_problem_ac;

import java.util.Scanner;

public class ac2_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		
		sc.close();
		
		if(a >= c && b>= c) {
			if(d>=e) {
				System.out.println(c+e-50);
			}
			else {
				System.out.println(c+d-50);				
			}
		}
		else if(a >= b && c >= b){
			if(d>=e) {
				System.out.println(b+e-50);
			}
			else {
				System.out.println(b+d-50);				
			}
		}
		else {
			if(d>=e) {
				System.out.println(a+e-50);
			}
			else {
				System.out.println(a+d-50);				
			}
		}
	}

}
