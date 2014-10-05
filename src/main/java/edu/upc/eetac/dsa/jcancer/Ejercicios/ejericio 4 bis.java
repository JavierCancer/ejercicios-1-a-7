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

public class ejercicio4 bis

{
	public static void main(String [] arg) throws IOException { 
		
		File archivo = null;
		String fileout = "registro.txt";
	//	String tc;
		try		
		{             
         
		archivo = new File ("prueba.txt"); 
		
		String linea; 
		FileReader fr = new FileReader (archivo); 
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter (fileout);
	//	BufferedWriter bw = new BufferedWriter(fw);
		
		
		while((linea=br.readLine())!=null)
		
		{ 
		System.out.println(linea);
		System.out.printf("El numero de caracteres es:");
		System.out.println(linea.length());
		Calendar cal = Calendar.getInstance();
	//	String tc;
		fw.write(cal.toString() + "%tc" + linea.length());
		System.out.printf("fecha y hora actual: %tc",cal);
		FileInputStream fileInput = new FileInputStream("prueba.txt");
        //BufferedInputStream bufferedInput = new BufferedInputStream(fileInput);
          
         
        FileOutputStream fileOutput = new FileOutputStream ("registro.txt");
     //   BufferedOutputStream bufferedOutput = new BufferedOutputStream(fileOutput);
          
         
       
         
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