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
 */
public class BoxTest {
     // Test data

        Address depotAddress = new Address("23 Good Luck St", "Blue View", "Sandy Shores", "H337", new Coordinates(138, 995));
        Depot depot = new Depot("Main Depot", depotAddress);
     

        Address testAddress1 = new Address("67 Torch Rd", "Treeline", "Mt High", "T799", new Coordinates(1102, 87));
        Address testAddress2 = new Address("88 Camp Mine St", "Ridgeway", "Lowe Valley", "I998", new Coordinates(100, 34));
        Customer customer = new Customer("Andy Bravo", testAddress2);
       // customer.addAddress();
      
     Product a1 = new Product("Alpha", 0, true, true);
    Product a2 = new Product("Alpha", 2, true, true);
    Product a3 = new Product("Alpha", 3, false, true);
    Product a4 = new Product("Alpha", 4, true, false);


    /**
     * Test of getLabel method, of class Box.
     */
        @Test
        public void getLabel() {
      
        System.out.println("getlabel");
        
            Box testBox1 = new Box(customer, depot);
            System.out.println("toString");
        assertEquals("Andy Bravo\n88 Camp Mine St\nRidgeway\nLowe Valley\n"
                + "I998\nAlpha\n0\nHammer x 1\n" +
"Saw x 1\n" +
"Light Bulbs x 1\n" +
"Ladder x 1\n" +
"Nails x 1\n" +
"Weedkiller x 1\n" +
"FRAGILE", testBox1.getLabel());
       
  
        }


    
}