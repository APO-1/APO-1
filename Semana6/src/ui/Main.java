package ui; 

import java.util.Scanner; 

public class Main{

	// Constante que modela el tamanio de los arreglos
	public static final int SIZE = 10; 

	// Lector de la información que ingresa el usuario 
	private static Scanner reader = new Scanner(System.in);  

	// EStructuras para almacenar la información
	private static String[] names = new String[SIZE]; 
	private static double[] prices = new double[SIZE]; 
	private static int[] units = new int[SIZE]; 

	public static void main(String[] args){

		int option = 0; 

		initStore();

		do{
			menu(); 
			option = validateIntegerInput(); 
			executeOption(option);

		}while(option != 0);


		reader.close();
	}

	// función de vista
	public static void menu(){
		System.out.println("0. Salir"); 
		System.out.println("1. Agregar producto."); 
		System.out.println("2. Eliminar producto."); 
		System.out.println("3. Buscar producto."); 

	}


	public static void executeOption(int option){
		switch (option) {
			case 1:
				// add product 
				addItem();

				break;

			case 2:
				System.out.println("ingrese el nombre del producto.");
				String name;
				name = reader.next();
				String msj = deleteProduct(name);
				System.out.println(msj);
				break; 

			case 0:
				System.out.println("Exit."); 
				break; 


			case -1: 
				System.out.println("Invalit Option!!"); 
				break; 

			default: 
				System.out.println("Invalit Option!!"); 
				break;
				
		}
	}

	// función de control
	public static void initStore(){
		// recorrido total, de un arreglo
		for(int i = 0; i < SIZE; i++){
			names[i] = ""; 
		}
	}

	// posCond: -1 -> si no encuentra una posición valida, 
	// de lo contrario, retorna la posición 
	public static int getFirtsValidPosition(){
		// Recorrido parcial del arreglo
		boolean isFound = false; // flag 
		int pos = -1;
		for(int i = 0; i < SIZE && !isFound; i++){
			if(names[i].equals("")){
				isFound = true; 
				pos = i; 
			}
		}
		return pos; 
	}

	/**
	 * Search the product by name
	 * @param nameProduct : String the name of product to search 
	 * @return int pos = -1 if the product does not found 
	 */
	public static int searchProduct(String nameProduct){
		// Recorrido parcial del arreglo
		boolean isFound = false; // flag 
		int pos = -1;
		for(int i = 0; i < SIZE && !isFound; i++){
			if(names[i].equals(nameProduct)){
				isFound = true; 
				pos = i; 
			}
		}
		return pos;
	}

	public static String deleteProduct(String nameProduct){
		String msj = "El producto no a sido encontrado.";
		int pos = searchProduct(nameProduct); 
		if(pos != -1){
			names[pos] = "";
			units[pos] = -1; 
			prices[pos] = -1; 
			msj = "El producto a sido eliminado"; 

		}
		return msj;
	}

	// return true si se agrego o false si no. 
	public static boolean addProduct(String name, double price, int unit){
		boolean isAdded = false; 
		int pos = getFirtsValidPosition(); 
		if(pos != -1){
			names[pos] = name;
			prices[pos] = price; 
			units[pos] = unit; 
			isAdded = true; 
		}
		
		return isAdded;
	}

	public static int validateIntegerInput(){
		int option = 0; 
		if(reader.hasNextInt()){
			option = reader.nextInt(); 
		}
		else{
			reader.nextLine();// limpiar el scanner 
			option = -1; 
			System.out.println("Ingrese un valor entero."); 
		}
		return option; 
	}

	// función de vista
	public static void addItem(){
		String name; 
		double price; 
		int unit; 

		System.out.println("Type name of pruduct: "); 

		name = reader.next();
		
		System.out.println(name);
		System.out.println("Type price: "); 
		price = reader.nextDouble(); 
		System.out.println("Type units: "); 
		unit = reader.nextInt(); 

		boolean isAdded = addProduct(name, price, unit); 
		if(isAdded){
			System.out.println("Product added"); 
		}
		else{
			System.out.println("The store is full"); 
		}

	}

}
