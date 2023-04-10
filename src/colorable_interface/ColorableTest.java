package colorable_interface;

import shape_obj.*;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(), new Rectangle(), new Triangle(), new Square()};
        for (Shape shape :
                shapes) {
            System.out.println(shape);
            System.out.println("Area: " + shape.getArea());
            if (shape instanceof Colorable){
                ((Colorable) shape).howToColor();
            }
        }
    }
}
