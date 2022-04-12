package bj_problem_ac;

import java.util.Scanner;

public class ac4_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String s = sc.nextLine();
			int cnt = 0;
			
			if(s.equals("#")) {
				break;
			}
			
			for(int i =0; i < s.length(); i++) {
				if(s.charAt(i)== 'a' || s.charAt(i)== 'e' || s.charAt(i)== 'i'  || s.charAt(i)== 'o' || s.charAt(i)== 'u' || s.charAt(i)== 'A' || s.charAt(i)== 'E' || s.charAt(i)== 'I'  || s.charAt(i)== 'O' || s.charAt(i)== 'U') {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
		sc.close();
	}

}
