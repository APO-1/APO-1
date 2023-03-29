package model; 

public class User{

	public static final int SIZE = 10; 

	private String name; 
	private String id; 
	private Saving[] savings; 

	public User(String name, String id){

		this.name = name; 
		this.id = id; 
		savings = new Saving[SIZE];
	}

	public String addSaving(Saving saving){
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
			if(savings[i] == null){
				pos = i; 
				isFound = true;
			}
		}
		return pos; 
	}

	public String showSavings(){
		String msj = ""; 
		for(int i = 0; i < SIZE; i++){
			if(savings[i] != null){
				msj += savings[i].getName() + " "; 
			}
		}
		return msj;
	}

	public String getName(){
		return name; 
	}




}
