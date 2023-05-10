package model; 

import java.util.ArrayList; 

public class MatrixCalculator{

	public static final int ROW = 5; 
	public static final int COLUMN = 5; 

	private int[][] matrix;

	private ArrayList<Integer> numbers; 

	private ArrayList<Person> people; 

	public MatrixCalculator(){
		matrix = new int[ROW][COLUMN]; 
		initMatrix();
		numbers = new ArrayList<Integer>(); 
		people = new ArrayList<Person>(15);
		initPeople(); 

	}

	public String printMatrix(){
		String msj = ""; 
		for(int i = 0; i < ROW; i++){
			for(int j = 0; j < COLUMN; j++){
				msj += " "+matrix[i][j]; 
			}
			msj += "\n";
		}
		return msj; 
	}

	private void initMatrix(){
		for(int i = 0; i < ROW; i++){
			for(int j = 0; j < COLUMN; j++){
				matrix[i][j] = i+j; 
			}
		}
	}

	public String getColumn(int column){
		String msj = "";
		for(int i = 0; i< ROW; i++){
			msj += matrix[i][column]+"\n";
		}
		return msj;
	}

	public String getRow(int row){
		String msj = "";
		for(int i = 0; i< COLUMN; i++){
			msj += matrix[row][i]+" ";
		}
		return msj;
	}

	public ArrayList<Integer> getNmatrix(){
		String msj = ""; 

		// 1. dejar fija la columna 0 
		for(int i = COLUMN-1; i >= 0; i--){
			msj += matrix[i][0] + " "; 
			numbers.add(matrix[i][0]); 

		}

		for(int i = 1; i < COLUMN-1; i++){
			msj += matrix[i][i] + " "; 
			numbers.add(matrix[i][i]); 
		}

		for(int i = COLUMN-1; i >= 0; i--){
			msj += matrix[i][COLUMN-1] + " "; 
			numbers.add(matrix[i][COLUMN-1]); 
		}

		return numbers; 
	}

	public void initPeople(){
		System.out.println(people.get(0));
		for(int i = 0; i < people.size(); i++){
			people.add(new Person()); 
		}
	}

	public ArrayList<Person> getPeople(){
		return people; 
	}
	


}
