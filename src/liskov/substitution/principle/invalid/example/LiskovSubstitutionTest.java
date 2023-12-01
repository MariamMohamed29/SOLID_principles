package liskov.substitution.principle.invalid.example;

public class LiskovSubstitutionTest {
    public static void main(String[] args){
      Rectangle rectangle=new Rectangle();
      rectangle.setHeight(5);
      rectangle.setWidth(2);
      if (rectangle.getArea()==10){
          System.out.println(rectangle.getArea());
      }
      //Liskov Substitution violated in the following code because the area won't be 10
      Rectangle square=new Square();
        square.setHeight(5);
        square.setWidth(2);
        if (square.getArea()==10){
            System.out.println(square.getArea());
        }
    }
}
