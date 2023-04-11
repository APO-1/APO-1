package ui;

import java.util.Scanner;
import model.SavingsSystem;

public class Main {

    private SavingsSystem controller;
    private Scanner reader;

    // constructor de la clase
    public Main() {
        this.reader = new Scanner(System.in);
        controller = new SavingsSystem();
    }

    public static void main(String[] args) {
        Main view = new Main(); // la llamada al constructor de la clase

        int option = 0;

        do {
            view.menu();
            option = view.validateIntegerInput();
            view.executeOption(option);

        } while (option != 0);

        view.reader.close();
    }

    public void menu() {
        System.out.println("\n-----WELCOME----\n");
        System.out.println("1. Add User");
        System.out.println("2. Add Saving");
        System.out.println("3. List savings");
        System.out.println("\n0. Salir");

    }

    public void executeOption(int option) {
        switch (option) {
            case 1:
                initUser();
                break;

            case 2:
                addSaving();
                break;

            case 3:
                String msj = controller.listAllSavings();
                if (msj.equalsIgnoreCase("")) {
                    System.out.println("There are not savings registered");
                } else {
                    System.out.println(msj);
                }
                break;

            case 0:
                System.out.println("Exit.");
                break;

            case -1:
                System.out.println("Invalid Option!!");
                break;
        }
    }

    public int validateIntegerInput() {
        int option = 0;
        if (reader.hasNextInt()) {
            option = reader.nextInt();
        } else {
            reader.nextLine();// limpiar el scanner
            option = -1;
            System.out.println("Ingrese un valor entero.");
        }
        return option;
    }

    public void viewUserName() {
        System.out.println("El usuario: " + controller.getUser(controller.getFirstValidPosition() - 1).getName()
                + " fue creado correctamente");
    }

    public void initUser() {
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

    public void addSaving() {
        double costSaving;
        String nameSaving;
        int category;
        String userID;
        String otherTextExplanation = null;

        System.out.println("Please insert the User's ID you want to add a saving to. ");
        reader.nextLine();
        userID = reader.nextLine();

        System.out.println("How much are you saving?");
        costSaving = reader.nextDouble();

        System.out.println("Saving's name: ");
        reader.nextLine();
        nameSaving = reader.nextLine();

        System.out.println("Type type of Saving:");
        System.out.println(" 1. for TRANSPORT");
        System.out.println(" 2. for DINNER");
        System.out.println(" 3. for SERVICES");
        System.out.println(" 4. for HEALTH");
        System.out.println(" 5. for UNIVERSITY");
        System.out.println(" 6. for OTHER");

        category = reader.nextInt();

        if (category == 6) {
            reader.nextLine();
            System.out.println("What type is your saving?");
            otherTextExplanation = reader.nextLine();
        }

        // Esto es una dependencia de objetos --> esto no debería hacerse
        /** Saving saving = new Saving(nameSaving, costSaving); */

        String msg = controller.addSaving(nameSaving, costSaving, category, userID, otherTextExplanation);
        System.out.println(msg);
    }

}
