package org.lesson;

import java.util.Scanner;

public class Snack1 {

	// SNACK #1: Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.
	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Inserisci un numero ");
		String inserted_number = in.nextLine();
		int number = Integer.valueOf(inserted_number);
		
		in.close();
		
		// Calculate
		if(number % 2 != 0) {
			
			number++;
			
		}
		
		// Print
		System.out.println("il tuo numero è: ");
		System.out.println(number);
	}
}
