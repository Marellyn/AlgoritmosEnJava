/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Dado un numero mayor a cero, imprima el valor actual desde cero hasta antes de llegar dado valor.

*/

public class whileValue {   

   public static void main(String[] args) {
   		int valorActual = 0;
 		int z=0;
		valorActual= Integer.parseInt(args[0].toString());
		while(z<valorActual){
   			System.out.println("el valor actual es: "+ z );
      			z=z+1;
	}
   }

}