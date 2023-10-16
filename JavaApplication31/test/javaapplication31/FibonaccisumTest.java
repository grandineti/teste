/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package javaapplication31;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Administrator
 */
public class FibonaccisumTest {
    
    public FibonaccisumTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of calculateFibonacciSum method, of class Fibonaccisum.
     */
    @Test
    public void testCalculateFibonacciSum() {
        System.out.println("calculateFibonacciSum");
        int n = 0;
        int expResult = 0;
        int result = Fibonaccisum.calculateFibonacciSum(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
        
        
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Fibonaccisum.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Fibonaccisum.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
