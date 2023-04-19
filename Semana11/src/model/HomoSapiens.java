package model; 

public class HomoSapiens extends Human{

	public HomoSapiens(String name, int year, String specie, String cc){
		super(name, year, specie, cc);
	}

	public String sayHallo(){
		return "Hola desde la clase sapiens";
	}

	@Override
	public String communication(){
		return "Hola soy un sapiens";
	}
}
