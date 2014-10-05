
package edu.upc.eetac.dsa.jcancer.Ejercicios;
import java.io.*;
public class Ejercicio2 
{
    public static void main( String[] args )
    {
    	String fileName = "numeros.txt" ;
    	String line;
    	int numero;
    	try
    	   {      
    		BufferedReader in = new BufferedReader( new FileReader( fileName  ) );
    	     
    	     line = in.readLine();
    	     
    	     numero = Integer.parseInt(line);
    	     
    	     while ( numero < 1000 )  // while not end of file
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
    		catch (IOException iox)
    		{
    		System.out.println("No number");
    		}
    	
    	 }
    
   
        
    }

