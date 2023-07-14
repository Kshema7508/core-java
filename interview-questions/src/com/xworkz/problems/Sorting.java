package com.xworkz.problems;

import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		int a[]=new int[10];
		int temp;
		
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Sorted array");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
