package com.xworkz.problems;

import java.util.Scanner;

public class AddTwoArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size for n");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elemnet to array A: ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the size for m");
		int m=sc.nextInt();
		int b[]=new int[m];
		System.out.println("Enter the elemnet to array B: ");
		for(int j=0;j<b.length;j++) {
			b[j]=sc.nextInt();
		}
		
		sc.close();
	}
}
