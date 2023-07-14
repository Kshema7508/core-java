package com.xworkz.problems;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int firstnum=0;
		int secondnum=1;
		int result;
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		System.out.println("The fibonacci series are");
		System.out.println(firstnum);
		System.out.println(secondnum);
		for(int i=2;i<num;i++) {
			result=firstnum+secondnum;
			firstnum=secondnum;
			secondnum=result;
			System.out.println(result);
		}
	}
}
