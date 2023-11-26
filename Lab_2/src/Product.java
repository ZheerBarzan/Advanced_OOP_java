public class Product {

    private  final int DISCOUNT_RATE = 5;
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

    public int setProduct_count(int product_count) {
        this.product_count = product_count;
        return product_count;
    }

    @Override
    public String toString() {
        return "the product ID is: "+ getProduct_id()+"\n"+"the product name is: "+getProduct_name()+"\n"
                +"the price of the product is: "+computeSellingPrice();
    }
    public double computeSellingPrice(){
        double computedDiscount = getProduct_price()*(computeDiscount());
        double sellingPrice = getProduct_price()-computedDiscount;
        return sellingPrice;
    }

    public int soldNumber(int sold){
        int soldItemCount = setProduct_count( getProduct_count() - sold);
        return soldItemCount;
    }
    private double computeDiscount(){
        double discountValue = (double) DISCOUNT_RATE/100;
        return discountValue;
    }
}
