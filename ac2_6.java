package bj_problem_ac;

import java.util.Scanner;

public class ac2_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int d = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();
		sc.close();
		
		System.out.print((int)(h*(Math.sqrt((double)(d*d)/(h*h+w*w)))) + " ");
		System.out.print((int)(w*(Math.sqrt((double)(d*d)/(h*h+w*w)))));
		
	}

}
