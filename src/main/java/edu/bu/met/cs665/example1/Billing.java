package edu.bu.met.cs665.example1;

import java.util.Scanner;

public class Billing {
    public void createBill(){
        boolean exit = false;
        int choice;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Menu:");
            System.out.println("1)Add Coffee");
            System.out.println("2)Add Tea");
            System.out.println("3)View Order");
            System.out.println("4)Edit Order");
            System.out.println("5)Checkout");
            System.out.println("6)Exit and go back");
            System.out.println("Choice: ");
            choice = sc.nextInt();
            System.out.println(choice);
            switch (choice) {
                case 1:
                    Coffee coffee = new Coffee();
                    coffee.addCoffee();
                    break;
                case 2:break;
                case 3:break;
                case 4:break;
                case 5:break;
                case 6:exit=true;
                default:System.out.println("Invalid Choice !!!\n\n");
            }
        }while(!exit);
    }




}
