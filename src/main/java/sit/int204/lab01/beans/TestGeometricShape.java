package sit.int204.lab01.beans;

//import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.circle;
import sit.int204.lab01.beans.Circle;
import sit.int204.lab01.beans.GeometricShape;
import sit.int204.lab01.beans.GeometricShapeFactory;
import sit.int204.lab01.beans.Rectangle;

public class TestGeometricShape {
    public static void main(String[] args) {
        GeometricShapeFactory gf = new GeometricShapeFactory();
        GeometricShape circle = gf.getGeometricShape(Circle.class);
        System.out.println(circle);
        GeometricShape rectangle = gf.getGeometricShape(Rectangle.class);
        System.out.println(rectangle);
    }
}