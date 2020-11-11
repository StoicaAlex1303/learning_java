package com.alex.Literals;

public class Literal {

	public static void main(String[] args) {
		
		//Literals
		int integerValue = 5;
		short shortValue = 5;
		byte byteValue = 5;
		
		long numberOfBalls =1;
		//System.out.println(numberOfBalls);
		
		numberOfBalls = numberOfBalls + 65;
		//System.out.println(numberOfBalls);
		
		int negativeNumber = -10;
		//System.out.println(negativeNumber);
		
		float negativeDecimalNumber = -5.6f;
		//System.out.println(negativeDecimalNumber);
		
		long aVeryLargeNumber = 23_000_000; //Java compiler ignores these underscore characters
		//System.out.println(aVeryLargeNumber);
		
		boolean programmingIsFun = true;
		//System.out.println("Is programming fun? " + programmingIsFun);
		
		char a = 'a';
		char hash = '#';
		char three = '3';
		
		//System.out.println(a + " " + hash + " " + three);
		
		/*
		 * 
		 * 
		 * Code               Meaning
		 * 
		 * \n                     New line
		 * \t                      Tab
		 * \b                     Backspace
		 * \\                      Backslash
		 * \'                      Single Quotation Mark
		 * \"                     Double Quotation Mark
		 * 
		 */
		
		System.out.println("Hi this is \n awesome and great");
		System.out.println("I want to show \t another \t example");
		System.out.println("So this is random\bsds\b and good");
		System.out.println("So here I am using backslash \\ and here put some text");
		System.out.println("So he says \'Muie Steaua\'");
		System.out.println("So he says \"Muie Steaua\"");
	

	}

}
