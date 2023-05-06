/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import complextesting.Calculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class CalcTest {
    Calculator calculator ;
    public CalcTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        calculator = new Calculator();
    }
    
    @After
    public void tearDown() {
    }

 @Test
 public void testSum()
 {
 int num1 = 5;
 int num2 = 10;
     assertEquals(String.valueOf(5 + 10), calculator.calculator(num1, num2, "+"));
 
 }
 
 
 @Test
 public void testMinus()
 {
 int num1 = 5;
 int num2 = 10;
     assertEquals(String.valueOf(5 - 10), calculator.calculator(num1, num2, "-"));
 
 }
 
 
 @Test
 public void testMulti()
 {
 int num1 = 5;
 int num2 = 10;
     assertEquals(String.valueOf(5 * 10), calculator.calculator(num1, num2, "*"));
 
 }
 
 
  @Test
 public void testDivide()
 {
 int num1 = 5;
 int num2 = 10;
     assertEquals(String.valueOf(5 / 10), calculator.calculator(num1, num2, "/"));
 
 }
 
 
  @Test(expected = ArithmeticException.class)
 public void testDivideByZero()
 {
 int num1 = 5;
 int num2 = 0;
     assertEquals("error", calculator.calculator(num1, num2, "/"));
 }
}
