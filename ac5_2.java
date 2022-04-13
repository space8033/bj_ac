package bj_problem_ac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ac5_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] a = new int[5];
		
		for(int i =0; i <5; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=1; i <970200; i++) {
			int cnt = 0;
			for(int j=0; j<5; j++) {
				if(i%a[j] == 0) {
					cnt++;
				}
			}
			if(cnt >=3) {
				System.out.println(i);
				break;
			}
		}
	}

}
