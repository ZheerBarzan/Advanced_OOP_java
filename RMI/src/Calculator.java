import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Calculator extends UnicastRemoteObject implements CalculatorInterface {
    public Calculator()throws RemoteException{
        super();
    }

    @Override
    public int add(int x, int y) throws RemoteException {
        return x+y;
    }

    @Override
    public int sub(int x, int y) throws RemoteException {
        return x-y;
    }

    @Override
    public int mul(int x, int y) throws RemoteException {
        return x*y;
    }

    @Override
    public int div(int x, int y) throws RemoteException {
        return x/y;
    }
}
