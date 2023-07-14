package com.xworkz.problems;

import java.util.Scanner;

public class MergeAndRemoveDublicate {

	public static void main(String[] args) {
		
		int a[]=new int[100];
		int b[]=new int[100];
		int i,j;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n=sc.nextInt();
		System.out.println("Enter the element to array A:");
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the element to array B:");
		for(j=0;j<n;j++) {
			b[j]=sc.nextInt();
		}
		int c=a[i]+b[j];
		
		System.out.println("The merged array is:"+c);
		for(j=0;j<n;j++) {
			
		}
	}
}
