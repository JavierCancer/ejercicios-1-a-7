package edu.upc.eetac.dsa.jcancer.Ejercicios;
import java.io.IOException;
import java.io.File;


public class ejercicio5
{
	public static void main(String [] arg) throws IOException { 
		
		
	
		
		
		String sFichero = ("imagen.jpg");
		File fichero = new File(sFichero);
		System.out.println(fichero);
		System.out.println(fichero.length());
	}
}
