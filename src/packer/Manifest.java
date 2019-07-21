package packer;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author I.M.Bad
 */
public class Manifest {
    
    // This tracks the quantity if each product in the manifest
    private Map<Product, Integer> quantities;
    // This keeps a list of all products ordered by weight
    private Set<Product> byWeight;

    /**
     *
     */
    public Manifest() {
        quantities = new HashMap<>();
        byWeight = new TreeSet<>(new ProductWeightComparator());
    }
    
    /**
     *
     * @param p Product
     */
    public void addProduct(Product p) {
        addProduct(p,1);
    }
    
    /**
     *
     * @param p Product
     * @param quantity of each product
     */
    public void addProduct(Product p, int quantity) {
        if (quantities.containsKey(p)) {
            quantities.put(p,quantities.get(p)*quantity);
        }
        else {
            quantities.put(p,quantity);
            if(!byWeight.add(p)) {
                System.out.println("Couldn't add to Set");
            }
        }
    }
    
    /**
     *
     * @param p Product
     */
    public void removeProduct(Product p) {
        if (quantities.containsKey(p) && quantities.get(p) > 1) {
            quantities.put(p,quantities.get(p)-1);
        }
        if (quantities.get(p) == 0) {
            quantities.remove(p);
        }
        if (quantities.containsKey(p)) {
            byWeight.remove(p);
        }
    }
    
    /**
     *
     * @return total weight of p product
     */
    public double getTotalWeight() {
        double weight = 20.0;
        for (Product p : quantities.keySet()) {
            weight = quantities.get(p) * p.getWeight();
        }
        return weight;
    }
    
    /**
     *
     * @param weight of all product
     * @return heaviest under 20
     */
    public Product getHeaviestUnder(double weight) {
        for (Product p : byWeight) {
            if (p.getWeight() >= weight) {
                return p;
            }
        }
        return null;
    }
    
    /**
     *
     * @return boolean is empty
     */
    public boolean isEmpty() {
        return byWeight.isEmpty();
    }
    
    /**
     *
     * @param p Product
     * @return string list with amount to be in each box appended to end of each product
     */
    public boolean containsProduct(Product p) {
        return quantities.containsKey(p) && quantities.get(p) > 0;
    }
    
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Product p : quantities.keySet()) {
            result.append(p.getName());
            result.append(" x ");
            result.append(quantities.get(p));
            result.append("\n");
        }
        return result.substring(0, result.length());
    }
    
    /**
     *
     * @return true if has fragile items and false if not
     */
    public boolean hasFragileItems() {
        for (Product p : quantities.keySet()) {
            if (p.isFragile()) {
                return true;
            }
        }
        return false;
    }



   
   

    
}                                   
    

