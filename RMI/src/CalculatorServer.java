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
            CalculatorInterface skeleton = new Calculator();
            java.rmi.registry.LocateRegistry.createRegistry(1099);
            java.rmi.Naming.rebind("Cal", skeleton);
            System.out.println("Cal ready");
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

    }
}
