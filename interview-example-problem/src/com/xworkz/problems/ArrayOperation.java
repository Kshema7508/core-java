package com.xworkz.problems;

public class ArrayOperation {

	public static void main(String[] args) {
		int a[]= {23,45,12,56,67,89,10};
		
		System.out.println(a.length);
		//toString is used to display the address
		//System.out.println(a.toString());
		
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=1;j<=a[i];j++) {
				if(a[i]%j==0) {
					count++;
				}
			}
				if(count==2) {
					System.out.println("It is prime number");
				}
				else {
					System.out.println("not prime number");
				}
		}
	}
}

//23,45,12,56,67,89,10