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
		System.out.println(dog);

		/** Animal sapiens = new HomoSapiens("sapiens", 10, "spiens", "777"); */
		/** System.out.println("sapiens : " + sapiens); */

		Animal[] animals = new Animal[10];
		animals[0] = human1;
		animals[1] = human2;
		animals[2] = human3;
		animals[3] = sapiens;
		animals[4] = dog;

		for(int i = 0; i < animals.length; i++){
			if( animals[i] != null && animals[i] instanceof Human){
				System.out.println(i);
				System.out.println(animals[i].getName());
			}
		}

	}
}
