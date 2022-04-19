package bj_problem_ac;

import java.util.Scanner;

public class ac4_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cnt =0;
		while(true) {
			int o = sc.nextInt();
			int w = sc.nextInt();
			if(o == 0 && w == 0) {
				break;
			}
			int min = o/2;
			int max = o*2;
			
			sc.nextLine();
			boolean die = false;
			while(true) {
				String s = sc.nextLine();
				if(s.equals("# 0")) {
					break;
				}
				if(!die) {
					String[] a = s.split(" ");
					if(a[0].equals("E")) {
						w -= Integer.parseInt(a[1]);
					}else if(a[0].equals("F")) {
						w += Integer.parseInt(a[1]);						
					}
				}
				if(w <= 0) {
					die = true;
				}
			}
			cnt++;
			if(w <= 0) {
				System.out.println(cnt + " RIP");
				continue;
			}
			if(w > min && w < max) {
				System.out.println(cnt + " :-)");
				continue;
			}
			System.out.println(cnt + " :-(");
		}
		sc.close();
	}

}
