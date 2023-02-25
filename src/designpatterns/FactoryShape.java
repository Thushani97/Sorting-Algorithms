package designpatterns;

public class FactoryShape {
    public static Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("Square")) {
            return new Square();

        } else if (shapeType.equalsIgnoreCase("Circle")) {
            return new Circle();
        }
        return null;
    }
}
