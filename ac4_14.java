package bj_problem_ac;

import java.util.Scanner;

public class ac4_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		
		if(s.length()%3 == 1) {
			System.out.print(s.charAt(0));
		}
		if(s.length()%3 == 2) {
			System.out.print((s.charAt(0)-'0')*2 + s.charAt(1)-'0');
		}
		for(int i = s.length()%3; i<s.length(); i+=3) {
			System.out.print((s.charAt(i)-'0')*4 + (s.charAt(i+1)-'0')*2 + s.charAt(i+2)-'0');
		}
	}

}
