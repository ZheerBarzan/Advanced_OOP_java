
public class Main {
    public static void main(String[] args) {
      Circle circle = new Circle(3,"red",false);
      Rectangle rectangle = new Rectangle(4,8,"blue",true);
      Square square = new Square(2,"green",false);


        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
        System.out.println(square.toString());
        System.out.println("number of objects made: "+ Shape.count);

    }
}