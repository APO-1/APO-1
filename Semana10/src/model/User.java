package model;

public class User{
	
	//Atributes
	private String name;
	private String id;
	public static final int SIZE_SAVINGS = 10;
	private Saving[] savings;
	
	public User(String name, String id){
		this.name = name;
		this.id = id;
		savings = new Saving[SIZE_SAVINGS];
	}//Method Constructor
	
	public String getName(){
		return name;
	}//Method getName
	
	public String getId(){
		return id;
	}
	
	private int getFirstValidPosition(){
		int position = -1;
		boolean isFound = false;
		
		for (int i = 0; i<SIZE_SAVINGS && !isFound; i++){
			if (savings[i]==null){
				position = i;
				isFound = true;
			}
		}
		return position;
		
	}//Method getFirstValidPosition
	
	public String addSaving(Saving saving){
		String status = "";
		int position = getFirstValidPosition();
		
		if (position != -1){
			savings[position] = saving;
			status = "The saving has been created";
		}else{
			status = "There is not any free space";
		}
		return status;
	}//Method addSavings
	
	public String showSavings(){
		String message = "";
		
		for (int i = 0; i<SIZE_SAVINGS; i++){
			if (savings[i]!=null){
				message += savings[i].getName() + " ";
			}
		}
		return message;
	}//Method showSavings
}