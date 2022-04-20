package bj_problem_ac;

import java.util.ArrayList;
import java.util.Scanner;

public class ac4_18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int k = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		String[] sr = s.split(",");
		ArrayList<String> a = new ArrayList<>();
		sc.close();
		
		for(int i =0; i <sr.length; i++) {
			a.add(sr[i]);
		}
		
		for(int i=0; i<k; i++) {
			ArrayList<String> answer = getA(a);
			a = answer;
		}
		
		for(int i =0; i <a.size()-1; i++) {
			System.out.print(a.get(i) + ",");
		}
		System.out.print(a.get(a.size()-1));
	}
	
	public static ArrayList<String> getA(ArrayList<String> a){
		ArrayList<String> answer = new ArrayList<>();
		for(int i=0; i<a.size()-1; i++) {
			answer.add(Integer.toString(Integer.parseInt(a.get(i+1)) - Integer.parseInt(a.get(i))));
		}
		
		return answer;
	}
}
