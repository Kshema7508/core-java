package com.xworkz.problems;

public class CountNumbers {
	public static void main(String[] args) {
		
		int num=1234;
		int count=0;
		
		while(num>0) {
			num=num/10;
			System.out.println(num);
			count++;
			
		}
		System.out.println("Digits are :"+count);
	}

}
