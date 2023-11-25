public class Product {

    private final int DISCOUNT_RATE = 5;
    private int product_id;
    private String product_name;
    private double product_price;
    private int product_year;
    private int product_count;

    public Product(int id, String name, double price, int year, int count) {
        this.product_id = id;
        this.product_name = name;
        this.product_price = price;
        this.product_year = year;
        this.product_count = count;
    }
    // make another constructor with 3 values(id,name,price) year by defualt is 2023 and count by defualt is 100
    public Product(int id,String name,double price){
        this.product_id = id;
        this.product_name = name;
        this.product_price = price;
        this.product_year = 2023;
        this.product_count = 100;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(double product_price) {
        this.product_price = product_price;
    }

    public int getProduct_year() {
        return product_year;
    }

    public void setProduct_year(int product_year) {
        this.product_year = product_year;
    }

    public int getProduct_count() {
        return product_count;
    }

    public void setProduct_count(int product_count) {
        this.product_count = product_count;
    }

    //format string with product id,product name and product selling price
    @Override
    public String toString() {
        return super.toString();
    }
    //after applying the discount it computes the selling price
    public double computeSellingPrice(){
        return 0;
    }
    //it deducts a number from the product count
    public int soldNumber(int sold){

        return sold;
    }
    // it computes the discount value using the discount_rate
    private double computeDiscount(){

        return 0;
    }
}
