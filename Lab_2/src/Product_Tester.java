
public class Product_Tester {
    public static void main(String[] args) {
        Product p1 = new Product(1,"Iphone",1299,2022,100);
        Product p2 = new Product(2,"Galaxy",999);

        // change the price of p1 to 123 "use setprice"
        p1.setProduct_price(123);
        System.out.println("the new price is: "+p1.getProduct_price());
        // implement the folowing
        // A) sell 10 items from p1
        p1.soldNumber(10);
        System.out.println("the remaining count is "+p1.getProduct_count());
        //B) compute selling price for p2
        System.out.println("the selling price after 5% discount is: "+p2.computeSellingPrice());
        System.out.println("_____________________________________");
        //C)print objects p1 and p2
        System.out.println(p1);
        System.out.println("_____________________________________");
        System.out.println(p2);


    }
}