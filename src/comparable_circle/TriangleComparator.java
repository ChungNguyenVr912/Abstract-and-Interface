package comparable_circle;

import shape_obj.Triangle;

import java.util.Comparator;

public class TriangleComparator implements Comparator<Triangle> {
    @Override
    public int compare(Triangle o1, Triangle o2) {
        return Double.compare(o1.getArea(), o2.getArea());
    }
}
