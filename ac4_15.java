package bj_problem_ac;

import java.util.Scanner;

public class ac4_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.next();
		String s2 = sc.next();
		sc.close();
		
		String[] a1 = s1.split(":");
		String[] a2 = s2.split(":");
		
		int[] b1 = new int[3];
		int[] b2 = new int[3];
		
		for(int i =0; i <3; i++) {
			b1[i] = Integer.parseInt(a1[i]);
			b2[i] = Integer.parseInt(a2[i]);			
		}
		
		if(b1[2] > b2[2]) {
			b2[1] -= 1;
			b2[2] += 60;
		}
		if(b1[1] > b2[1]) {
			b2[0] -= 1;
			b2[1] += 60;
		}
		if(b1[0] > b2[0]) {
			b2[0] += 24;
		}
		
		if(b2[0]-b1[0]>=0 && b2[0]-b1[0]<10) {
			System.out.print("0");
			System.out.print(b2[0]-b1[0] + ":");
		}else {
			System.out.print(b2[0]-b1[0] + ":");
		}
		if(b2[1]-b1[1]>=0 && b2[1]-b1[1]<10) {
			System.out.print("0");
			System.out.print(b2[1]-b1[1] + ":");
		}else {
			System.out.print(b2[1]-b1[1] + ":");		
		}
		if(b2[2]-b1[2]>=0 && b2[2]-b1[2]<10) {
			System.out.print("0");
			System.out.print(b2[2]-b1[2]);
		}else {
			System.out.print(b2[2]-b1[2]);		
		}
	}

}
