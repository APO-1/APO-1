package ui; 

import model.*; 

public class Main{

	public static void main(String[] args){
		
		Animal human1 = new Human("name1", 10, "HomoSapiens", "888");
		Mammal human2 = new Human("name2", 20, "HomoSapiens", "888");
		Human  human3 = new Human("name3", 30, "HomoSapiens", "888");

		System.out.println("Nombres ");
		
		System.out.println("***********************************");

		System.out.println( ((Mammal)human1).getSpecie() );
		System.out.println( ((Human)human2).getCC() );
		System.out.println( human3.getSpecie() );

		System.out.println("***********************************");

		System.out.println("***********************************");

		HomoSapiens sapiens = new HomoSapiens("name4", 40, "Sapiens", "7777"); 

		System.out.println( human1.communication());
		System.out.println( human2.communication());
		System.out.println( human3.communication());
		System.out.println( sapiens.communication());

		System.out.println("***********************************");
		Dog dog = new Dog("name", 10, "can");
		
		System.out.println("Say Hello"); 
		System.out.println( ((Mammal)(human1)).sayHello());
		System.out.println( human2.sayHello());
		System.out.println( human3.sayHello());
		System.out.println( sapiens.sayHello());
		System.out.println(dog.sayHello());

		System.out.println("***********************************");

		System.out.println("Interfaces");
		
		System.out.println(dog);

		Bird bird1 = new Bird("pp1", 5);
		Animal bird2 = new Bird("pp2", 5);
		IFly bird3 = new Bird("pp3", 5);
		IWalk bird4 = new Bird("pp4", 5);

		System.out.println("Communication");
		System.out.println(bird1.communication());
		System.out.println(bird2.communication());
		System.out.println(((Bird)bird3).communication());
		System.out.println(((Bird)bird4).communication());

		System.out.println("Fly");
		System.out.println(bird1.fly());
		System.out.println(((Bird)bird2).fly());
		System.out.println(bird3.fly());
		System.out.println(((Bird)bird4).communication());

		System.out.println("***********************************");
		System.out.println("IWalk");
		 
		System.out.println(human1.walk()); // Animal
		System.out.println(human2.walk()); // Mammal
		System.out.println(human3.walk()); // human
		System.out.println(sapiens.walk());//Homosapiens
		System.out.println(dog.walk()); // Dog
		System.out.println(bird1.walk()); // Bird
		System.out.println(bird2.walk()); // Aniaml
		System.out.println(((IWalk)bird3).walk()); // IFly
		System.out.println(bird4.walk()); // IWalk


		System.out.println("***********************************");

		/** Animal sapiens = new HomoSapiens("sapiens", 10, "spiens", "777"); */
		/** System.out.println("sapiens : " + sapiens); */

		Animal[] animals = new Animal[10];
		animals[0] = human1;
		animals[1] = human2;
		animals[2] = human3;
		animals[3] = sapiens;
		animals[4] = dog;
		animals[5] = bird1;
		animals[6] = bird2;
		animals[7] = (Bird)bird3;
		animals[8] = (Bird)bird4;

		for(int i = 0; i < animals.length; i++){
			if( animals[i] != null && animals[i] instanceof IFly){
				System.out.println(i);
				System.out.println(animals[i].getName());
			}
		}

	}
}
