package edu.bu.met.cs665.example1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Coffee {
    String[] coffees = {"Espresso","Americano","Latte Macchiato"};


    public void addCoffee(){

        boolean exit = false;
        int choice;

        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Type of Coffee: ");
            System.out.println("1)Espresso\n2)Americano\n3)Latte Macchiato\n4)Go Back");
            System.out.println("Choice: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:break;
                case 2:break;
                case 3:break;
                case 4: exit = true;
                default:
                    System.out.println("Invalid Choice !!!");
            }
            if(choice >= 1 && choice<=3){                                           //add condiments
                Condiments coffeeObject = new Condiments();
                ArrayList<Integer> condiments = coffeeObject.addCondiments();
                HashMap<String,ArrayList<Integer>>  coffee = new HashMap<>();
                coffee.put(coffees[choice])
                coffees[1]
            }

        }while (!exit);

    }
}
