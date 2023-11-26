
public class Product_Tester {
    public static void main(String[] args) {
        Product p1 = new Product(1,"Iphone",100,2022,200);
        Product p2 = new Product(2,"Galaxy",666);

        // change the price of p1 to 123 "use setprice"
        System.out.println(p2.getProduct_year() +" " +p2.getProduct_count());

        System.out.println(p2.toString());
        p2.soldNumber(1);
        System.out.println(p2.getProduct_count());

        // implement the folowing A) sell 10 items from p1
        //B) compute selling price for p2
        //C)print objects p1 and p2
    }
}