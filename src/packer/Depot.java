package packer;

/**
 *
 * @author I.M.Bad
 */
public class Depot {
    private String name;
    private Address address;

    /**
     *
     * @param name user input of depot
     * @param address user input of depot
     */
    public Depot(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    
    /**
     *
     * @return name string
     */
    public String getName() {
        return name.toString();
    }
    
    /**
     *
     * @return  Coordinates from address
     */
    public Coordinates getCoordinates() {
        return this.address.getCoordinates();
    }
    
    public String toString() {
        return this.getName();
    }
    
}
