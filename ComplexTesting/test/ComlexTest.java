/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import complextesting.Complex;
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
public class ComlexTest {
    Complex complex;
    int real;
    int imag;
    public ComlexTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
       complex = new Complex();
      
    }
    
    @After
    public void tearDown() {
    }
    
    
    
    
      @Test 
    public  void testIfTheImaginaryIsLessThanZero()
    {
    
      
        imag = -5;
        real = 10;
        complex.setImag(imag);
        complex.setReal(real);
       assertEquals(real + " - " + Math.abs(imag) + "i", complex.print());
    }
    
    
       @Test 
    public  void testIfTheRealIsLessThanZero()
    {
    
      
        imag = 10;
        real = -10;
        complex.setImag(imag);
        complex.setReal(real);
       assertEquals(real + " + " + Math.abs(imag) + "i", complex.print());
    }
    
    
       @Test 
    public  void testIfTheBothIsLessThanZero()
    {
    
      
        imag = -5;
        real = -10;
        complex.setImag(imag);
        complex.setReal(real);
       assertEquals(real + " - " + Math.abs(imag) + "i", complex.print());
    }
    
    
    
       @Test 
    public  void testIfTheImaginaryIsEqualZero()
    {
    
      
        imag = 0;
        real = 10;
        complex.setImag(imag);
        complex.setReal(real);
        assertNotEquals(real + Math.abs(imag), complex.print());
    }
    
    
    @Test 
    public  void testIfTheRealIsEqualZero()
    {
    
      
        imag = -5;
        real = 0;
        complex.setImag(imag);
        complex.setReal(real);
       assertNotEquals("0", complex.print());
    }
    
    
       @Test 
    public  void testIfBothIsZero()
    {
    
      
        imag = 0;
        real = 0;
        complex.setImag(imag);
        complex.setReal(real);
       assertNotEquals("0", complex.print());
    }
    
    
       @Test 
    public  void testSumAllPositive()
    {
    
      
      
        Complex complex1 = new Complex(5,10);
        Complex complex2 = new Complex(10,10);
   Complex result =  Complex.sum(complex1, complex2);
       assertEquals(complex1.getReal() + complex2.getReal(), result.getReal());
       assertEquals(complex1.getImag()+ complex2.getImag(), result.getImag());
    }
    
    
       @Test 
    public  void testSumOneRealNegative()
    {
    
      
      
        Complex complex1 = new Complex(-5,10);
        Complex complex2 = new Complex(10,10);
         Complex result =  Complex.sum(complex1, complex2);
       assertEquals(complex1.getReal() + complex2.getReal(), result.getReal());
       assertEquals(complex1.getImag()+ complex2.getImag(), result.getImag());
    }
    
    
       @Test 
    public  void testSumTwoRealsPositive()
    {
    
      
      
        Complex complex1 = new Complex(-5,10);
        Complex complex2 = new Complex(-10,10);
   Complex result =  Complex.sum(complex1, complex2);
       assertEquals(complex1.getReal() + complex2.getReal(), result.getReal());
       assertEquals(complex1.getImag()+ complex2.getImag(), result.getImag());
    }
    
    
       @Test 
    public  void testSumTwoRealNegativeAndOneImagPositive()
    {
    
      
      
        Complex complex1 = new Complex(-5,-10);
        Complex complex2 = new Complex(-10,10);
   Complex result =  Complex.sum(complex1, complex2);
       assertEquals(complex1.getReal() + complex2.getReal(), result.getReal());
       assertEquals(complex1.getImag()+ complex2.getImag(), result.getImag());
    }
    
    
       @Test 
    public  void testSumOneImageNegative()
    {
    
      
      
        Complex complex1 = new Complex(5,-10);
        Complex complex2 = new Complex(10,10);
   Complex result =  Complex.sum(complex1, complex2);
       assertEquals(complex1.getReal() + complex2.getReal(), result.getReal());
       assertEquals(complex1.getImag()+ complex2.getImag(), result.getImag());
    }
    
    
       @Test 
    public  void testSumTwoTwoImagNegative()
    {
    
      
      
        Complex complex1 = new Complex(5,-10);
        Complex complex2 = new Complex(10,-10);
   Complex result =  Complex.sum(complex1, complex2);
       assertEquals(complex1.getReal() + complex2.getReal(), result.getReal());
       assertEquals(complex1.getImag()+ complex2.getImag(), result.getImag());
    }
    
   
    
    
    
    
    
       @Test 
    public  void testSumAllNegative()
    {
    
      
      
        Complex complex1 = new Complex(-5,-10);
        Complex complex2 = new Complex(-10,-10);
   Complex result =  Complex.sum(complex1, complex2);
       assertEquals(complex1.getReal() + complex2.getReal(), result.getReal());
       assertEquals(complex1.getImag()+ complex2.getImag(), result.getImag());
    }
    
    
           @Test 
    public  void testSubAllPositive()
    {
    
      
      
        Complex complex1 = new Complex(5,10);
        Complex complex2 = new Complex(10,10);
   Complex result =  Complex.sub(complex1, complex2);
       assertEquals(complex1.getReal() - complex2.getReal(), result.getReal());
       assertEquals(complex1.getImag()- complex2.getImag(), result.getImag());
    }
    
    
       @Test 
    public  void testSubOneRealNegative()
    {
    
      
      
        Complex complex1 = new Complex(-5,10);
        Complex complex2 = new Complex(10,10);
         Complex result =  Complex.sub(complex1, complex2);
       assertEquals(complex1.getReal() - complex2.getReal(), result.getReal());
       assertEquals(complex1.getImag()- complex2.getImag(), result.getImag());
    }
    
    
       @Test 
    public  void testSubTwoRealsPositive()
    {
    
      
      
        Complex complex1 = new Complex(-5,10);
        Complex complex2 = new Complex(-10,10);
   Complex result =  Complex.sub(complex1, complex2);
       assertEquals(complex1.getReal() - complex2.getReal(), result.getReal());
       assertEquals(complex1.getImag()- complex2.getImag(), result.getImag());
    }
    
    
       @Test 
    public  void testSubTwoRealNegativeAndOneImagPositive()
    {
    
      
      
        Complex complex1 = new Complex(-5,-10);
        Complex complex2 = new Complex(-10,10);
   Complex result =  Complex.sub(complex1, complex2);
       assertEquals(complex1.getReal() - complex2.getReal(), result.getReal());
       assertEquals(complex1.getImag()- complex2.getImag(), result.getImag());
    }
    
    
       @Test 
    public  void testSubOneImageNegative()
    {
    
      
      
        Complex complex1 = new Complex(5,-10);
        Complex complex2 = new Complex(10,10);
   Complex result =  Complex.sub(complex1, complex2);
       assertEquals(complex1.getReal() - complex2.getReal(), result.getReal());
       assertEquals(complex1.getImag()- complex2.getImag(), result.getImag());
    }
    
    
    @Test 
    public  void testSubTwoTwoImagNegative()
    {
    
      
      
        Complex complex1 = new Complex(5,-10);
        Complex complex2 = new Complex(10,-10);
        Complex result =  Complex.sub(complex1, complex2);
       assertEquals(complex1.getReal() - complex2.getReal(), result.getReal());
       assertEquals(complex1.getImag()- complex2.getImag(), result.getImag());
    }
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    
    
}
