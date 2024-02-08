package edu.bu.met.cs665.example1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Billing {
    public void createBill() {
        boolean exit = false;
        int choice;
        ArrayList<ArrayList> drinksList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n\nMenu:");
            System.out.println("1)Add Coffee");
            System.out.println("2)Add Tea");
            System.out.println("3)View Order");
            System.out.println("4)Remove Drinks");
            System.out.println("5)Brew");
            System.out.println("6)Exit");
            System.out.println("Choice: ");
            choice = sc.nextInt();
            System.out.println(choice);
            switch (choice) {
                case 1:
                    Coffee coffee = new Coffee();

                    drinksList.add(coffee.addCoffee());
                    break;
                case 2:
                    Tea tea = new Tea();
                    drinksList.add(tea.addTea());
                    break;
                case 3:
                    viewDrinks(drinksList);
                    break;
                case 4:
                    drinksList = removeDrink(drinksList);
                    break;
                case 5:
                    brew();
                    break;
                case 6:
                    exit = true;
                default:
                    System.out.println("Invalid Choice !!!\n\n");
            }
        } while (!exit);
    }

    /**
     * method to brew the drink
     *
     * @return Boolean
     */
    boolean brew() {

        try {
            //Code to brew coffee
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * View drinks list
     *
     * @param drinksList
     * @return Boolean
     */
    Boolean viewDrinks(ArrayList<ArrayList> drinksList) {
        try {

            System.out.println("Drinks:-");
            int itemNumber = 1;
            for (ArrayList drink : drinksList) {
                System.out.print(itemNumber + ")");
                if (drink.get(0) instanceof HashMap) {                             //Hashmap
                    String coffeeName = ((HashMap<?, ?>) drink.get(0)).keySet().toArray()[0].toString();

                    int[] condiments = (int[]) ((HashMap<?, ?>) drink.get(0)).get(coffeeName);
                    System.out.println(coffeeName + " [milk: " + condiments[0] + ", sugar: " + condiments[1] + "]");

                }
                itemNumber++;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * Remove drinks from the drinks list
     *
     * @param drinksList
     * @return Arraylist
     */
    ArrayList removeDrink(ArrayList<ArrayList> drinksList) {
        Scanner sc = new Scanner(System.in);
        try {
            int choice;
            int itemNumber = 1;
            for (ArrayList drink : drinksList) {
                System.out.print(itemNumber + ")");
                if (drink.get(0) instanceof HashMap) {                             //Hashmap
                    String coffeeName = ((HashMap<?, ?>) drink.get(0)).keySet().toArray()[0].toString();

                    int[] condiments = (int[]) ((HashMap<?, ?>) drink.get(0)).get(coffeeName);
                    System.out.println(coffeeName + " [milk: " + condiments[0] + ", sugar: " + condiments[1] + "]");

                }
                itemNumber++;
            }
            System.out.print("Choice: ");
            choice = sc.nextInt();
            drinksList.remove(choice - 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return drinksList;
    }


}
