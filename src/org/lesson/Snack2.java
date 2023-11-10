package org.lesson;

import java.util.Random;

public class Snack2 {
	
	/* SNACK #2 : Generatore di “nomi cognomi” casuali: il Grande Gatsby ha  una lista di nomi e una lista di cognomi, 
	 * e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.
	*/
	
	public static void main(String[] args) {
		
		// Declaring variables
		String[] names = {"Mario", "Luigi", "Giovanna", "Anna", "Carlo", "Maria", "Luca", "Giuseppe", "Elena", "Francesca"};
		String[] surnames = {"Rossi", "Bianchi", "Verdi", "Russo", "Ferrari", "Esposito", "Romano", "Gallo", "Conti", "Marino"};
		String[] list = new String[5];
		
		
		
		System.out.println("La tua lista degli invitati: ");
		System.out.println("-------------------------------------------");
		
		
		// Generate random list
		Random rnd = new Random();
		
		for(int i = 0; i < list.length; i++) {
			
			int random_name = rnd.nextInt(0, names.length);		
			int random_surname = rnd.nextInt(0, surnames.length);
			
			String invited = names[random_name]+ " " + surnames[random_surname];
			
			list[i] = invited;
			
			
			
			System.out.print(list[i] + " | ");
			
		}
		
		
		
	}
}
