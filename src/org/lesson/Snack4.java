package org.lesson;

import java.util.Scanner;

public class Snack4 {

	// SNACK #4 BONUS : Data in input una stringa verificare se è palindroma
	
	public static void main(String[] args) {
		
		
		// Getting input
		
		Scanner	in = new Scanner(System.in);
		System.out.println("Inserisci una parola: ");
		
		String selected_word = in.nextLine();
		
		System.out.println("----------------------");
		System.out.println("La parola inserita è: " + selected_word);
		
		
		in.close();
		
		
		// Calculating
		
		String reversed_word = "";
		
		for(int i = selected_word.length(); i > 0; i--) {

			char c = selected_word.charAt(i - 1);
			String character = c + "";
			
			reversed_word += character;
			
		}
		
		System.out.print("La tua parola al contrario è: ");
		System.out.println(reversed_word);
		
		System.out.println("-----------------------------");
		
		
		
		// Check
		
		boolean isPalindrome = reversed_word.equals(selected_word) ? true : false;
		
		if(isPalindrome) {
			
			System.out.println("La tua parola E' palindroma ");
			
		} else {
			
			System.out.println("La tua parola NON è palindroma ");
			
		}
		
		
	}
							
}