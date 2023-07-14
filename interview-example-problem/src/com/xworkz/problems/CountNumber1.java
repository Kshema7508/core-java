package com.xworkz.problems;

public class CountNumber1 {
public static void main(String[] args) {
		
		int n=52525;
		int count=0,evenCount=0,oddCount=0;
		
		
		while(n>0) {
			if(n%2==0) {
				evenCount+=1;
			}
			else {
				oddCount+=1;
			}
			n=n/10;
			count++;
		}
		System.out.println("Total Digits are :"+count);
		System.out.println("Even Digits are :"+evenCount);
		System.out.println("odd Digits are :"+oddCount);
	}
}
