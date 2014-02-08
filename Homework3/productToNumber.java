/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Despliege la multiplicacion desde 0 hasta un valor 'n' dado.
Ej:
Si si ingresa 6
mostrar
1x2x3x4x5x6=720

*/

public class productToNumber {   

   public static void main(String[] args) {
		int x=1;
		int dato;
		int multiplicacion=1;
   		dato = Integer.parseInt(args[0].toString());
		System.out.print("1x");
		while(x!=dato)
		{
		x=x+1;
		multiplicacion=multiplicacion*x;
		
		System.out.print(x+"x"); 		    
		}
		
		System.out.print("resultado=" +multiplicacion );	
			
	}
}