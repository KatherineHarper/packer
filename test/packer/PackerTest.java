/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packer;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
/**
 *
 * @author katherineharper
 */
public class PackerTest {
     // Test data
     Address depotAddress = new Address("23 Good Luck St", "Blue View", "Sandy Shores", "H337", new Coordinates(138, 995));
        Depot depot = new Depot("Main Depot", depotAddress);
        
     Address customerAddress1 = new Address("67 Torch Rd", "Treeline", "Mt High", "T799", new Coordinates(1102, 87));
        Address customerAddress2 = new Address("88 Camp Mine St", "Ridgeway", "Lowe Valley", "I998", new Coordinates(100, 34));
        Customer customer = new Customer("Andy Bravo", customerAddress1);
                 Manifest manifest = new Manifest();
        Manifest.addProduct(new Product("Hammer", 3, false, false), 1);
        manifest.addProduct(new Product("Nails", 1, false, false), 12);
        manifest.addProduct(new Product("Ladder", 15, false, false), 2);
        manifest.addProduct(new Product("Saw", 5, false, false), 1);
        manifest.addProduct(new Product("Light Bulbs", 1, false, true), 20);
        manifest.addProduct(new Product("Weedkiller", 2, true, false), 1);
    /**
     * Test of getName method, of class Packer.
     */
    @Test
    public void testGetName() {
        System.out.println("toString");
        assertEquals("City Depot", testDepot1.getName());
        assertEquals("Suburbs Depot", testDepot2.getName());
        assertEquals("Country Depot", testDepot3.getName());
    }    
}
