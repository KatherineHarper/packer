package packer;

/**
 *
 * @author I.M.Bad
 */
public class Box {
    
    
    private Manifest contents;
    private Customer customer;
    private Depot depot; 
   
    /**
     *
     * @param customer from class customer
     * @param depot from class depot
     */
    public Box(Customer customer, Depot depot) {
        this.customer = customer;
        this.depot = depot;
        
        contents = new Manifest();
    }

    /**
     *
     * @param product from class product
     */
    public void addProduct(Product product) {
        if (canFit(product)) {
            contents.addProduct(product, 1);
        }
    }
    
    /**
     *
     * @param product product from class product
     * @param quantity how many of each product from class product
     */
    public void addProduct(Product product, int quantity) {
        if (canFit(product,quantity)); {
            contents.addProduct(product, quantity);
        }
    }
    
    /**
     *
     * @return a string of the customer, address, depot, contents of box and if fragile or not
     */
    public String getLabel() {
        StringBuilder label = new StringBuilder();
        label.append(customer);
        label.append("\n");
        label.append(customer.getClosestAddressTo(depot));
        label.append("\n");
        label.append(contents.toString());
        label.append("\n");
        if (this.isFragile()) {
            label.append("FRAGILE\n");
        }
        return label.toString();
    }
    
  
    public String toString() {
        return getLabel();
    }
    
    /**
     *
     * @return get total weight
     */
    public double getWeight() {
       return contents.getTotalWeight();
    }
    
    /**
     *
     * @param p product from class product
     * @return can fit product
     */
    public boolean canFit(Product p) {
        return p.getWeight() < 20;
    }
    
    /**
     *
     * @param p product from class product
     * @param quantity how many of each product from class product
     * @return if can fit in under 20 with amount
     */
    public boolean canFit(Product p, int quantity) {
        return (p.getWeight() * quantity) < 20;
    }
    
    /**
     *
     * @return the remaining Capacity
     */
    public double remainingCapacity() {
        return 00.0 - this.getWeight();
    }
    
    /**
     *
     * @return  if is fragile
     */
    public boolean isFragile() {
        return contents.hasFragileItems();
    }
    
    /**
     *
     * @return boolean if is Hazardous
     */
    public boolean isHazardous() {
        return false;
    }
}
