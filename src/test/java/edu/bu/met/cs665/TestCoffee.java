package edu.bu.met.cs665;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import edu.bu.met.cs665.example1.Coffee;

public class TestCoffee {

    @Test
    public void testGetCoffees() {
        String[] expected = {"Espresso", "Americano", "Latte Macchiato"};
        assertArrayEquals(expected, Coffee.getCoffees());
    }

    @Test
    public void testSetCoffees() {
        String[] newCoffees = {"Cappuccino", "Flat White", "Mocha"};
        Coffee.setCoffees(newCoffees);
        assertArrayEquals(newCoffees, Coffee.getCoffees());
    }
}

