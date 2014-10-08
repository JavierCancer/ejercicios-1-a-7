
package edu.upc.eetac.dsa.jcancer.Ejercicios;
import java.io.*;

public class App 
{
    public static void main( String[] args )
    {
    	String fileName = "numeros.txt" ;
    	String line;
    	int numero;
    	boolean parsable = true;

    	try
    	   {      
    	     BufferedReader in = new BufferedReader( new FileReader( fileName  ) );
    	     
    	     line = in.readLine();
    	   //  Integer.parseInt(line);
    	     System.out.println("good");
    	     numero = Integer.parseInt(line);
    	     while ( line != null )  // while not end of file
    	     {
    	       System.out.println( line );
    	       line = in.readLine();
    	     }
    	     
    	     
    	     
    
    	    
    	     
    	   }
    	   catch ( IOException iox ) // sino encuentra el fichero
    	   {
    	     System.out.println("Problem reading " + fileName );
    	   }
    	catch(NumberFormatException e){
    		System.out.println("No son enteros!");
    		}
    	
    	}
}

      
        
    

