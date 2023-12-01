package open.closed.principle.invalid.example;

public class ShapePrinter {
    public void drawShape(Object shape) {
        if (shape instanceof Rectangle)
            System.out.println("this is a rectangle");
        else if (shape instanceof Square) {
            System.out.println("this is a square");
        }
    }
}
