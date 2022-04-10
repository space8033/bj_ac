package bj_problem_ac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class ac3_9 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigInteger P = new BigInteger(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		boolean[] prime = new boolean[K+1];
		prime[1] = true;
		
		for(int i = 2; i < K; i++) {
			if(prime[i]) {
				continue;
			}
			BigInteger now = new BigInteger(Integer.toString(i));
			
			if(P.mod(now).compareTo(BigInteger.ZERO) == 0) {
				System.out.println("BAD " + now);
				return;
			}
			for(int j = i*2; j <= K; j+= i) {
				prime[j] = true;
			}
		}
		System.out.println("GOOD");		
		
		}
	

}
// 어려워 ㅠㅠ
