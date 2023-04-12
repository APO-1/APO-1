package model; 

/**
 * This class represents a user 
 * */

public class User{

	/**
	 * SIZE the total savings per user
	 * */
	public static final int SIZE = 10; 

	/**
	 * represents the name of user 
	 * */
	private String name; 

	/**
	 * represents the id of user 
	 * */
	private String id; 

	/**
	 * represents the array of savings per user  
	 * */
	private Saving[] savings; 

	public User(String name, String id){

		this.name = name; 
		this.id = id; 
		savings = new Saving[SIZE];
	}

	/**
	 * addSaving: add one object type saving in the array of savings 
	 * @param saving saving to add in array of savings per user 
	 * @return msj the message that say if the saving is added or not 
	 * */
	public String addSaving(Saving saving){
		String msg = "No se pudo agregar el gasto";
		int pos = getFirstValidPosition(); 
		if(pos != -1){
			savings[pos] = saving; 
			msg = "El gasto se agrego"; 
		}

		return msg;
	}

	/**
	 * getFirstValidPosition: search in array if exist one valid position
	 * @return pos -1 if the position does not exist, a number in [0, 9] if exist a valid position
	 * */
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

	/**
	 * showSavings: show all savings of the user 
	 * @return msj a message with the names of savings 
	 * */
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

	public String getId(){
		return id;
	}	


}
