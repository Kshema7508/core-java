package com.xworkz.problems;

import java.util.Scanner;

public class ArmstrongNumber1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int i;
		int res=0;
		int r;
		
		i=num;
		while(i!=0) {
			r=i%10;
			res+=Math.pow(r,3);
			i= i/10;
		}
		if(res==num) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not Armstrong number");
		}
	}
}