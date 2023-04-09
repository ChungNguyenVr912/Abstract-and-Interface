package comparable_circle;

import shape_obj.Rectangle;
import shape_obj.Triangle;

import java.util.Arrays;

public class ComparatorTest {
    public static void main(String[] args) {
        Triangle[] triangles = {new Triangle(), new Triangle(30, 14, 25), new Triangle(6, 9, 10)};
        System.out.println("Pre-sorted:");
        for (Triangle triangle :
                triangles) {
            System.out.println(triangle);
        }
        TriangleComparator triangleComparator = new TriangleComparator();
        Arrays.sort(triangles, triangleComparator);
        System.out.println("After sorted:");
        for (Triangle triangle :
                triangles) {
            System.out.println(triangle);
        }

        Rectangle[] rectangles = {new Rectangle(20, 10), new Rectangle(), new Rectangle(5, 8, "red", false)};
        System.out.println("Pre-sorted:");
        for (Rectangle rectangle :
                rectangles) {
            System.out.println(rectangle);
        }
        RectangleComparator rectangleComparator = new RectangleComparator();
        Arrays.sort(rectangles, rectangleComparator);
        System.out.println("After sorted:");
        for (Rectangle rectangle :
                rectangles) {
            System.out.println(rectangle);
        }
    }
}
