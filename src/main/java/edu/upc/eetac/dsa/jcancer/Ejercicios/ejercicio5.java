package edu.upc.eetac.dsa.jcancer.Ejercicios;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.ObjectOutputStream;


public class ejercicio5
{
	public static void main(String [] arg) throws IOException { 	
		String filenameOUT = "registro2.txt";
		String sFichero = "imagen.jpg";
		File fichero = new File(sFichero);
		System.out.print("el fichero ");
		System.out.println(fichero);
		System.out.print("tiene un tamaño de: ");
		System.out.println(fichero.length());
	//	String outFichero = "registro2.txt";
//		File fichero1 = new File(outFichero);
		
		FileWriter fw = new FileWriter (filenameOUT); 
		
		fw.write("" + fichero.length()); //para que nos coja el stirng, ponemos un string dentro del string con las ""
		
		fw.close();
		
		
	  
}
}