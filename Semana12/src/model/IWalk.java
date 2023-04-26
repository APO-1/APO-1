package model;

public interface IWalk {
    
	public String walk();

	public default String run(){
		return "default run";
	}

}
