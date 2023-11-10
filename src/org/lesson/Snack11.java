package org.lesson;

import java.util.Random;
import java.util.Scanner;

public class Snack11 {

	/* SNACK #11 EXTRA : Dato un array di numeri interi casuali compresi tra 0 e 100, 
	 * scrivi un programma che trovi e stampi il numero massimo, minimo e il valore medio.
	*/
	
	public static void main(String[] args) {
		
		
		//Declare variables
		int[] array = new int[10];
		Random rnd = new Random();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		
		//Filling array
		for(int i = 0; i < array.length; i++) {
			
			array[i] = rnd.nextInt(0, 101);
			
			System.out.print(array[i] + " | ");
			
		}
		
		
		// Find max and min
		for (int i = 0; i < array.length; i++) {
			
			
            if (array[i] > max) {
            	
                max = array[i];
                
            }

            if (array[i] < min) {
            	
                min = array[i];
                
            }

        }
		
		System.out.println("\n ----------------------------------- \n");
		System.out.println(max + " " + min);
		
	}
	
	
}
