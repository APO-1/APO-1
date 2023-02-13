package ui; 

import java.util.Scanner; 

public class Condicionales{

	public static void main(String[] args){

		Scanner reader = new Scanner(System.in); 

		int option = 0; 

		option = reader.nextInt(); 

		if(option == 1){ // cuando se cumple no evalua las demas condiciones 
										 // dentro al condicional y ejecuto el código 
			System.out.println("el valor de option es: " + option); 
		}

		else if(option == 2){ // si no se cumple la condición anterior 
													// evaluo esta condición y si se cumple 
													// la ejecuto 
			System.out.println("el valor de option es: "+ option); 
		}

		// condicional en cascada 
		else if(option >= 1){

			if(option == 3 || option == 6){
				System.out.println("estoy en el condicional de la o");
			}
			else{
				System.out.println("estoy en el tercer condicional: " + option); 
			}
		}

		else{
			System.out.println("¿me voy a imprimir?"); 
		}



		reader.close(); 
	}
	


}
