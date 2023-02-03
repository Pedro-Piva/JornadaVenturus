/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Atividade1;

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
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    

    /**
     * Test of somar method, of class Calculadora.
     */
    @org.junit.jupiter.api.Test
    public void testSomar() {
        System.out.println("somar");
        int i1 = 0;
        int i2 = 0;
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.somar(i1, i2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subtrair method, of class Calculadora.
     */
    @org.junit.jupiter.api.Test
    public void testSubtrair() {
        System.out.println("subtrair");
        int i1 = 0;
        int i2 = 0;
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.subtrair(i1, i2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicar method, of class Calculadora.
     */
    @org.junit.jupiter.api.Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        int i1 = 0;
        int i2 = 0;
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.multiplicar(i1, i2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dividir method, of class Calculadora.
     */
    @org.junit.jupiter.api.Test
    public void testDividir() {
        System.out.println("dividir");
        int i1 = 0;
        int i2 = 0;
        Calculadora instance = new Calculadora();
        float expResult = 0.0F;
        float result = instance.dividir(i1, i2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
