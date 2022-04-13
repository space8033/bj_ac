package bj_problem_ac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ac5_3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		String[] arr = new String[N];
		int cntn = 0;
		
		for(int i =0; i < N; i++) {
			arr[i] = br.readLine();
			if(arr[i].contains("X") == false) {
				cntn++;
			}
		}
		
		int cntr = 0;
		
		for(int i =0; i<M; i++) {
			int cnt =0;
			for(int j=0; j<N; j++) {
				if(arr[j].charAt(i) == '.') {
					cnt++;
				}
			}
			if(cnt == N) {
				cntr++;
			}
		}
		
		if(cntn >= cntr) {
			System.out.println(cntn);
		}else {
			System.out.println(cntr);
			
		}
		
	}

}
