package edu.upc.eetac.dsa.jcancer.Ejercicios;
import java.io.*;


public class Ejercicio7 
{
	
	public static void main (String[] args){

 

   String filenameF = "registroej7.txt";
   FileOutputStream fos = null;
   ObjectOutputStream out = null;
   
   Dato datos = new Dato ();
   
    try {
  
   fos = new FileOutputStream (filenameF);
   out = new ObjectOutputStream (fos);
 
   datos.setnombre("Juan");
   datos.setaltura(177);
   datos.setletra('J');
   
   
	out.writeObject(datos); 
	
	out.close();
	   
  
  }catch(Exception e){
	  System.out.println("No funciona");
  }
	}
	}



