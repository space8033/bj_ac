package bj_problem_ac;

import java.util.Scanner;

public class ac3_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Y,M;
		int sumY = 0;
		int sumM = 0;
		
		for(int i = 0; i < N; i++) {
			int T = sc.nextInt();
			
			Y = (T/30 + 1) * 10;
			M = (T/60 + 1) * 15;
			
			sumY += Y;
			sumM += M;
			
		}
		sc.close();
		
		if(sumY > sumM) {
			System.out.println("M " + sumM);
		}else if(sumM > sumY){
			System.out.println("Y " + sumY);				
		}else {
			System.out.println("Y M " + sumY);							
		}
	}

}
