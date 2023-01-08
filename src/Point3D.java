/**
 * This class contains instances of 3D coordinates in cartesian format.
 * It also provides a method which computes the Euclidean distance
 * between two points.
 *
 * @author Chloe Al-Frenn, 300211508
 */
public class Point3D {

    /**
     * Instance variables
     * Contains the current value of X Y Z to store 3D points.
     * Contains a label which will help define the cluster of the point.
     */
    private double x;
    private double y;
    private double z;
    private int cluster; //used as a label.

    /**
     * Class constructor to define the values of x, y and z once we read
     * the file containing points. Leaves cluster undefined.
     */
    public Point3D(double x, double y, double z){
    this.x = x;
    this.y = y;
    this.z = z;
    }

    /**
     * Instance methods of getters and setters,
     * we only need a setter for cluster since x, y and z stay the same.
     */
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public int getCluster() {
        return cluster;
    }

    public void setCluster(int cluster) {
        this.cluster = cluster;
    }

    /**
     * Calculates the Euclidean distance between two points.
     * d = ((x1-x2)^2 + (y1-y2)^2 + (z1-z2)^2)^1/2
     * reference: https://en.wikipedia.org/wiki/Euclidean_distance
     *
     * @param pt The first point.
     * @return The distance between the two points.
     */
    public double distance(Point3D pt){
        double distance = Math.pow((x-pt.x), 2) + Math.pow((y-pt.y), 2) + Math.pow((z-pt.z), 2);
        distance = Math.sqrt(distance);
        return distance;
    }
}
