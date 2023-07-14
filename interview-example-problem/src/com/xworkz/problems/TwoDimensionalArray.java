package com.xworkz.problems;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int twod[][]= {{12,34,3,5,8,78},{12,20,5,19,34}};
		
		//how many arrays--->2array
		for(int i=0;i<twod.length;i++) { 
			System.out.println("Length of first array "+twod[i].length);
			
			//how many elements in array
			for(int j=0;j<5;j++) {
				System.out.println(twod[i][j]);
			}
		}
	}
}
