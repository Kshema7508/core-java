package com.xworkz.problems;

public class EvenNumber {
	
	public static void main(String a[]) {
	int	evenCount=0,oddCount=0;
		
		for(int i=0;i<100;i++) {
			if(i%2==0) {
				evenCount+=1;
				System.out.println("Even numbers :"+i);
			}
			else{
				oddCount+=1;
				System.out.println("odd numbers :"+i);
			}
		}
		System.out.println("count :"+evenCount);
		System.out.println("count :"+oddCount);
	}

}
