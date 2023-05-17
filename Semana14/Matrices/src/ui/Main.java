package ui; 

import java.util.Scanner;

import model.MatrixCalculator;

public class Main{

	private Scanner reader; 
	private MatrixCalculator controller; 

	public Main(){
		reader = new Scanner(System.in); 
		controller = new MatrixCalculator(); 

	}

	public static void main(String[] args){

		/** MatrixCalculator controller = new MatrixCalculator();  */
		Main main = new Main(); 

		/** String m = controller.printMatrix();  */
		/** System.out.println(m);  */
    /**  */
		/** String c = controller.getColumn(2); */
		/** System.out.println(c);  */
    /**  */
		/** String r = controller.getRow(2); */
		/** System.out.println(r);  */
    /**  */
		/** System.out.println(controller.getNmatrix()); */
		/** System.out.println(controller.getPeople());  */

		/** main.addPerson();  */
		/** main.printPeople();  */
		/** main.searchByName();  */
		main.printTensor(); 

	}

	public void addPerson(){
		System.out.println("Type Name");
		String name = reader.next(); 
		System.out.println("Type Age");
		int age = reader.nextInt(); 

		boolean result = controller.addPerson(name, age); 

		String msj = result ? "Se agrego" : "No se agrego"; 
		System.out.println(msj); 

	}

	public void printPeople(){
		System.out.println(controller.getPeople());
	}

	public void searchByName(){
		System.out.println("Type Name");
		String name = reader.next(); 
		System.out.println(controller.searchByName(name)); 
		System.out.println( controller.deleteByName(name)); 
		System.out.println(controller.printPeople()); 
	}
	
	public void printTensor(){

		System.out.println(controller.showMatrixOfTensor(0)); 
		/** System.out.println(controller.showMatrixOfTensor(1));  */
		/** System.out.println(controller.showMatrixOfTensor(2));  */

	}


}
