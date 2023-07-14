package com.xworkz.problems;

import java.util.Scanner;

public class ProductOfArray {

	public static void main(String[] args) {
		int a[]=new int[50];
		
		Scanner sc=new Scanner(System.in);
			
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		int product=1;
		System.out.println("Enter the array elements");
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			product=product*a[i];
		}
		System.out.println("The sum of array is: "+product);
	}
}
