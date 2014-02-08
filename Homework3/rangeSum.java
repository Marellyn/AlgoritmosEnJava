/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:
Dados 2 numeros (limite inferior y superior), recorra el rango e imprima los numeros dentro de este rango.

*/

public class rangeSum {   

   public static void main(String[] args) {
		int n1;
		int n2;
		int m=0;
		n1= Integer.parseInt(args[0].toString());
		n2= Integer.parseInt(args[1].toString());
	if(n1<n2){		
		while(n1<n2-1)
		{
		n1=n1+1; 
         System.out.println(n1);
  		}    
  		} else if(n2<n1)
			{
			while(n2<n1-1)
			{
			n2=n2+1;
		System.out.println(n2);
			}
			}	
	}

}