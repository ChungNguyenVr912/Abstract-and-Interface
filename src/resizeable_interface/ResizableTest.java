package resizeable_interface;

import shape_obj.Circle;
import shape_obj.Rectangle;
import shape_obj.Square;

public class ResizableTest {
    public static void main(String[] args) {
        Resizable[] resizable = {new Circle(10), new Circle(20), new Rectangle(10,20), new Square(100)};
        System.out.println("Before resize:");
        for (Resizable circle :
                resizable) {
            System.out.println(circle);
        }
        for (Resizable circle :
                resizable) {
            circle.resize(Math.random()*99+1);
        }
        System.out.println("After resize:");
        for (Resizable circle :
                resizable) {
            System.out.println(circle);
        }
    }
}
