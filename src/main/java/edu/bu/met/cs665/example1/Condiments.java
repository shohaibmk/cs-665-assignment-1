package edu.bu.met.cs665.example1;

import java.util.Scanner;

public class Condiments {

    private int[] units = new int[2];

    public int[] addCondiments() {
        int temp;
        boolean invalid = true;
        Scanner scanner = new Scanner(System.in);

        while (invalid) {
            System.out.print("Number of units of Milk (0-3): ");
            temp = scanner.nextInt();
            if (temp > 3 || temp < 0) {
                System.out.println("Invalid number of units !!!");
            } else {
                units[0] = temp;
                invalid = false;
            }
        }

        invalid = true;
        while (invalid) {
            System.out.print("Number of units of Sugar (0-3): ");
            temp = scanner.nextInt();
            if (temp > 3 || temp < 0) {
                System.out.println("Invalid number of units !!!");
            } else {
                units[1] = temp;
                invalid = false;
            }
        }

        return units;
    }

    public int getMilkUnits() {
        return units[0];
    }

    public int getSugarUnits() {
        return units[1];
    }

    public void setUnits(int[] units){
        this.units[0] = units[0];
        this.units[1] = units[1];
    }
}

