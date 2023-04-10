package ui; 

import java.util.Scanner; 
import model.SavingsSystem;
public class Main{
	
	private SavingsSystem controller;
    private static Scanner reader;
	
	public Main(){
		this.reader = new Scanner(System.in);
		controller = new SavingsSystem();
	}//Method Constructor
	
    public static void main(String[] args){
		
		Main view = new Main();//Crear objeto view
		
        int option = 0; 
		
        do{
           view.menu(); 
           option = view.validateIntegerInput(); 
           view.executeOption(option);

        }while(option != 0);


        view.reader.close();
    }//Method main
	
	public void viewUserName(){
		System.out.println(controller.getUser().getName());
		
	}//Method viewUserName
	
	public void initUser(){
		String userName = "";
		String userId;
		
		System.out.print("Type the user's name: ");
		userName = reader.next();
		System.out.print("Type the user's id: ");
		userId = reader.next();
		
		controller.addUser(userName,userId);
	}//Method initUser
	
    public void menu(){
        System.out.println("0. Salir"); 
        System.out.println("1. Add user"); 
		System.out.println("2. Add Saving");
		System.out.println("3. List Saving");
		System.out.println("4. Search an user");
    }//Method menu
	
    public void executeOption(int option){
        switch (option) {
            case 1:
                initUser();
				System.out.println(controller);
                break;
            case 0:
                System.out.println("Exit."); 
                break; 
            case 2:
				addSaving();
				break;
			case 3:
				String message = controller.listAllSavings();
				System.out.println(message);
				break;
			case 4:
				listUserByName();
				break;
			case 5:
				listUserById();
				break;
			case -1: 
                System.out.println("Invalit Option!!"); 
                break; 
        }
    }//Method executeOption
	
	public void listUserById(){
		String id;
		String message = "";
		
		System.out.print("Type user's id: ");
		id = reader.next();
		message = controller.listUserById(id);
		System.out.println(message);
	}
	
	public void listUserByName(){
		String name;
		String message = "";
		
		System.out.print("Type user's name: ");
		name = reader.next();
		message = controller.listUserByName(name);
		System.out.println(message);
	}
	
	public void addSaving(){
		String nameSaving;
		double costSaving;
		int category;
		
		System.out.print("Type saving's name: ");
		nameSaving = reader.next();
		System.out.print("Type saving's cost: ");
		costSaving = reader.nextDouble();
		System.out.println("Type type of Saving:");
		System.out.printf("TRANSPORT (1)\nDINNER (2)\nSERVICES (3)\nHEALTH (4)\nUNIVERSITY (5)\n");
		category = reader.nextInt();
		
		String message = controller.addSaving(nameSaving,costSaving,category);
		System.out.println(message);
	}//Method addSaving
	
    public int validateIntegerInput(){
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
    }//Method validateIntegerInput


}