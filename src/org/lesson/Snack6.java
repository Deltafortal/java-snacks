package org.lesson;

public class Snack6 {
	
	
	// SNACK #6 BONUS : Dato un numero sotto forma di stringa, convertirlo in intero senza utilizzare funzioni già pronte.
	
	
	public static void main(String[] args) {
		
		// Initial Value
		String str_number = "125";
		int length = str_number.length();
        int result = 0;
        int multiplier = 1;
        
        
        // Main Logic
        for (int i = length - 1; i >= 0; i--) {
        	
            char c = str_number.charAt(i);
            
            if (c >= '0' && c <= '9') {
            	
                int int_number = c - '0';
                result += int_number * multiplier;
                multiplier *= 10;
                
            } else {
            	
                System.out.println("Ci hai provato ma...");
                
            }
        }
        
     
        System.out.println("Il risultato è: " + result);
	}
	
	

}
