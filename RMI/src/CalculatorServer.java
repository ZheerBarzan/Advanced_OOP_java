import java.rmi.Naming;
public class CalculatorServer {

    public CalculatorServer(){
        try{
            CalculatorInterface calculator = new Calculator();
            Naming.rebind("rmi://localhost/calculator",calculator);
        }catch (Exception exception){
            System.out.println("not working"+exception);
        }
    }

    public static void main(String[] args) {
        new CalculatorServer();
    }
}
