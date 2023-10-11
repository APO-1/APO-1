package model; 

/**
 * Saving this class represents a saving 
 * */
public class Saving{

	private String name; 
	private double cost; 
    private Category category;

	public Saving(String name, double cost, Category category){
		this.name = name; 
		this.cost = cost; 
        this.category = category;
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