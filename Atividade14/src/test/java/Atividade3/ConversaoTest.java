/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Atividade3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author pedro
 */
public class ConversaoTest {
    
    public ConversaoTest() {
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
     * Test of celsiusFahrenheit method, of class Conversao.
     */
    @Test
    public void testCelsiusFahrenheit() {
        System.out.println("celsiusFahrenheit");
        double temp = 0.0;
        Conversao instance = new Conversao();
        double expResult = 32.0;
        double result = instance.celsiusFahrenheit(temp);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Fahrenheitcelsius method, of class Conversao.
     */
    @Test
    public void testFahrenheitcelsius() {
        System.out.println("Fahrenheitcelsius");
        double temp = 0.0;
        Conversao instance = new Conversao();
        double expResult = -17.77;
        double result = instance.Fahrenheitcelsius(temp);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
