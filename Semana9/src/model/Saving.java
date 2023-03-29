package model; 

/**
 * Saving this class represents a saving 
 * */
public class Saving{

	private String name; 
	private double cost; 

	public Saving(String name, double cost){
		this.name = name; 
		this.cost = cost; 
	}

	public String getName(){
		return name; 
	}

	public double getCost(){
		return cost; 
	}

	public void setName(String name){
		this.name = name;
	}

	public void setCost(double cost){
		this.cost = cost;
	}


}
