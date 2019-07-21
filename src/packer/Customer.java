package packer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author I.M.Bad
 */
public class Customer {
    
    private String name;
    private List<Address> addresses; 

    /**
     *
     * @param name string 
     * @param address from class address string in list
     */
    public Customer(String name, Address address) {
        addresses = new ArrayList<>();
        this.name = name;
        this.addresses.add(address);
    }
    
    /**
     *
     * @param address from class address string in list
     */
    public void addAddress(Address address) {
        this.addresses.add(address);
    }
    
    /**
     *
     * @return name string
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param d depot 
     * @return losestAddressTo depot
     */
    public Address getClosestAddressTo(Depot d) {
        double bestDistance = Double.MAX_VALUE;
        Address bestAddress = null;
        for (Address a : addresses) {
            double distance = a.getCoordinates().companyDistanceTo(d.getCoordinates());
            if (distance < bestDistance) {
                bestAddress = a;
            }
        }
        return bestAddress;
    }

    public String toString() {
        return this.getName();
    }
}
