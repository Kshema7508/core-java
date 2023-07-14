package com.xworkz.problems;

import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int temp;
		
		System.out.println("The no. before Swapping "+a+" and "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("The no. after Swapping "+a+" and "+b);
	}
}
