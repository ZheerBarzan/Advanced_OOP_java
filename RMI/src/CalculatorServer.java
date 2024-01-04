import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.*;
public class CalculatorServer {
/*
    public CalculatorServer(){
        try{
            CalculatorInterface skeleton = new Calculator();
            Naming.rebind("rmi://localhost/calculator",skeleton);
        }catch (Exception exception){
            System.out.println("not working"+exception);
        }
    }*/

    public static void main(String[] args) {
        try {
            CalculatorInterface stub = new Calculator();
            Naming.rebind("rmi://localhost:5000/", stub);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

    }
}
