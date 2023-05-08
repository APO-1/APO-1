package model; 

public class MatrixCalculator{

	public static final int ROW = 3; 
	public static final int COLUMN = 5; 

	private int[][] matrix;

	public MatrixCalculator(){
		matrix = new int[ROW][COLUMN]; 
		initMatrix();
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

}
