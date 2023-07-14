package com.xworkz.problems;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int n;
		int sum=0;
		int i=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();
	
		i=num;
		while(num>0) {
			n=num%10;
			num=num/10;
			sum=sum+(n*n*n);
		}
		
		if(sum==i) {
			System.out.println("It is armstrong number");
		}
		else {
			System.out.println("It is not armstrong number");
		}
	}
}
