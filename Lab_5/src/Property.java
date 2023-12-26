import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Property {
    private static final double DISCOUNT = 10;
    private int id;
    private double area;
    private String city;
    private char type;
    private int year;
    private int price;
    private String owner;

    public Property() {
    }

    public Property(int id, double area, String city, char type, int year, int price, String owner) {
        this.id = id;
        this.area = area;
        this.city = city;
        this.type = type;
        this.year = year;
        this.price = price;
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    public double applyDiscount(){
        double soldPrice = (getPrice()-(DISCOUNT/100)* getPrice());
        return soldPrice;

    }
    public String elgibleForDiscount(){
        int currentYear = Year.now().getValue();

        if ((currentYear - getYear()) >= 10){

            return "propertyID: "+getId()+" is older than 10 years and eligible for discount = "+ applyDiscount();
        } else {
            return "propertyID: "+getId()+" is not older and not eligible for discount = "+getPrice();
        }
    }
    public static List<Property> getPropertyByCity(List<Property> properties, String city){

        List<Property> filterByCity= new ArrayList<Property>();

        for (Property property : properties){
            if (property.city.equals(city)){
                filterByCity.add(property);
            }
        }

        return filterByCity;
    }

    @Override
    public String toString() {
        return "Property{" +
                "id=" + id +
                ", area=" + area +
                ", city='" + city + '\'' +
                ", type=" + type +
                ", year=" + year +
                ", price=" + price +
                ", owner='" + owner + '\'' +
                '}'+"\n";
    }
}

