package ui; 

import model.*; 

public class Main{

	public static void main(String[] args){
		
		Animal human = new Human("name", 10, "HomoSapiens", "888");
		System.out.println( ( (Human)(human) ).getCC() );

		Dog dog = new Dog("name", 10, "can");
		System.out.println(dog);

		Animal[] animals = new Animal[10];
		animals[0] = human; 
		animals[1] = dog; 

	}
}
