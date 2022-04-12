package bj_problem_ac;

import java.math.BigInteger;
import java.util.Scanner;

public class ac4_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		sc.close();
		
		String a1 = a.toString();
		String b1 = b.toString();
		
		BigInteger aa = new BigInteger(a1,2);
		BigInteger bb = new BigInteger(b1,2);
		
		BigInteger sum = aa.add(bb);
		
		String ans = sum.toString(2);
		
		System.out.println(ans);
		
	}

}
// 형변환시키면서 진법변환도 가능!