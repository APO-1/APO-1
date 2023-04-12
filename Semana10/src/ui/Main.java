package ui; 

import java.util.Scanner; 
import model.SavingsSystem;

public class Main{

    private SavingsSystem controller;
    private Scanner reader;  

    // constructor de la clase 
    public Main(){
        this.reader = new Scanner(System.in); 
        controller = new SavingsSystem();
    }

    public static void main(String[] args){
        Main view = new Main(); // la llamada al constructor de la clase 

        int option = 0; 

        do{
            view.menu(); 
            option = view.validateIntegerInput(); 
            view.executeOption(option);

        }while(option != 0);


        view.reader.close();
    }

    public void menu(){
        System.out.println("0. Salir"); 
        System.out.println("1. Add User"); 
        System.out.println("2. Add Saving"); 
        System.out.println("3. List savings"); 

    }


    public void executeOption(int option){
        switch (option) {
            case 1:
                initUser(); 
                System.out.println(controller);
                break;

            case 2:
                addSaving();
                break;

            case 3: 
                String msj = controller.listAllSavings();
                System.out.println(msj);
                break;

            case 0:
                System.out.println("Exit."); 
                break; 

            case -1: 
                System.out.println("Invalid Option!!"); 
                break; 
        }
    }

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
    }

    public void viewUserName(){
        System.out.println(controller.getUser().getName());
    }

    public void initUser(){
        String userName = ""; 
        String userId = ""; 

        System.out.println("Type your name"); 
        userName = reader.next(); 
        System.out.println("Type your id"); 
        userId = reader.next(); 

        // llamada a una operación de control 
        controller.addUser(userName, userId); 
        viewUserName();

    }

    public void addSaving(){

        
        double costSaving; 
        String nameSaving; 
        int category;
        System.out.println("Enter user id");
        String id = reader.next();
        

        System.out.println("type cost saving");
        costSaving = reader.nextDouble();

        System.out.println("type name saving");
        nameSaving = reader.next();

        System.out.println("Type type of Saving:"); 
        System.out.println(" 1. for TRANSPORT");
        System.out.println(" 2. for ");
        System.out.println(" 3. for ");
        System.out.println(" 4. for ");
        System.out.println(" 5. for ");

        category = reader.nextInt();

        // Esto es una dependencia de objetos --> esto no debería hacerse 
        /** Saving saving = new Saving(nameSaving, costSaving); */

        String msg = controller.addSaving(nameSaving, costSaving, category, id);
        System.out.println(msg);
    }

}
