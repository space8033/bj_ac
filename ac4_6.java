package bj_problem_ac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ac4_6 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String a = st.nextToken();
		String b = st.nextToken();
		
		String aa[] = a.split("");
		String bb[] = b.split("");
		
		long suma = 0;
		long sumb = 0;
		
		for(int i = 0; i < aa.length; i++) {
			suma += Integer.parseInt(aa[i]);
		}
		for(int i = 0; i < bb.length; i++) {
			sumb += Integer.parseInt(bb[i]);
		}
		
		System.out.println(suma*sumb);
		
	}

}
