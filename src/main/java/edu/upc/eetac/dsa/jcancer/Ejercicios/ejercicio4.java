package edu.upc.eetac.dsa.jcancer.Ejercicios;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ejercicio4 

{
	public static void main(String [] arg) throws IOException { 
		
		File archivo = null;
		String filenameIN = "prueba.txt";
		String filenameOUT = "registro.txt";
		FileInputStream in = null;
		FileOutputStream out = null;
	
		
        in = new FileInputStream ("prueba.txt");
        out = new FileOutputStream ("registro.txt");
		archivo = new File ("prueba.txt"); 
		
		String linea; 
		FileReader fr = new FileReader (archivo); 
		BufferedReader br = new BufferedReader(fr);
	//	BufferedWriter bw = new BufferedWriter(new FileWriter("registro.txt"));
		try		
		{
			

		while((linea=br.readLine())!=null)
		
		{
		System.out.print("nombre del fichero: ");
		System.out.println(filenameIN);
		System.out.print("el fichero contiene: ");
		System.out.println(linea);
		System.out.printf("numero de caracteres es: ");
		System.out.println(linea.length());

		
		Date dNow = new Date( );
	      SimpleDateFormat ft = 
	      new SimpleDateFormat (" dd/MM/yyy hh:mm:ss");

	      System.out.println("Fecha actual : " + ft.format(dNow));
		
	
	    
		FileWriter fw = new FileWriter (filenameOUT); 
		
   		
		fw.write(filenameIN); 
		fw.write(linea);
		fw.write(""+ft.format(dNow));
		fw.close();
	
		}
		
				
	} 
	finally {
		out.close();
		in.close();
		
	}
	
	}
	


	
}
