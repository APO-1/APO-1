package ui; 

import java.util.Scanner; 

public class Main{

    private static Scanner reader = new Scanner(System.in);  

    public static void main(String[] args){

        int option = 0; 

        do{
           menu(); 
           option = validateIntegerInput(); 
           executeOption(option);

        }while(option != 0);


        reader.close();
    }

    public static void menu(){
        System.out.println("0. Salir"); 
        System.out.println("1. imprimir el valor"); 

    }


    public static void executeOption(int option){
        switch (option) {
            case 1:
                System.out.println("El valor de option es: " + option); 
                break;

            case 0:
                System.out.println("Exit."); 
                break; 

            case -1: 
                System.out.println("Invalit Option!!"); 
                break; 
        }
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


}
