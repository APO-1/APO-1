package model;

public class Bird extends Animal implements IFly {

	public Bird(String name, int year){
		super(name, year); 
	}
    
	@Override 
	public String communication(){
		return "pio pio"; 
	}

	@Override
	public String fly(){
		return "fly as a bird (vuela vuela)";
	}

	@Override
	public String walk(){
		return "Walk as a bird";
	} 

}
