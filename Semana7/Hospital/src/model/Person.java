package model; 

public class Person{

	// atributos de la clase
	private String name; 
	private String phone; 
	private String email; 

	// constructor 
	public Person(String aname, String aphone, String aemail){
		System.out.println("constructor de la clase Person");
		name = aname; 
		phone = aphone; 
		email = aemail; 

	}

	// consulta 
	public String getName(){
		return name; 
	}

	public String getPhone(){
		return phone; 
	}

	public String getEmail(){
		return email; 
	}

	// modificación 
	public void setName(String aname){
		name = aname; 
	}

	public void setPhone(String aphone){
		phone = aphone; 
	}

	public void setEmail(String aemail){
		email = aemail; 
	}

	public String sayHello(){
		return "Hello, I am: "+ name; 
	}

}
