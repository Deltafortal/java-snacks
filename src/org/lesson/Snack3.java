package org.lesson;

public class Snack3 {

	
	// SNACK #3 : Crea un array di numeri interi e fai la somma di tutti gli elementi  che sono in posizione dispari
	
	public static void main(String[] args) {
		
		
		// Declare variables
		int[] numbers = {1, 5, 3, 6, 9, 15};
		int sum = 0;
		
		
		
		
		// Sum
		
		for(int i = 0; i < numbers.length; i++) {
			
			if((i + 1) % 2 == 0) {
				
				sum += numbers[i];
				
			}
			
		}
		
		System.out.println(sum);
		
		
	}
	
}
