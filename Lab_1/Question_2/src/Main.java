import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what is the value of A?");
        double a = input.nextInt();
        System.out.println("what is the value of B?");
        double b = input.nextInt();
        System.out.println("what is the value of C?");
        double c= input.nextInt();
        double x = quadraticFunction(a,b,c);

        System.out.println("the value of X = "+x);
    }

    public static double quadraticFunction(double a,double b, double c){

        double delta= (Math.pow(b,2)- 4*a*c);
        double x =  ((-(b+Math.sqrt(delta)))/2*a)/100;

        return x;
    }
}