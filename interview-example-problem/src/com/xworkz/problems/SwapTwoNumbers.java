package com.xworkz.problems;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		int b;
		int temp;
		
		System.out.println("Enter the value for a & b");
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.println("The number before swaping "+a+" & "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("The number after swaping "+a+" & "+b);
	}
}
