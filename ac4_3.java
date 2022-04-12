package bj_problem_ac;

import java.util.Scanner;

public class ac4_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[8];
		int cnt =0;
		
		for(int i=0; i <8; i++) {
			arr[i] = sc.nextLine();
		}
		sc.close();
		
		for(int i =0; i< 8; i++) {
			for(int j=0; j<8; j++) {
				if((i+j)%2 == 0 && arr[i].charAt(j) == 'F') {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
	}

}
