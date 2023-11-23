import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // A) get a stirng and print its length
        System.out.println("enter a string:");
        String word = input.nextLine();
        System.out.println("the length of a string is:"+word.length());
        // B) in the string "hello everyone" get the lenght and see the result
        String greet= "Hello everyone";
        System.out.println(greet.length());
        // C) repalce every a to A
        String capWord = "apple america alian ";
        System.out.println(capWord.replaceAll("a","A"));
        // D) convert every letter to uppercase
        String capString = "hello everyone";
        System.out.println(capString.toUpperCase());
        // E) extract the first 3 letter of a string and put it in a variable
        String string1 = "expelarmuis";
        String string2 = string1.substring(0,3);
        System.out.println("the original: "+string1+" text replaced: "+string2);

    }
}