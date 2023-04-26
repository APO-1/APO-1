package model; 

public class AnimalsController{

	public static final int ANIMALS_SIZE = 20; 
	private Animal[] animals; 

	public AnimalsController(){
		animals = new Animal[ANIMALS_SIZE]; 
	}

	public void initAnimals(){
		Animal human1 = new Human("name1", 10, "HomoSapiens", "888");
		Animal human2 = new Human("name2", 20, "HomoSapiens", "888");
		Animal human3 = new Human("name3", 30, "HomoSapiens", "888");
	}

}
