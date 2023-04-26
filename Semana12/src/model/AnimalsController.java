package model; 

public class AnimalsController{

	public static final int ANIMALS_SIZE = 20; 
	private Animal[] animals; 

	public AnimalsController(){
		animals = new Animal[ANIMALS_SIZE]; 

	}

	public void initAnimals(){
		Animal human1 = new Human("Human1", 10, "HomoSapiens", "889");
		Animal human2 = new Human("Human2", 20, "HomoSapiens", "8810");
		Animal human3 = new Human("Human3", 30, "HomoSapiens", "8811");

		Animal bird1 = new Bird("Bird1", 5);
		Animal bird2 = new Bird("Bird2", 6);
		Animal bird3 = new Bird("Bird3", 7);

		Animal dog1 = new Dog("Dog1", 10, "can");
		Animal dog2 = new Dog("Dog2", 20, "can");
		Animal dog3 = new Dog("Dog3", 30, "can");

		animals[0] = human1; 
		animals[1] = human2; 
		animals[2] = human3; 
		animals[3] = bird1; 
		animals[4] = bird2; 
		animals[5] = bird3; 
		animals[6] = dog1; 
		animals[7] = dog2; 
		animals[8] = dog3; 

	}

	public void initAnimalsForLoop(){
		for(int i = 0; i < ANIMALS_SIZE; i++){
			animals[i] = (Mammal)(new Human("Human"+i, i, "HomoSapiens", "A00"+i)); 
		}
	}


	public String listAnimals(){
		String msj = ""; 
		for(int i = 0; i < ANIMALS_SIZE; i++){
			if(animals[i] != null){
				msj += animals[i] + "\n"; 
			}
		}
		return msj;
	}

}
