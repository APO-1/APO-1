package model; 

public class Dog extends Mammal{

	public Dog(String name, int year, String specie){
		super(name, year, specie);
	}

	@Override
	public String communication(){
		return "woof";
	}
}
