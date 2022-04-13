package bj_problem_ac;

import java.util.Scanner;

public class ac5_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String S = sc.next();
			
			if(S.equals("0")) {
				break;
			}
			
			String  a = "";
			
			for(int i = S.length()-1; i>=0; i--) {
				a = a+S.charAt(i);
			}
			if(S.contentEquals(a)) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
		sc.close();
	}

}
