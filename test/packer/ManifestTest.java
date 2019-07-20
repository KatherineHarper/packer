/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packer;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
/**
 *
 * @author katherineharper
 * 
 * 
 * 

 */
public class ManifestTest {
    
       // Test data
Product product = new Product("Hammer", 3, false, false);
Product product2 = new Product("Nails", 1, false, false);

//Manifest manifest = new Manifest();
 //     manifest.addProduct(new Product("Hammer", 3, false, false), 1);
  //   manifest.addProduct(new Product("Nails", 1, false, false), 12);
  //      manifest.addProduct(new Product("Ladder", 15, false, false), 2);
  //     manifest.addProduct(new Product("Saw", 5, false, false), 1);
   //    manifest.addProduct(new Product("Light Bulbs", 1, false, true), 20);
   //    manifest.addProduct(new Product("Weedkiller", 2, true, false), 1);
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    
    
    
    
  
    /**
     * Test of getTotalWeight method, of class Manifest.
     */
    
    
    
    
    @Test
    public void testGetTotalWeight() {
        System.out.println("getTotalWeight");
        Manifest instance = new Manifest();
        double expResult = 3;
        double result = instance.getTotalWeight();
        assertEquals(expResult, result, 20.0);

    }


    /**
     * Test of isEmpty method, of class Manifest.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        Manifest instance = new Manifest();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of containsProduct method, of class Manifest.
     */
    @Test
    public void testContainsProduct() {
        System.out.println("containsProduct");
        Product p = product;
        Manifest instance = new Manifest();
        boolean expResult = false;
        boolean result = instance.containsProduct(p);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of toString method, of class Manifest.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Manifest instance = new Manifest();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of hasFragileItems method, of class Manifest.
     */
    @Test
    public void testHasFragileItems() {
        System.out.println("hasFragileItems");
        Manifest instance = new Manifest();
        boolean expResult = false;
        boolean result = instance.hasFragileItems();
        assertEquals(expResult, result);
       
    }

}