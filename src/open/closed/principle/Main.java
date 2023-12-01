package open.closed.principle;

import open.closed.principle.valid.example.MyRectangle;
import open.closed.principle.valid.example.MyShapePrinter;

public class Main {
    public static void main(String[] args){
        MyShapePrinter printer=new MyShapePrinter();
        printer.drawShape(new MyRectangle());
    }
}

