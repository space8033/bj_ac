package bj_problem_ac;

import java.math.BigInteger;
import java.util.Scanner;

public class ac_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger N = sc.nextBigInteger();
		BigInteger M = sc.nextBigInteger();
		sc.close();
		
		System.out.println(N.divide(M));
		System.out.println(N.remainder(M));
		
	}

}
