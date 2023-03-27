package model; 

public class User{

	public static final int SIZE = 10; 

	private String name; 
	private String id; 
	private double[] savings; 

	public User(String name, String id){

		this.name = name; 
		this.id = id; 
		savings = new double[SIZE];
	}

	public String addSaving(double saving){
		String msg = "No se pudo agregar el gasto";
		int pos = getFirstValidPosition(); 
		if(pos != -1){
			savings[pos] = saving; 
			msg = "El gasto se agrego"; 
		}

		return msg;
	}

	public int getFirstValidPosition(){
		int pos = -1; 
		boolean isFound = false; 
		for(int i = 0; i < SIZE && !isFound; i++){
			if(savings[i] == 0.0){
				pos = i; 
				isFound = true;
			}
		}
		return pos; 
	}

	public String getName(){
		return name; 
	}




}
