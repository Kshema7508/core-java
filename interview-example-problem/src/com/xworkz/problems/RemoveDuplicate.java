package com.xworkz.problems;

import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int arr[]=new int[50];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the array size: ");
		int n=sc.nextInt();
		
		System.out.println("Enter the array Elements ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		/*System.out.println("Content of the array: ");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+" ");
		} */
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[j]==arr[i]) {
					arr[j]=-1;
				}
			}
		}
		
		System.out.println("After removing dublicate Elements");
			for(int i=0;i<n;i++) {
				if(arr[i]!=-1) {
					System.out.println(arr[i]);
				}
			}
	}
}
