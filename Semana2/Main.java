import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		Scanner reader = new Scanner(System.in); 

		String name; 
		int year = -1; 

		System.out.print("type your age: "); 

		if(reader.hasNextInt()){
			System.out.println("el valor es un entero"); 
			year = reader.nextInt(); // entero
		}
		else{
			System.out.println("No es un entero"); 
			/** reader.next(); */
		}


		System.out.print("type your name: "); 
		reader.nextLine(); //lee el enter
		name = reader.nextLine(); // lee el flujo de strings 

		System.out.println("Your name is: " + name + " yuor age is: " + year); 

		// ejecutar la suma

		readInfo(); 
		reader.close();

	} // main

	public static void readInfo(){
		Scanner lector = new Scanner(System.in); 	
		System.out.print("type the of a: "); 
		int a = lector.nextInt();

		System.out.print("Type the value of b: "); 
		int b = lector.nextInt(); 

		int c = sum(a, b); 
		System.out.println("result of a+b = " + c); 

		lector.close();
	}
	
	public static int sum(int a, int b){
		int c = a + b; 
		return c; 
	}


}
