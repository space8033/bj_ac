package bj_problem_ac;

import java.util.Scanner;

public class ac3_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < s.length(); i++) {
			String a = Integer.toBinaryString(s.charAt(i)-'0');
			if(a.length() == 2 && i != 0) {
				a = "0" + a;
			}
			else if(a.length() == 1 && i != 0) {
				a = "00" + a;
			}
			
			sb.append(a);
		}
		System.out.println(sb);
		
	}

}
