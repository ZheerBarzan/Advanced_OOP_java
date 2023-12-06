
// A) Write a program to implement the above class diagram and one driver class for testing the methods.
public class Main {
    public static void main(String[] args) {
      Circle circle = new Circle(3,"red",false);
      Rectangle rectangle = new Rectangle(4,8,"blue",true);
      Square square = new Square(2,"green",false);
      //B) Add a variable/ method to count total number of objects of the super class and one of the sub-classes.
      System.out.println("number of objects made: "+ Shape.count+"\n");

      // C) In the toString() method of the sub-class, call the toString() method of the abstract super class.
        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
        System.out.println(square.toString());


    }
}