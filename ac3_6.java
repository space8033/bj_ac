package bj_problem_ac;

import java.util.Scanner;

public class ac3_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		boolean[] arr = new boolean[4];
		
		arr[0] = false;
		arr[1] = true;
		arr[2] = false;
		arr[3] = false;
		
		for(int i = 0; i < N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			arr[0] = arr[a];
			arr[a] = arr[b];
			arr[b] = arr[0];
			
		}
		sc.close();
		
		for(int i = 1; i <4; i++) {
			if(arr[i] == true) {
				System.out.println(i);
			}
		}
	}

}
