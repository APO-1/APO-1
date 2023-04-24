package model;

public abstract class Mammal extends Animal{

	private String specie; 

	public Mammal(String name, int year, String specie){
		super(name, year);
		this.specie = specie;
		System.out.println("Mammal Constructor");
	}

	public String getSpecie(){
		return specie;
	}
    
	public void setSpecie(String specie){
		this.specie = specie;
	}

	public String toString(){
		return "toString de la clase Mammal " + this.specie + " "+ getYear() + " " + super.name;
	}
}
