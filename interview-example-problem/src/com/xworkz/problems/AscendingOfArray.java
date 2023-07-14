package com.xworkz.problems;

import java.util.Scanner;

public class AscendingOfArray {

	public static void main(String[] args) {
		int arr[]=new int[50];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int a;
		System.out.println("Enter the array Elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("The array before sorting:");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				//for ascending arr[i]>arr[j] for descending arr[i]<arr[j]
				if(arr[i]>arr[j]) {
					a=arr[i];
					arr[i]=arr[j];
					arr[j]=a;
				}
			}
		}
		System.out.println("The array after sorting: ");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
}
