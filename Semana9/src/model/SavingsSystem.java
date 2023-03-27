package model; 

public class SavingsSystem{

	//  declaración 
	private User usuario; 

	public SavingsSystem(){ 
		// constructor vacio 
	}

	public void initUser(String userName, String userId){
		// inicializando
		this.usuario = new User(userName, userId); 
	}

	public String addSaving(double saving){
		String msg = "NO hay un usuario registrado";

		if(usuario != null){
			msg = usuario.addSaving(saving);
		}
		return msg;
	}

	public User getUser(){
		return usuario;
	}
	
}
