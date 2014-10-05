package edu.upc.eetac.dsa.jcancer.Ejercicios;
import java.io.*;
public class ejercicio3 
{
    public static void main( String[] args )
    {
    	String fileName = "numeros.txt" ;
    	String line;
    	try
    	   {      
    	     BufferedReader in = new BufferedReader( new FileReader( fileName  ) );
    	     
    	     line = in.readLine();
    	     while ( line != null )  // while not end of file
    	     {
    	       System.out.println( line );
    	       line = in.readLine();
    	     }
    	     in.close();
    	   }
    	   catch ( IOException iox )
    	   {
    	     System.out.println("Problem reading " + fileName );
    	   }
    	finally
        { 
         System.out.println("Well closed." );
        }
    	 } 
}
    
