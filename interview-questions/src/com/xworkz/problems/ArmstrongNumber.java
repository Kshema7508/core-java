package com.xworkz.problems;

import java.util.Scanner;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		int res=0;
		int i;
		System.out.println("Enter the number");
		int num=sc.nextInt();
		i=num;
		while(num>0) {
			n=num%10;
			num=num/10;
			res=res+(n*n*n);
		}
		if(res==i) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not Armstrong number");
		}
	}
}
