package ui; 

import model.Hospital;
import java.util.Scanner; 

public class Main{
	
	// atributo de la clase
	private Hospital controller; // conexión con el model por medio de un atributo 
	private Scanner reader; // declarando un atributo Scanner

	// constructor
	public Main(){
		System.out.println("constructor de la clase Main");
		controller = new Hospital(); 
		reader = new Scanner(System.in); // Inicializando el atributo

	}

	public static void main(String[] args){
		Main m = new Main();
		m.createPerson();

		String namePerson = m.controller.getPerson().getName(); 
		System.out.println(namePerson); 


	}

	public void createPerson(){
		String name; 
		String phone; 
		String email; 

		System.out.println("type name of person: "); 
		name = reader.next();

		System.out.println("type phone of person: "); 
		phone = reader.next();

		System.out.println("type email of person: "); 
		email = reader.next();

		controller.createPerson(name, phone, email);

	}

}
