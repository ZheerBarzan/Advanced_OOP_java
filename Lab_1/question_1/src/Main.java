import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ask input from the user
        Scanner input = new Scanner(System.in);

        // the height input for the height variable
        System.out.println("what is the height?");
        int height = input.nextInt();
        // the base input for the base variable
        System.out.println("what is the base?");
        int base = input.nextInt();

        // the equation to calculate the area of a triangle
        int area = (base*height)/2;

        // print out the result
        System.out.println("the area of the triangle is equal to: "+ area);

    }
}