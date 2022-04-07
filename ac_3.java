package bj_problem_ac;

import java.math.BigInteger;
import java.util.Scanner;

public class ac_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigInteger A = sc.nextBigInteger();
		BigInteger B = sc.nextBigInteger();
		
		sc.close();
		
		System.out.println(A.add(B));		
		System.out.println(A.subtract(B));		
		System.out.println(A.multiply(B));		
	}

}
