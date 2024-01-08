import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.*;
public class CalculatorServer {
    public static void main(String[] args) {
        // this is the server side of the application this needs to run in order for the application to work
        // after running this you can run the client application.
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
