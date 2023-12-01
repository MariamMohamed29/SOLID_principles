package open.closed.principle.valid.example;
public class MySquare extends Shape {
    private int side;


    @Override
    void draw() {
        System.out.println("this is a square");
    }
}
