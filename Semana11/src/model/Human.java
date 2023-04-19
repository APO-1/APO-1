package model;

public class Human extends Mammal {

	private String cc; 

	public Human(String name, int year, String specie, String cc){
		super(name, year, specie); 
		this.cc = cc; 
		System.out.println("Human Constructor");
	}

	public String getCC(){
		return cc; 
	}
    
	public void setCC(String cc){
		this.cc = cc; 
	}

	@Override
	public String communication(){
		return "I'am a human ...";
	}

	public String toString(){
		return "toString Human class";
	}


}
