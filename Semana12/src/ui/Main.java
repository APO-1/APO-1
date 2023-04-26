package ui; 

import model.*; 

public class Main{

	private AnimalsController controller; 

	public Main(){
		controller = new AnimalsController();
	}

	public static void main(String[] args){
		
		Main main = new Main(); 
		main.init();
		main.printAnimals();


	}


	public void init(){
		controller.initAnimals(); 
	}

	public void printAnimals(){
		System.out.println(controller.listAnimals());
	}


}

