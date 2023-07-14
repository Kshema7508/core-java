package com.xworkz.problems;

import java.util.Scanner;

public class ReverseArray {
	
	public static void main(String[] args) {
		int arr[]=new int[50];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("The reversed array elements:");
		for(int i=n-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}
}
