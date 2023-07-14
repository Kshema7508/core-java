package com.xworkz.problems;

import java.util.Scanner;

public class ArrayDuplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[50];
		
		System.out.println("Enter the size");
		int n=sc.nextInt();
		
		
		System.out.println("Enter the array element");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		boolean flag=false;
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
					flag=true;
				}
			}
		}
	}
}
