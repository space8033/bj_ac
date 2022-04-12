package bj_problem_ac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ac4_10 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		
		boolean time[] = new boolean[N*L +5*(N-1)];
		
		for(int i = 0; i <N; i++) {
			for(int j = (L+5)*i; j<(L+5)*i +L; j++) {
				time[j] = true;
			}
		}
		
		int ans =0;
		
		while(ans < time.length) {
			if(time[ans] == false) {
				break;
			}
			ans += D;
		}
		
		System.out.println(ans);		
		
	}

}

// 이게 왜 틀린지 잘 모르겠음.
/*
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int L = sc.nextInt();
		int D = sc.nextInt();
		sc.close();
		boolean x = false;
		
		for(int i =1; i <N; i++) {       => 음악 쉬는시간 사이에 D가 있는지 확인(휴식시간 시작과 끝을 D로나눈 몫이 다르면 쉬는시간에 울리는 D가존재함)
			if(((L+5)*(i-1)+L-1)/D != (((L+5)*i)-1)/D) {
				System.out.println((((L+5)*i)/D)*D);
				x=true; 
				break; 찾고 바로 for문 종료
			}
		}
		
		if(x == false) {
			System.out.println((((L+5)*(N-1))/D+1)*D); for문내에서 해결 안됐을 때
		}
 */