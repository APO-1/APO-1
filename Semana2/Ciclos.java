import java.util.Scanner; 

public class Ciclos{

	public static void main(String[] args){

		Scanner reader = new Scanner(System.in); 
		int option; 


		do{ // ejecuta esta serie de operaciones 

			option = reader.nextInt(); 
			menu(option);

		} while( option != -1);  // mientras que se cumpla esta condición

		reader.close(); 
	}


	public static void menu(int option){

		switch(option){

			case 1: // apertura del caso
				System.out.println("el valor de option es: " + option);
				break; // el cierre del caso 

			case 2:  // apertura de otro caso
				System.out.println("Este es el segundo caso"); 

				break; // el cierre del otro caso 
			
			case -1: // el caso de salida 
				System.out.println("Exit"); 
				break; 

			default: // Caso por defecto 
				System.out.println("Este es el caso por defecto el valor de operation es: " + option);
				break; // cierre del caso por defecto 


		}

	}
	
}
