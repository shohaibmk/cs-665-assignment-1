package edu.bu.met.cs665.example1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Tea {

    static String[] teas = {"Black Tea", "Green Tea", "Yellow Tea"};

    /**
     * Add tea to our drinks list
     *
     * @return
     */
    public ArrayList<HashMap<String, int[]>> addTea() {
        int choice;
        ArrayList<HashMap<String, int[]>> teaList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n\nType of Tea: ");
            System.out.println("\n1)Black Tea\n2)Green Tea\n3)Yellow Tea");
            System.out.print("Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                case 2:
                case 3:
                    teaList.add(createTea(choice));
                    break;
                default:
                    System.out.println("Invalid Choice !!!");
            }
        } while (choice < 1 || choice > 3);

        return teaList;
    }

    /**
     * create tea, add condiments to it
     *
     * @param choice
     * @return
     */
    HashMap<String, int[]> createTea(int choice) {
        // Add condiments for these choices
        Condiments teaObject = new Condiments();
        int[] condiments = teaObject.addCondiments();
        HashMap<String, int[]> tea = new HashMap<>();
        tea.put(teas[choice - 1], condiments); // Use choice - 1 to match coffees array index
        return tea;
    }
}
