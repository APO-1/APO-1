package model; 

public abstract class Animal implements IWalk{
	
	protected String name;
	private int year; 

	public Animal(String name, int year){
		this.name = name; 
		this.year = year; 
		System.out.println("Constructor de la clase Aniimal");
	}

	public int getYear(){
		return year; 
	}

	public void setName(String name){
		this.name = name; 
	}

	public String getName(){
		return name;
	}

	/**
	 * definimos un comportamiento de comunicación para todos los animales
	 * */
	public abstract String communication();

	public String toString(){
		return "toString Animal class";
	}

	@Override
	public String walk(){
		return "Walk as Animal ...";
	}

}
