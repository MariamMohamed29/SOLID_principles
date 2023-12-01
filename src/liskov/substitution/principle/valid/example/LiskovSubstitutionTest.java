package liskov.substitution.principle.valid.example;

public class LiskovSubstitutionTest {
    public static void main(String[] args){
        Shape shape1=new Rectangle(2,5);
        System.out.println(shape1.area());
        Shape shape2=new Square(5);
        System.out.println(shape2.area());

    }
}
