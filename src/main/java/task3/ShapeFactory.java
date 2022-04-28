package task3;

public class ShapeFactory {
    Shape createShape(ShapeType shapeType) {
        Shape shape;
        switch (shapeType) {
            case CIRCLE:
                shape = new Circle();
                break;
            case TRIANGLE:
                shape=new Triangle();
                break;
            case RECTANGLE:
                shape=new Rectangle();
                break;
            default: throw new IllegalArgumentException();
        }
        return shape;
    }
}
