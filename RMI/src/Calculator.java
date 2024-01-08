import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Calculator extends UnicastRemoteObject implements CalculatorInterface {


    // this is the remote implemetaion class where all the methods from the interface are implemented

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
