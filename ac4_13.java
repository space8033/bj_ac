package bj_problem_ac;

import java.util.Scanner;

public class ac4_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[26];
		
		while(sc.hasNextLine()) {
			String s = sc.nextLine();
			for(int i =0; i <s.length(); i++) {
				if(s.charAt(i)>='a' && s.charAt(i)<='z') {
					a[s.charAt(i)-'a']++;
				}
			}
		}
		sc.close();
		int max = 0;
		for(int i =0; i <26; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		
		for(int i =0; i <26; i++) {
			if(a[i] == max) {
				System.out.print((char)(i+'a'));
			}
		}
	}

}
