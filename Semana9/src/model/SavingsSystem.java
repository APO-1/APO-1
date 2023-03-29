package model; 

public class SavingsSystem{

	public static final int SIZE_USER = 5; 
	//  declaración 
	private User[] users; 

	public SavingsSystem(){ 
		users = new User[SIZE_USER];

	}

	/**
	 * initUser: Description 
	 * @param userName: String 
	 * @param userId: String 
	 * 
	 * */
	public void addUser(String userName, String userId){
		// inicializando
		User usuario = new User(userName, userId); 
		int pos = getFirstValidPosition();
		if(pos != -1){
			users[pos] = usuario; 
		}
	}

	public String addSaving(String nameSaving, double costSaving){
		String msg = "NO hay un usuario registrado";

		if(users[0] != null){
			Saving saving = new Saving(nameSaving, costSaving);
			msg = users[0].addSaving(saving);
		}
		return msg;
	}

	public int getFirstValidPosition(){
		int pos = -1; 
		boolean isFound = false; 
		for(int i = 0; i < SIZE_USER && !isFound; i++){
			if(users[i] == null){
				pos = i; 
				isFound = true;
			}
		}
		return pos; 
	}

	public String listAllSavings(){
		String msj = ""; 
		for(int i = 0; i< SIZE_USER; i++){
			if(users[i] != null ){
				msj += users[i].showSavings(); 
			}
		}
		return msj;
	}

	public User getUser(){
		return users[0];
	}
	

	public String toString(){
		return " Hola desde el to string del controlador";
	}

}
