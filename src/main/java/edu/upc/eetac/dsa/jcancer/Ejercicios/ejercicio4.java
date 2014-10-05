package edu.upc.eetac.dsa.jcancer.Ejercicios;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ejercicio4 

{
	public static void main(String [] arg) throws IOException { 
		
		File archivo = null;
		String fileout = "registro.txt";
		String filenameIN = "prueba.txt";
		String filenameOUT = "registro.txt";
		FileInputStream in = null;
		FileOutputStream out = null;
	//	String tc;
		try		
		{
			
        in = new FileInputStream ("prueba.txt");
        out = new FileOutputStream ("registro.txt");
		archivo = new File ("prueba.txt"); 
		
		String linea; 
		FileReader fr = new FileReader (archivo); 
		BufferedReader br = new BufferedReader(fr);
		
		
		
		
		
		
	//	BufferedWriter bw = new BufferedWriter(fw);
		
		
		while((linea=br.readLine())!=null)
		
		{ 
		System.out.println(linea);
		System.out.printf("El numero de caracteres es:");
		System.out.println(linea.length());
		Calendar cal = Calendar.getInstance();
		
		FileWriter fw = new FileWriter (filenameOUT); 
		fw.write(cal.toString());    		
		fw.write(filenameIN);   
	//	FileWriter fw1 = new FileWriter (filenameOUT); 
	//	fw1.write(cal.toString());    		
	//	fw1.write(filenameIN);   
		
	
		
		System.out.printf("fecha y hora actual: %tc",cal);
	
          
         
      
	//	fw1.write(cal.toString() + "%tc" + linea.length());
       
         
         {
        	 
         }
        
     //    bufferedInput.close();
     //    bufferedOutput.close();
		
		} 
		fr.close(); 
		} 
		catch(IOException e)
		{			
		System.out.println(e);		
		}		
		

		
 
	} 
} 