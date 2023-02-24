package designpatterns;

public class FactoryShape {
    public Shape getShape(String shapeType){
        if (shapeType == null){
            return null;
        }
        if(shapeType == "Circle")
            return new Circle();
        if (shapeType =="Square")
            return new Square();
        return null;
    }
}
