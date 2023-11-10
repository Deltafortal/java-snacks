package org.lesson;

public class Snack7 {

	/* SNACK #7 BONUS : Scrivere un programma che dati dei secondi li converta in ore, minuti, 
	  secondi e mostri a video la stringa generata (secondi → “`hh:mm:ss`”) 
	*/
	
	public static void main(String[] args) {
		
		
		// Declaring variables
		
		int inserted_seconds = 6748;
		
		int seconds = 0;
		int minutes = 0;
		int hours = 0;
		
		String full_time = "";
		
		hours = inserted_seconds / 3600;
        minutes = (inserted_seconds % 3600) / 60;
        seconds = inserted_seconds % 60;
		
        
		System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);
		
		
		
	}
	
}
