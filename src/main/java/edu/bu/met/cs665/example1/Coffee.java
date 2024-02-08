package edu.bu.met.cs665.example1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Coffee {
    private static String[] coffees = {"Espresso", "Americano", "Latte Macchiato"};


    /**
     * show menu and add the coffe to drinks list
     *
     * @return
     */
    public ArrayList<HashMap<String, int[]>> addCoffee() {
        int choice;
        ArrayList<HashMap<String, int[]>> coffeeList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n\nType of Coffee: ");
            System.out.println("1) Espresso\n2) Americano\n3) Latte Macchiato");
            System.out.print("Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                case 2:
                case 3:
                    coffeeList.add(createCoffee(choice));
                    break;
                default:
                    System.out.println("Invalid Choice !!!");
            }
        } while (choice < 1 || choice > 3);
        return coffeeList;
    }

    /**
     * create coffee and add condiments to it
     *
     * @param choice
     * @return
     */
    HashMap<String, int[]> createCoffee(int choice) {
        // Add condiments for these choices
        Condiments coffeeObject = new Condiments();
        int[] condiments = coffeeObject.addCondiments();
        HashMap<String, int[]> coffee = new HashMap<>();

        coffee.put(coffees[choice - 1], condiments); // Use choice - 1 to match coffees array index
        return coffee;
    }

    // Getter method
    public static String[] getCoffees() {
        return coffees;
    }

    // Setter method
    public static void setCoffees(String[] newCoffees) {
        coffees = newCoffees;
    }

}
