package bj_problem_ac;

import java.util.Arrays;
import java.util.Scanner;

public class ac5_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = sc.nextInt();
		
		int[] t = new int[n];
		String[] r = new String[n];
		
		for(int i=0; i <n; i++) {
			r[i] = sc.next();
		}
		Arrays.sort(r);
		
	}

}
// 어렵다 ㅠ
