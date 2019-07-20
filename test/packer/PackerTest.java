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
public class PackerTest {
 Address customerAddress1 = new Address("67 Torch Rd", "Treeline", "Mt High", "T799", new Coordinates(1102, 87));
        Address customerAddress2 = new Address("88 Camp Mine St", "Ridgeway", "Lowe Valley", "I998", new Coordinates(100, 34));
        Customer customer = new Customer("Andy Bravo", customerAddress1);
        
         Address depotAddress = new Address("23 Good Luck St", "Blue View", "Sandy Shores", "H337", new Coordinates(138, 995));
        Depot depot = new Depot("Main Depot", depotAddress);
        
    Manifest manifest = new Manifest();
    
    
      

    

        List<Box> box = Packer.packProducts(customer, depot, manifest);
       
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
     * Test of packProducts method, of class Packer.
     */
    @Test
    public void testPackProducts() {
        System.out.println("packProducts");
        Customer c = customer;
        Depot d = depot;
        Manifest m = manifest;
        List<Box> expResult = box ;
        List<Box> result = Packer.packProducts(c, d, m);
        assertEquals(expResult, result);
       
    }
}
