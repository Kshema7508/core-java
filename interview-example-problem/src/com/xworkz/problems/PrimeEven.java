package com.xworkz.problems;

import java.util.Scanner;

public class PrimeEven {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[50];
		int square=0;
		int square1=0;
		int evencount=0;
		int oddcount=0;
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			int count=0;
			
			for(int j=1;j<=arr[i];j++) {
				if( arr[i]%j==0 || arr[i]%2==0) {
					count+=1;
					evencount+=1;
				}
			}
			if(count==2) {
				square=arr[i]*arr[i];
				System.out.println("The square of prime "+arr[i]+" is "+square);
			}
			else {
				System.out.println("not prime");
			}
		}
		square1=evencount*evencount;
		System.out.println("The number is even the square of next number is "+square1);
		
		
	}
}
