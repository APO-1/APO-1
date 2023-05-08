package ui; 

import model.Person; 

public class Main {

	public static void main(String[] args){


		Person p1 = new Person("constructor", 30); 

		Person p2 = new Person(); 

		Person p3 = new Person("only name"); 

		System.out.println(p1); 
		System.out.println(p2); 


		p2.setName("setName in p2"); 
		System.out.println(p2); 


		p3.setAge(1); 
		System.out.println(p3);

	}

}
