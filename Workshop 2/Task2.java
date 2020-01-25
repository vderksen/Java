//JAC444NEE
//Valentina Derksen
//Student id: 153803184

// Workshop 2
// Date: 2020-01-25


import java.util.Scanner; 
import java.util.Arrays;

public class Task2 {
	
	// Main Method
	public static void main(String[] args) {
		System.out.println("Enter the number of rows and columns in the array: ");
		Scanner input = new Scanner(System.in);
		int row = input.nextInt(); 
		int column = input.nextInt(); 

		double[][] array = new double[row][column];
		System.out.println("Enter the array: ");
		for (int i=0; i<row; i++) {
			for(int j=0;j<column; j++) {
				Scanner inputArray = new Scanner(System.in);
				array[i][j] = input.nextDouble(); 
			}
		}

		double max = Double.MIN_VALUE;
	      for(int i=0; i<row; i++){
	          for(int j=0; j<column; j++){
	                    if(max<array[i][j]){
	                        max = array[i][j];
	                    }
	          }     
	      }    
	      System.out.print("Maximum number in the row is "+ max);
	      printLocation(array, max);
	}
	
		
			// Method: return the location of max number in the array
				public static void printLocation(double[][] arr, double max) {
					for (int i = 0; i < arr.length; i++) { 
					    for (int j = 0; j < arr[i].length; j++) { 
					        if (arr[i][j] == max) { 
					            System.out.print(" at ("+ i + ","+ j +")");
					        }
					    }
					}
				}
	
}
