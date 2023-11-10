package org.lesson;

import java.util.Arrays;
import java.util.Scanner;

public class Snack10 {

	
	/* SNACK #10 EXTRA : Dati due numeri interi acquisiti dall'utente (`Scanner`), 
	 * calcolare la somma di tutti i numeri compresi tra questi due valori (inclusi).
	*/
	
	public static void main(String[] args) {
		
		
		// getting data
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserisci il primo numero: ");
		String first = in.nextLine();
		
		
		System.out.println("Inserisci il secondo numero: ");
		String second = in.nextLine();

		
		in.close();
		
		
		// Converting
		int firstNumber = Integer.valueOf(first);
		int secondNumber = Integer.valueOf(second);
		
		int sum = 0;
		
		
		
		// Get the greater number
		int greater = firstNumber >= secondNumber ? firstNumber : secondNumber;
		int shorter = firstNumber <= secondNumber ? firstNumber : secondNumber;
		
		
		// Main logic
		for(int i = shorter; i <= greater; i++) {
			
			sum += i;
			
		}
		
		System.out.println("La somma è: " + sum);
		
	}
}
