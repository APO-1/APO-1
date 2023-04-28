package ui; 

import java.util.Scanner;

import model.AnimalsController; 

public class Main{

	private AnimalsController controller; 
	private Scanner reader; 

	public Main(){
		controller = new AnimalsController();
		reader = new Scanner(System.in); 
	}

	public static void main(String[] args){
		
		Main main = new Main(); 
		/** main.init(); */
		main.createAnimal2(); 
		/** main.printAnimals(); */
		main.printHumans();



	}


	public void init(){
		controller.initAnimals(); 
	}

	public void printAnimals(){
		System.out.println(controller.listAnimals());
	}

	public void printHumans(){
		System.out.println(controller.listHumans());
	}

	public void createAnimal(){
		System.out.println("type type");
		int type = reader.nextInt(); 

		System.out.println("type name");
		String name = reader.next(); 

		System.out.println("type year");
		int year = reader.nextInt(); 

		System.out.println("type specie");
		String specie = reader.next(); 

		System.out.println("type cc");
		String cc = reader.next(); 

		controller.createAnimal(name, year, specie, cc, type); 

	}

	public void createAnimal2(){
		String name = "";
		int year = -1;
		String specie = "";
		String cc;

		System.out.println("type type");
		int type = reader.nextInt(); 

		switch (type) {
			case 1:
				System.out.println("type name");
				name = reader.next(); 

				System.out.println("type year");
				year = reader.nextInt(); 

				System.out.println("type specie");
				specie = reader.next(); 

				System.out.println("type cc");
				cc = reader.next(); 
				controller.createAnimal(name, year, specie, cc); 
				break;
			case 2:
				System.out.println("type name");
				name = reader.next(); 

				System.out.println("type year");
				year = reader.nextInt(); 

				System.out.println("type specie");
				specie = reader.next(); 

				controller.createAnimal(name, year, specie); 

				break;
			case 3: 
				System.out.println("type name");
				name = reader.next(); 

				System.out.println("type year");
				year = reader.nextInt(); 

				controller.createAnimal(name, year); 

				break;
		}


	}


}

