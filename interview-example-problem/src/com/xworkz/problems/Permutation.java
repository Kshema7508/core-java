package com.xworkz.problems;

import java.util.Scanner;

public class Permutation {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n,p,r,a,c;
		int fact=1,fact1=1,fact2=1;
		
		System.out.print("Enter the number: ");
		n=sc.nextInt();
		System.out.print("Enter the r number: ");
		r=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			fact=fact*i;
		}
		for(int i=1;i<=r;i++) {
			fact2=fact2*i;
		}
		a=n-r;
		for(int i=1;i<=a;i++) {
			fact1=fact1*i;
			
		}
		
		p=fact/fact1;
		c=fact/(fact1*fact2);
		System.out.println("The factorial of "+n+" is "+fact);
		System.out.println("The permutation is "+p);
		System.out.println("The combination is "+c);
		
	}
}
