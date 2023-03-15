package ui; 

import model.Person;
import java.util.Scanner; 

public class Main{
	
	// atributo de la clase
	private Person person; // conexión con el model por medio de un atributo 
	private String info;
	private Scanner reader; // declarando un atributo Scanner

	// constructor
	public Main(){
		System.out.println("constructor de la clase Main");
		person = new Person("P1 Atributo", "30", "a1@correo.com");
		info = "Clase Main";
		reader = new Scanner(System.in); // Inicializando el atributo

	}

	public static void main(String[] args){
		System.out.println("LLamado al constructor");
		Person p1 = new Person("A1", "30", "a1@correo.com"); // Creando una conexión con el modelo por medio de una dependencia de un objeto

		System.out.println("LLamado al getName");
		String name = p1.getName();
		System.out.println(name);

		System.out.println("LLamado al setName");
		p1.setName("nombre persona");

		System.out.println("LLamado al getName");
		name = p1.getName();
		System.out.println(name);


		Main m = new Main();
	  Person p = m.getPerson();
		System.out.println(p.sayHello());

	}

	public Person getPerson(){
		return person;
	}


}
