package ui; 

import model.MatrixCalculator;

public class Main{

	public static void main(String[] args){

		MatrixCalculator controller = new MatrixCalculator(); 

		String m = controller.printMatrix(); 
		System.out.println(m); 

		String c = controller.getColumn(2);
		System.out.println(c); 

		String r = controller.getRow(2);
		System.out.println(r); 

	}

}
