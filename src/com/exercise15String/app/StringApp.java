package com.exercise15String.app;

import com.exercise15String.model.Tuneador;

public class StringApp {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String chain = "Las personas con cáncer que presentan dolor pueden notar que su dolor cambia a lo largo del día, "
				+ "y que puede ser diferente día a día. Llevar un registro de su dolor y sus síntomas, e informarlos.";
		String cat = "hola";
		String cat2 = "hola";
		String[] chain2;
		
		System.out.println("char at: " + chain.charAt(8));
		System.out.println("code point at: " +chain.codePointAt(8));
		System.out.println("code point count: "+chain.codePointCount(9, 19));		
		System.out.println("code point before: "+chain.codePointBefore(7));
		System.out.println("contains: "+chain.contains("tratamiento"));
		System.out.println("valueOf :"+ String.valueOf(115));
		System.out.println("endswith: "+chain.endsWith("alivio."));
		System.out.println("trim: "+cat.trim()+cat2.trim());
		System.out.println("index of: " + chain.indexOf("s"));
		System.out.println("last index: "+ chain.lastIndexOf("s"));
		System.out.println("lenght: " + chain.length());
		chain2 = chain.split(",");
		for (int i = 0; i < chain2.length; i++) {
			System.out.println(" "+chain2[i]);
		}
		
		System.out.println("Replace: "+ chain.replace('a','e'));
		System.out.println("To lower case: "+chain.toLowerCase());
		System.out.println("To upper case: "+chain.toUpperCase());
		
		if(cat.equals(cat2))
		{
			System.out.println("equals: "+true);
		}
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		
		String[] misCadenas = {cat,cat2,chain};
		misCadenas = Tuneador.tunear(misCadenas);
		
		for (int i = 0; i < misCadenas.length; i++) {
			System.out.println(misCadenas[i]);
		}
		int[] arregloint = {6,7,5,6,7,9,4};
		
		System.out.println("Media de enteros: "+Tuneador.mediaVector(arregloint));
		
	}

}
