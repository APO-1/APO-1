package model; 

public class User{

	public static final int SIZE = 10; 

	private String name; 
	private String id; 
	private double[] savings; 

	public User(String name, String id){

		System.out.println("Hola desde el constructor de la clase User en el paquete model");
		this.name = name; 
		this.id = id; 
		savings = new double[SIZE];
	}

	public String getName(){
		return name; 
	}




}
