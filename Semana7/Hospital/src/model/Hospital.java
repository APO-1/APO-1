package model; 

public class Hospital{

	private Person person; 

	public Hospital(){}

	
	public void createPerson(String name, String phone, String email){
		person = new Person(name, phone, email); 
	}

	public Person getPerson(){
		return person;
	}

}
