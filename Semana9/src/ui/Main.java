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

    }


    public void executeOption(int option){
        switch (option) {
            case 1:
                initUser(); 
                break;

            case 2:
                addSaving();
                break;

            case 0:
                System.out.println("Exit."); 
                break; 

            case -1: 
                System.out.println("Invalit Option!!"); 
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
        controller.initUser(userName, userId); 
        viewUserName();

    }

    public void addSaving(){
        double saving; 
        System.out.println("type saving");
        saving = reader.nextDouble();
        String msg = controller.addSaving(saving);
        System.out.println(msg);
    }

}
