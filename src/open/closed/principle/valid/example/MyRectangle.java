package open.closed.principle.valid.example;



public class MyRectangle extends Shape {
    private int width;
    private int height;


    @Override
    void draw() {
        System.out.println("this is a rectangle");
    }
}
