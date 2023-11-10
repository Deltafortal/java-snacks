package org.lesson;

import java.util.Scanner;

public class Snack5 {
	
	
	/* 
	  	SNACK #5 BONUS : Data una stringa in input mostrare a video quanti caratteri alfabetici contiene, quanti numeri e quanti simboli non alfanumerici.
		Continuare a chiedere una nuova stringa finché non si inserisce lo `0`.
	*/
	
    public static void main(String[] args) {
    	
    	
        Scanner in = new Scanner(System.in);

        
        
        while (true) {
            System.out.print("Inserisci una stringa oppure inserisci 0 per spegnere il programma: ");
            
            String inserted_text = in.nextLine();
            
            System.out.println("-------------------------------------------");

            
         // Check the input
            if (inserted_text.equals("0")) {
                System.out.println("Il programma è stato spento ");
                break;
            }

            
            
            // Declaring variables
            
            int alphabetical_chars = 0;
            int numbers = 0;
            int symbols = 0;

            
            // Main logic
            for (int i = 0; i < inserted_text.length(); i++) {
            	
            	
            	char c = inserted_text.charAt(i);
            	
            	
                if (Character.isLetter(c)) {
                	
                    alphabetical_chars++;
                    
                } else if (Character.isDigit(c)) {
                	
                    numbers++;
                    
                } else {
                	
                    symbols++;
                    
                }
            }
            
            // Print Result
            System.out.println("Caratteri alfabetici: " + alphabetical_chars);
            System.out.println("Numeri: " + numbers);
            System.out.println("Simboli non alfanumerici: " + symbols);
            
            System.out.println("-------------------------------------------");
        }

        in.close();
    }
}
