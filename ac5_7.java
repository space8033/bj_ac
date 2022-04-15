package bj_problem_ac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ac5_7 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		char[] arr = s.toCharArray();
		
		int[] front = new int[s.length()];
		int[] back = new int[s.length()];
		
		if(s.length() == 1) {
			System.out.println("NO");
		}
		
		for(int i =0; i<s.length()-1; i++) {
			if(i == 0) {
				front[i] = (int)(arr[i] - '0');
				back[s.length()-1-i] = (int)(arr[s.length()-1-i] - '0');
				continue;
			}
			
			front[i] = front[i-1] * (int)(arr[i] - '0');
			back[s.length()-1-i] = back[s.length()-i] * (int)(arr[s.length()-1-i] - '0');
		}
		
		for(int i =0; i<s.length()-1; i++) {
			if(front[i] == back[i+1]) {
				System.out.println("YES");
				break;
			}
			if(i == s.length()-2) {
				System.out.println("NO");
			}
		}
		
	}

}
