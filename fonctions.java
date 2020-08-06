package eya;

import java.util.concurrent.ThreadLocalRandom;

public class fonctions {
	
	//fonction1
	
	public static String reverseString(String chaine_origine) {
		String chaine_resultat="";
		for(int i=chaine_origine.length()-1; i>=0; i--) {
			chaine_resultat += chaine_origine.charAt(i);
		}
		return chaine_resultat;
	}
	
	//fonction2
	
	public static boolean isPalindrome(String mon_mot) {
		
		if (reverseString(mon_mot).equals(mon_mot)) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	//fonction3
	
	public static int randBetween(int min, int max) {
		
		int randomNum = ThreadLocalRandom.current().nextInt((max - min) + 1)+min;
		
		return randomNum;
		
	}
	
	
	
	public static void main(String[] args) {
		
		//fonction1: reverseString 
		
		System.out.println(reverseString("ABC"));
		System.out.println(reverseString("EYE"));
		System.out.println(reverseString("AMIR"));
		System.out.println(reverseString("LIVIL"));
		System.out.println(reverseString("BONBON"));
		System.out.println(reverseString("SAMIMAS"));
		
		//
		System.out.println("-------------------------------------------------------");
		//
		
		//fonction2: isPalindrome
		
		System.out.println(isPalindrome("ABC"));
		System.out.println(isPalindrome("EYE"));
		System.out.println(isPalindrome("AMIR"));
		System.out.println(isPalindrome("LIVIL"));
		System.out.println(isPalindrome("BONBON"));
		System.out.println(isPalindrome("SAMIMAS"));
		
		//
		System.out.println("-------------------------------------------------------");
		//
		
		//fonction3: randBetween 
		
		System.out.println(randBetween(1,10));
		System.out.println(randBetween(5,15));
		System.out.println(randBetween(10,100));
		
	}
	
	
	
}
