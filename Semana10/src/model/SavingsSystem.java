package model; 

/**
 * SavingsSystem this class represents the controller class of the system 
 * */
public class SavingsSystem{

	public static final int SIZE_USER = 5; 
	//  declaración 
	private User[] users; 

	public SavingsSystem(){ 
		users = new User[SIZE_USER];

	}

	/**
	 * addUser: add a new user in the array of users  
	 * @param userName the name of user to add 
	 * @param userId the id of user to add 
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

	/**
	 * addSaving: add new saving to user 0 
	 * @param nameSaving name of the saving to add 
	 * @param costSaving cost of the saving to add 
	 * */
	public String addSaving(String nameSaving, double costSaving, int category){
		String msg = "NO hay un usuario registrado";

		Category savingCategory; 
		if(category == 1){
			savingCategory = Category.TRANSPORT; 
		}
		else if(category == 2){
			savingCategory = Category.DINNER; 
		}
		else if(category == 3){
			savingCategory = Category.SERVICES; 
		}
		else if (category == 4) {
			savingCategory = Category.HEALTH;
		}
		else{
			savingCategory = Category.UNIVERSITY;
		}


		if(users[0] != null){
			Saving saving = new Saving(nameSaving, costSaving, savingCategory);
			msg = users[0].addSaving(saving);
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
		for(int i = 0; i < SIZE_USER && !isFound; i++){
			if(users[i] == null){
				pos = i; 
				isFound = true;
			}
		}
		return pos; 
	}

	/**
	 * listAllSavings list the all savings in the system, all savings of all users
	 * */
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
	
	private int searchUserByName(String name){
		int position = -1;
		boolean exit = false;
		for (int i = 0; i<SIZE_USER; i++){
			if (users[i]!=null){
				if (users[i].getName().equalsIgnoreCase(name)){
					position = i;
					exit = true;
				}
			}
		}
		return position;
	}
	public String listUserByName(String userName){
		int position = searchUserByName(userName);
		if (position == -1){
			return "There's no user with that name";
		}else{
			return "User: " + users[position].getName() + "\nId: " + users[position].getId();
		}
	}
	
	private int searchUserById(String id){
		int position = -1;
		boolean exit = false;
		for (int i = 0; i<SIZE_USER; i++){
			if (users[i]!=null){
				if (users[i].getId().equalsIgnoreCase(id)){
					position = i;
					exit = true;
				}
			}
		}
		return position;
	}
	public String listUserById(String userId){
		int position = searchUserById(userId);
		if (position == -1){
			return "There's no user with that name";
		}else{
			return "User: " + users[position].getName() + "\nId: " + users[position].getId();
		}
	}

}
