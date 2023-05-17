package model; 

import java.util.ArrayList; 
import java.lang.Math; 

public class MatrixCalculator{

	public static final int ROW = 5; 
	public static final int COLUMN = 5; 

	private int[][] matrix;

	private ArrayList<Integer> numbers; 

	private ArrayList<Person> people; 

	private ArrayList<Person[][]> peopleMatrix;

	public MatrixCalculator(){
		matrix = new int[ROW][COLUMN]; 
		initMatrix();
		numbers = new ArrayList<Integer>(); 
		people = new ArrayList<Person>(15);
		peopleMatrix = new ArrayList<>();
		initPeople(); 
		initPeopleTensor(); 

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
		for(int i = 0; i < 20; i++){
			people.add(new Person("name:"+i, i)); 
		}
	}

	public ArrayList<Person> getPeople(){
		return people; 
	}

	public boolean addPerson(String name, int age){
		Person person = new Person(name, age);
		return people.add(person); 
	}


	public Person searchByName(String name){

		Person personFound = null; 

		for(int i = 0; i<people.size(); i++){
			if(people.get(i).getName().equals(name)){
				personFound = people.get(i); 
			}
		}
		return personFound;
	}

	public boolean deleteByName(String name){
		return people.remove(searchByName(name)); 
	}

	public String printPeople(){
		String msj = ""; 
		for(int i = 0; i < people.size(); i++){
			msj += people.get(i); 
		}
		return msj; 
	}

	public Person[][] initPeopleMatrix(){
		Person[][] people = new Person[ROW][COLUMN]; 
		for(int i = 0; i < ROW; i++){
			for(int j = 0; j < COLUMN; j++){
				people[i][j] = new Person("name "+ (i+j) , i+j); 
			}
		}
		return people; 
	}

	public void initPeopleTensor(){
		for(int i = 0; i < 3; i++){
			peopleMatrix.add(initPeopleMatrix()); 
		}
	}

	public String showMatrixOfTensor(int pos){
		String msj = ""; 
		Person[][] temp = peopleMatrix.get(pos); 
		for(int i = 0; i < ROW; i++){
			for(int j = 0; j < COLUMN; j++){
				msj += temp[i][j]; 
			}
			msj += "\n"; 
		}
		return msj; 
	}

	public String printDoubleMatrix(){
		String msj = ""; 
		int upperBound = 5;
		int lowerBound = 0;
		int range = (upperBound - lowerBound) + 1;

		for(int i = 0; i < ROW; i++){
			msj += "\n"; 
			for(int j = 0; j < COLUMN; j++){
				// 
				matrix[i][j] = (int)(Math.random() * range) + lowerBound;
				msj += matrix[i][j] + " ";  
			}
		}
		return msj; 
	}

	public String printCharMatrix(){
		String msj = ""; 
		int upperBound = 70;
		int lowerBound = 65;
		int range = (upperBound - lowerBound) + 1;
		char[][] chars = new char[ROW][COLUMN]; 

		for(int i = 0; i < ROW; i++){
			msj += "\n"; 
			for(int j = 0; j < COLUMN; j++){
				// 
				chars[i][j] = (char)((Math.random() * range) + lowerBound);
				msj += chars[i][j] + " ";  
			}
		}
		return msj; 
	}


}
