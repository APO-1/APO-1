package ui; 

import java.util.Scanner;

public class Main{

	private static Scanner reader = new Scanner(System.in); 

	// Definiendo como constante el tamanio del arreglo 
	public static final int SIZE_OF_ARRAY = 10; 

	//tipo de dato de los elementos del arreglo 
	//               |         
	//               |      inicialización del arreglo
	//               |              |
	//               |              |
	private static int[] numbers = new int[SIZE_OF_ARRAY]; 
	//                                           |
	//                                  el tamanio del arreglo


	public static void main(String[] args){

		double[] flotantes = new double[SIZE_OF_ARRAY]; 

		numbers[0] = 1; 

		System.out.println("el valor del arreglo en la pos 0 es: " + numbers[0]);
		System.out.println("el valor del arreglo en la pos 1 es: " + numbers[1]);

		// iterador ; condicion de parada; incremento del iterador 
		for(int i = 0; i < SIZE_OF_ARRAY; i++){
			System.out.println(numbers[i]);
		}
		System.out.println("final del arreglo"); 

		reader.close(); 
	}

	public static void readInfo(){
		reader.next();
	}

	public static int getSize(){
		return SIZE_OF_ARRAY; 
	}

}
