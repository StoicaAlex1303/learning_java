package com.alex.PrimitiveDataTypes;

import com.sun.jdi.LongValue;

public class PrimitiveDataType {

	public static void main(String[] args) {
		
		/*
		 * 
		 *PRIMITIVE DATA TYPES 
		 *byte 8 bits (-128 -> 127)
		 *short 16 bits (-32 768 -> 32 767)
		 *int 32 bits (-2 147 483 648 -> 2 147 483 647)
		 *long 64 bits
		 *
		 *float 32 bits  => Floating-point numbers are numbers with a decimal point
		 *double 64 bits => Double type can be user for more precise numbers
		 *
		 *char 16 bits => Char types is used for individual characters, such as letters. numbers, punctuation and other symbols
		 *boolean => This data type holds either true or false
		 *
		 *Constants: If the values never should change during a program's runtime you can use a type of variable called a constant
		 *                  To declare a constant, use the final keyword before the variable declaration and include an initial value for that variable
		 */
		
		//Exambles
		
		byte aByte = 20;
		//System.out.println(aByte); 

		short aShort = 15900;
		//System.out.println(aShort);
		
		int aInt = 623541;
		//System.out.println(aInt);
		
		long aLong = 324643654;
		//System.out.println(aLong);
		
		float aFloat = 3.5f;  //We must add the letter 'f' at the end of the value
		//System.out.println(aFloat);
		
		double aDouble = 25.89;
		//System.out.println(aDouble);
		
		char aCharacter = 'x';
		//System.out.println(aCharacter);
		
		aCharacter = '.';
		//System.out.println(aCharacter);
		
		boolean aBoolean = true;
		//System.out.println(aBoolean);
		
		//Constants
		final int someValue = 30;
		System.out.println(someValue);
		
	    //someValue = 50;
		//System.out.println(someValue);

		
		
		 
		
		
		
		
		
		
		
		
		
	}

}
