import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // A)
        ArrayList<Property> houses = new ArrayList<Property>();
        //A)-1 reading the file
        try(BufferedReader reader = new BufferedReader(new FileReader("/Users/zheer/Desktop/property.txt"))){

            String row;
            boolean firstRow = true;
            while ((row = reader.readLine()) != null){
                if(firstRow){
                    firstRow = false;
                    continue;
                }
                String[] value = row.split(" ");
                int id = Integer.parseInt(value[0]);
                double area= Double.parseDouble(value[1]);
                String city= value[2] ;
                char type = value[3].charAt(0);
                int year= Integer.parseInt(value[4]);
                int price=Integer.parseInt(value[5]);
                String owner = value[6];
                // A)-2 putting the data into an object
                Property property = new Property(id,area,city,type,year,price,owner);
                // A)-3 adding it to an arraylist
                houses.add(property);
                System.out.println(houses.toString());
                // B) applying discount for any property that is older than 10 years
                System.out.println(property.elgibleForDiscount());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}