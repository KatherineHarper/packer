package packer;

/**
 *
 * @author I.M.Bad
 */




public class Coordinates {
    
    private final double x;
    private final double y;
    
    /**
     *
     * @param x The X coordinate of this Point.
     * @param y The Y coordinate of this Point.
     */
    public Coordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     *
     * @return X returns The X coordinate of this Point.
     */
    public double getX() {
        return x;
    }

    /**
     *
     * @return y The Y coordinate of this Point.
     */
    public double getY() {
        return y;
    }
    
    /**
     *
     * @param other parameter to hold other data
     * @return returns The euclidean Distance to
     */
    public double euclideanDistanceTo(Coordinates other) {
        double xDiff = other.getX() - this.getX();
        double yDiff = other.getY() - this.getY();
        double dist = Math.pow((xDiff * xDiff + yDiff * yDiff),0.5);
        return dist;
    }
    
    /**
     *
     * @param other parameter to hold other data
     * @return returns The manhattan Distance to
     */
    public double manhattanDistanceTo(Coordinates other) {
        double xDiff = other.getX() - this.getX();
        double yDiff = other.getY() - this.getY();
        double dist = Math.abs(xDiff) + Math.abs(yDiff);
        return dist;
    }
    
    /**
     *
     * @param other parameter to hold other data
     * @return returns The company Distance To
     */
    public double companyDistanceTo(Coordinates other) {
        double xDiff1 = other.getX() - this.getX();
        double yDiff1 = other.getY() - this.getY();
        double dist1 = Math.pow((xDiff1 * xDiff1 + yDiff1 * yDiff1),0.5);
        double xDiff2 = other.getX() - this.getX();
        double yDiff2 = other.getY() - this.getY();
        double dist2 = Math.abs(xDiff2) + Math.abs(yDiff2);
        return (dist1 + dist2)/2+1;
    }

}
