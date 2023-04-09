package shape_obj;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.setSide1(3);
        triangle.setSide2(4);
        triangle.setSide3(5);
        triangle.setColor("green");
        System.out.println(triangle);
    }
}
