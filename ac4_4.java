package bj_problem_ac;

import java.util.Scanner;

public class ac4_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[26];
		
		for(int i = 0; i< N; i++) {
			String s = sc.next();
			char a = s.charAt(0);
			arr[a-97]++;
		}
		sc.close();
		
		boolean b =false;
		
		for(int i = 0; i < 26; i++) {
			if(arr[i] >= 5) {
				b = true;
				System.out.print((char)(i+97));
			}
		}
		
		if(!b) {
			System.out.print("PREDAJA");			
		}
		
		
	}

}
