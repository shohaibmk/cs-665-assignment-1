package edu.bu.met.cs665.example1;

import java.util.ArrayList;
import java.util.Scanner;

public class Condiments {

    static ArrayList<Integer> units = new ArrayList<Integer>();

    static ArrayList<Integer> addCondiments(){
        int milk;
        int sugar;
        int temp;
        Scanner sc = new Scanner(System.in);

        System.out.println("Number of units of Milk (0-3): ");
        temp = sc.nextInt();
        if(temp > 3 || temp < 3)
            System.out.println("Invalid number of units !!!");
        else
            units.add(temp);

        System.out.println("Number of units of Sugar (0-3): ");
        temp = sc.nextInt();
        if(temp > 3 || temp < 3)
            System.out.println("Invalid number of units !!!");
        else
            units.add(temp);
        return units;
    }
}
