package edu.bu.met.cs665;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;


import edu.bu.met.cs665.example1.Condiments;

public class TestCondiments {

    private Condiments condiments;

    @BeforeEach
    public void setUp() {
        condiments = new Condiments();
    }

    @Test
    public void testAddCondimentsValidInput() {
        String input = "2\n1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);

        int[] result = condiments.addCondiments();
        assertEquals(2, result[0]);
        assertEquals(1, result[1]);
    }

    @Test
    public void testGetMilkUnits() {
        int[] units = {2, 1};
        condiments.setUnits(units);
        assertEquals(2, condiments.getMilkUnits());
    }

    @Test
    public void testGetSugarUnits() {
        int[] units = {2, 1};
        condiments.setUnits(units);
        assertEquals(1, condiments.getSugarUnits());
    }
}
