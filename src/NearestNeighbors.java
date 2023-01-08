import java.util.ArrayList;
import java.util.List;
/**
 * This class stores an ArrayList of all the points that were contained in the file.
 * It also provides a method which is able to determine the neighbors of each points in the ArrayList.
 *
 * @author Chloe Al-Frenn, 300211508
 */
public class NearestNeighbors {
    /**
     * Instance variables
     * Contains an ArrayList of 3DPoints
     */
    private List<Point3D> points = new ArrayList<Point3D>();

    /**
     * Class constructor to store all the points contained in the file into
     * an ArrayList of points.
     */
    public NearestNeighbors(List<Point3D> points){
        this.points = points;
    }

    /**
     * iterates through all the points in the ArrayList points to check if they are neighbors of
     * the point p. If the euclidean distance between the two points is smaller than epsilon then
     * they are neighbors. Then returns a new ArrayList containing p and all of its neighbors.
     * @param p the point for whom we are looking for neighbors.
     * @param eps epsilon which is the biggest distance separating two neighboring points.
     * @return inRange, an ArrayList which stores neighboring points.
     */
    public List<Point3D> rangeQuery(Point3D p, double eps){

        List<Point3D> inRange = new ArrayList<Point3D>();
        for(int i = 0; i < points.size(); i++){
            if(p.distance(points.get(i)) < eps){
                inRange.add(points.get(i));
            }
        }
        return inRange;
    }
}
