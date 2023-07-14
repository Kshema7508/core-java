package com.xworkz.problems;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		int a[]=new int[50];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		
		int sum=0;
		System.out.println("Enter the array elements");
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println("The sum of array is: "+sum);
	}
}
