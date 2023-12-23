import java.io.*;
import java.util.ArrayList;
import java.util.List;

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
                System.out.println(property.elgibleForDiscount()+"\n");

            }

        } catch (IOException e) {
            e.getStackTrace();
        }


        // C) Show list of all properties located in Erbil
        List<Property> erbilHouses = Property.getPropertyByCity(houses,"Erbil");
        System.out.println("these properties are from Erbil: \n"+erbilHouses.toString());

        // D) Define a new property, using optional data and add it to the arraylist you have created in part “a” above.
        Property newProperty = new Property(111,300,"suli",'H',2005,20000,"Zhir");
        houses.add(newProperty);
        System.out.println("the new added property\n"+houses.getLast());

        // E) Save the content of the array list, in a new file called “NewProp.txt”.
        try(PrintWriter printWriter = new PrintWriter(new FileWriter("New_prop.txt"))) {
            printWriter.println("ID"+" "+"Area"+" "+"City"+" "+"Type"+" "+"Year"+" "+"Price"+" "+"Owner"+" ,"+" eligible for discount");
            for (Property property : houses){
                printWriter.println(
                        property.getId()+" "+property.getArea()+" "+property.getCity()+" "+property.getType()+" "+property.getYear()
                        +" "+property.getPrice()+" "+property.getOwner()+" ,"+property.elgibleForDiscount()
                );

            }
            System.out.println("data has been written to file: "+printWriter);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}