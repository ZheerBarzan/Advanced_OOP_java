import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what is the value of A?");
        int a = input.nextInt();
        System.out.println("what is the value of B?");
        int b = input.nextInt();
        System.out.println("what is the value of C?");
        int c= input.nextInt();
        int x = quadraticFunction(a,b,c);

        System.out.println("the value of X = "+x);
    }

    public static int quadraticFunction(int a,int b, int c){

        int delta= (int) (Math.pow(b,2)- 4*a*c);
        int x = (int) ((-(b+Math.sqrt(delta)))/2*a)/100;

        return x;
    }
}