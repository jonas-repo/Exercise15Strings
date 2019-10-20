package com.exercise15String.model;

public class Tuneador {
	
	public static String[] tunear(String[] cade)
	{
		for (int i = 0; i < cade.length; i++) 
		{
			cade[i] = cade[i].trim();
			cade[i] =cade[i].toLowerCase();
			cade[i] = cade[i].replace('a', 'o');
			cade[i] = cade[i].replace('e', 'o');
			cade[i] = cade[i].replace('i', 'o');
			cade[i] = cade[i].replace('u', 'o');
		}
		return cade;
	}
	
	public static double mediaVector(int[] miArray)
	{
		int suma = 0;
		for (int i = 0; i < miArray.length; i++) {
			suma=suma+miArray[i];
		}
		
		return suma/miArray.length;
	}
	
}
