package model; 

public class AnimalsController{

	public static final int ANIMALS_SIZE = 20; 
	private Animal[] animals; 

	public AnimalsController(){
		animals = new Animal[ANIMALS_SIZE]; 

	}

	public void createAnimal(String name, int year, String specie, String cc, int type){

		Animal animal = null; 

		switch (type) {
			case 1:
				animal = new Human(name, year, specie, cc);	
				break;
			case 2:
				animal =  new Dog(name, year, specie); 
				break;
			case 3: 
				animal = new Bird(name, year);
				break;
		}

		animals[0] = animal;

	}

	public void createAnimal(String name, int year, String specie, String cc){
		Animal human = new Human(name, year, specie, cc); 
		animals[0] = human; 
	}

	public void createAnimal(String name, int  year, String specie){
		Animal dog = new Dog(name, year, specie); 
		animals[0] = dog; 
	}

	public void createAnimal(String name, int year){
		Animal bird = new Bird(name, year); 
		animals[0] = bird;
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

	public String listHumans(){
		String msj = ""; 
		for(int i = 0; i < ANIMALS_SIZE; i++){
			if(animals[i] != null && (animals[i] instanceof Human) ){
				msj += animals[i] + "\n"; 
			}
		}
		return msj;
	}

}
