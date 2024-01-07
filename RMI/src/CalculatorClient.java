import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class CalculatorClient {

    public static void main(String[] args) {
        try{
            CalculatorInterface stub = (CalculatorInterface) Naming.lookup("rmi://localhost/Cal");
            System.out.println("the addition: "+stub.add(3,4));
            System.out.println("the subtraction: "+stub.sub(5,6));
            System.out.println("the multiplication: "+stub.mul(6,2));
            System.out.println("the devision: "+stub.div(6,2));
            System.out.println("call ready");
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (NotBoundException e) {
            throw new RuntimeException(e);
        }
    }

}
