/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packer;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
/**
 *
 * @author katherineharper
 */
public class BoxTest {
     // Test data

        Address depotAddress = new Address("23 Good Luck St", "Blue View", "Sandy Shores", "H337", new Coordinates(138, 995));
        Depot depot = new Depot("Main Depot", depotAddress);
     

   
        Address testAddress2 = new Address("88 Camp Mine St", "Ridgeway", "Lowe Valley", "I998", new Coordinates(100, 34));
        Customer customer = new Customer("Andy Bravo", testAddress2);
   
      
     Product a1 = new Product("Alpha", 3, true, true);
    Product a2 = new Product("Alpha", 2, true, true);
    Product a3 = new Product("Alpha", 3, false, true);
    Product a4 = new Product("Alpha", 4, true, false);
    
        Manifest manifest = new Manifest();
     
 
    Box box1 = new Box(customer, depot);
 
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
     * Test of addProduct method, of class Box.
     */
    @Test
    public void testAddProduct_Product() {
        System.out.println("addProduct");
        Product product = a1;
        Box instance = box1;
        instance.addProduct(product);
       
    }



    /**
     * Test of getLabel method, of class Box.
     */
    @Test
    public void testGetLabel() {
        System.out.println("getLabel");
        Box instance = box1;
        String expResult = "Andy Bravo"+ "\n" + "88 Camp Mine St"+ "\n" + "Ridgeway"+ "\n" + "Lowe Valley"+ "\n" +"I998"+"\n"+"\n" +"";
        String result = instance.getLabel();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of toString method, of class Box.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Box instance = box1;
        String expResult = "Andy Bravo"+ "\n" + "88 Camp Mine St"+ "\n" + "Ridgeway"+ "\n" + "Lowe Valley"+ "\n" +"I998"+"\n"+"\n" +"";
        String result = instance.toString();
        assertEquals(expResult, result);
 
    }

 

    /**
     * Test of canFit method, of class Box.
     */
    @Test
    public void testCanFit_Product() {
        System.out.println("canFit");
        Product p = a1;
        Box instance = box1;
        boolean expResult = false;
        boolean result = instance.canFit(p);
        assertEquals(expResult, result);
     
    }




    /**
     * Test of isFragile method, of class Box.
     */
    @Test
    public void testIsFragile() {
        System.out.println("isFragile");
        Box instance = box1;
        boolean expResult = false;
        boolean result = instance.isFragile();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of isHazardous method, of class Box.
     */
    @Test
    public void testIsHazardous() {
        System.out.println("isHazardous");
        Box instance = box1;
        boolean expResult = false;
        boolean result = instance.isHazardous();
        assertEquals(expResult, result);
   
    }


    
}