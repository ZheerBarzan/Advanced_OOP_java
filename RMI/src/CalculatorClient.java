import java.rmi.Naming;
public class CalculatorClient {

    public static void main(String[] args) {
        try{
            CalculatorInterface stub = (Calculator) Naming.lookup("rmi://localhost/Cal");
            System.out.println(stub.add(3,4));
        }catch (Exception exception){
            System.out.println("not working"+exception);

        }
    }

}
