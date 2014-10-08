package edu.upc.eetac.dsa.jcancer.Ejercicios;
import java.io.*;


public class Dato implements Serializable
{	
	
   public String nombre;
   public int altura;
   public  char letradni;
   
   
   
   public Dato (){
	   
	   nombre = "";
	   altura = 0;
	   letradni = 'D'; 
   }
   
   
   public void setnombre (String Nombre){
	   nombre = Nombre;
   }
   
   public void setaltura (int centimetros){
	   altura = centimetros;
   }
   public void setletra (char letra){
	   letradni = letra ;
   }
     }