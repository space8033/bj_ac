package bj_problem_ac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ac4_22 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		br.readLine();
		String s = st.nextToken();
		String[] a = new String[N];
		ArrayList<String> list = new ArrayList<>();
		
		for(int i =0; i <N; i++) {
			a[i] = s.charAt(i) + "";
		}
		
	}
	public static ArrayList<String> getA(ArrayList<String> a){
		ArrayList<String> answer = new ArrayList<>();
		for(int i=0; i<a.size()-1; i++) {
			answer.add(Integer.toString(Integer.parseInt(a.get(i+1)) - Integer.parseInt(a.get(i))));
		}
		
		return answer;
	}
	
}
