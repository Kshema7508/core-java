package com.xworkz.problems;

import java.util.Scanner;

public class SwapWithoutThirdNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("The no. before swaping "+a+" and "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("The no. after swaping "+a+" and "+b);
	}
}
