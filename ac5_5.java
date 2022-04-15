package bj_problem_ac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class ac5_5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][5];
		int max = 0;
		int ans = 0;
		
		for(int i =0; i <N; i++) {
		
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<5; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0; i<N; i++) {
			Set<Integer> set = new HashSet<>();
			
			for(int j=0; j<5; j++) {
				for(int k=0; k<N; k++) {
					if(arr[i][j] == arr[k][j] && k != i) {
						set.add(k);
					}

				}
			}
			
			if(set.size() > max) {
				max = set.size();
				ans = i+1;
			}
		}
		System.out.println(ans);
	}

}
// gg 뭐가 틀린지 모르겠음

