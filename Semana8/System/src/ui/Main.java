package ui; 

import java.util.Scanner; 
import model.SavingsSystem;

public class Main{

	private SavingsSystem controller;
	private Scanner reader;

	public Main(){
		System.out.println("Hola desde el constructor de la clase Main en el paquete ui");
		reader = new Scanner(System.in); 
		controller = new SavingsSystem();
	}

	public static void main(String[] args){
		Main view = new Main(); 
		view.initUser();

		/** view.viewUserName(); */

	}

	public void executeOption(int option){
	}

	public void viewUserName(){
		System.out.println(controller.getUser().getName());
	}
	
	public void initUser(){
		String userName = ""; 
		String userId = ""; 

		System.out.println("Type your name"); 
		userName = reader.next(); 
		System.out.println("Type your id"); 
		userId = reader.next(); 
		
		controller.initUser(userName, userId); 
		viewUserName();

	}

}
