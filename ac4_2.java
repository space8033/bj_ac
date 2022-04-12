package bj_problem_ac;

import java.util.ArrayList;
import java.util.Scanner;

public class ac4_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.next();
		String s2 = sc.next();
		String s3 = sc.next();
		sc.close();
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("black");  //0
		list.add("brown");  //1
		list.add("red");    //2
		list.add("orange"); //3
		list.add("yellow"); //4
		list.add("green");  //5
		list.add("blue");   //6
		list.add("violet"); //7
		list.add("grey");   //8
		list.add("white");  //9
		
		int a1 = list.indexOf(s1)*10;
		int a2 = list.indexOf(s2);
		long a3 = list.indexOf(s3);
		
		System.out.println((a1+a2) * (long)(Math.pow(10, a3)));
	}

}
