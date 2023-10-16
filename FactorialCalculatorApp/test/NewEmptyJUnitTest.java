/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import factorialcalculatorapp.FactorialCalculatorApp;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
   
    @Test
    public void testFatorial() {
        
        FactorialCalculatorApp instance = new FactorialCalculatorApp ();
        
         assertEquals(120, FactorialCalculatorApp.calculateFactorial(5)); 
       
    }
    
    
    
    
}
