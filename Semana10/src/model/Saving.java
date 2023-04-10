package model;

public class Saving{
	
	private String name;
	private double cost;
	private Category category;
	
	public Saving(String name, double cost, Category category){
		this.name = name;
		this.cost = cost;
		this.category = category;
	}//Method Constructor
	
	public String getName(){
		return name;
	}//Method getName
	
	public double getCost(){
		return cost;
	}//Method getCost
	
	public void setName(String name){
		this.name = name;
	}//Method setName
	
	public void setCost(double cost){
		this.cost = cost;
	}//Method setCost
}