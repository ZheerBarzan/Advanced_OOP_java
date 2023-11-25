public class Product {
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

}
