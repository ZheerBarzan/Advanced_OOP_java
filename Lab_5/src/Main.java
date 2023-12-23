import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Property> houses = new ArrayList<Property>();

        try(BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\zheer\\OneDrive\\Desktop\\x.txt"))){

            String row;
            while ((row = reader.readLine()) != null){
                String[] value = row.split(" ");



                int id = Integer.parseInt(value[0]);
                double area= Double.parseDouble(value[1]);
                String city= value[2] ;
                char type = value[3].charAt(0);
                int year= Integer.parseInt(value[4]);
                int price=Integer.parseInt(value[5]);
                String owner = value[6];

                Property property = new Property(id,area,city,type,year,price,owner);





                houses.add(property);

                System.out.println(houses.toString());

                System.out.println(property.elgibleForDiscount());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}