import java.rmi.*;

public interface CalculatorInterface extends Remote{
    // this is a remote interface where all the methods inside of it needs to be implemnted

public int add(int x, int y) throws RemoteException;
public int sub(int x, int y) throws RemoteException;

public int mul(int x, int y) throws RemoteException;

public int div(int x, int y) throws RemoteException;




}
