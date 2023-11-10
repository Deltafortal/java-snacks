package org.lesson;

public class Snack8 {

	
	/* SNACK #8 EXTRA : Dato un input stringa, il programma deve sostituire 
	   tutti i caratteri 'a' con 'o' e viceversa, quindi stampare la nuova stringa. 
	*/
	
	public static void main(String[] args) {
		
		//Declaring variables
		String text = "gabbiano";
		String new_word = "";
		
		
		// Main logic
		for(int i = 0; i < text.length(); i++) {
			
			char c = text.charAt(i);
			String character = c + "";
			
			
			if(character.equals("a")) {
				
				character = "o";
				
			} else if (character.equals("o")) {
				
				character = "a";
				
			}
			
			
			new_word += character;
			
		}
		
		System.out.println(new_word);
		
	}
	
}
