package com.ankit.array;

public class TwoDimensArray {

	public static void main(String[] args) {
		
		int a[][]= {{1,2},{3,4},{5,6}}; //3 rows and 2 columns 
		
		System.out.println("2nd row 2nd column :"+a[1][1]);
		
		System.out.println("Print full array");
		
		for(int row=0;row<3;row++) {    // implementation of for loop for print the value in ROW AND COLUMN
			//will take the value of row=0 which will be less then 3 and will pass and come under the column for loop
			
			for(int col=0;col<2;col++) { // here the value will be printing in the form where Row=0 and column 1 then Row =0 and column 2
									   	// after this the it will come out of column for loop and will go back to for loop of row and 
										//the value will be increased to 1 (Row=1)and will enter back to the column loop again with the value of row=1.
				
				System.out.print(a[row][col] +"      ");
			} 
			System.out.println();
		}
		
		
	}
	
}
