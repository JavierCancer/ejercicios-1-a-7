package edu.upc.eetac.dsa.jcancer.Ejercicios;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.io.ObjectOutputStream;


public class ejercicio6
{
	public static void main(String [] arg) throws IOException { 	
		
		String sFichero = ("registro.txt");
		String jFichero = ("registro2.txt");
		File fichero = new File(sFichero);
		System.out.print("el fichero ");
		System.out.println(fichero);
		System.out.print("de tamaño: ");
		System.out.println(fichero.length());
		File fichero1 = new File(jFichero);
		System.out.print("el fichero ");
		System.out.println(fichero1);
		System.out.print("de tamaño: ");
		System.out.println(fichero1.length());
		
		if (fichero1.length() < fichero.length())
			System.out.println("registro.txt es de mayor tamaño");
		
		else
			System.out.println("registro2.txt es de mayor tamaño");
		
}
}