package org.lesson;

import java.util.Arrays;

public class Snack9 {
	
	/* SNACK #9 EXTRA : Dato un array di numeri interi, dividere i numeri in due nuovi array: 
	 * uno contenente solo numeri pari e l'altro solo numeri dispari.
	*/
	
	public static void main(String[] args) {
		
		
		// Declaring variables
		
		int[] starting_array = {1,2,3,4,5,6,7,8};
		int[] even_array = new int[10];
		int[] odd_array = new int[10];
		int even_count = 0;
		int odd_count = 0;
		
		// Main logic
		for(int i = 0; i < starting_array.length; i++) {
			
			
			// Check if it's even
			if(starting_array[i] % 2 == 0) {
				
				even_array[even_count] = starting_array[i];
				even_count++;
				
			} else {
				
				odd_array[odd_count] = starting_array[i];
				odd_count++;
				
			}
			
			
		}
		
		 System.out.println("Array Pari: " + Arrays.toString(even_array));
		 System.err.println("Array Dispari: " + Arrays.toString(odd_array));
		
	}

}
