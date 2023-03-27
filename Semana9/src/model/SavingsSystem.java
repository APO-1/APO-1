package model; 

public class SavingsSystem{

	//  declaración 
	private User usuario; 

	public SavingsSystem(){ 
		// constructor vacio 
		System.out.println("Hola desde el constructor de la clase SavingsSystem en el paquete model");
	}

	public void initUser(String userName, String userId){
		// inicializando
		this.usuario = new User(userName, userId); 
	}

	public User getUser(){
		return usuario;
	}
	
}
