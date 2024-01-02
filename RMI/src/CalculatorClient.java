import java.rmi.Naming;
public class CalculatorClient {

    public static void main(String[] args) {
        try{
            Calculator stub = (Calculator) Naming.lookup("rmi://localhost/calculator");

        }catch (Exception exception){

        }
    }

}
