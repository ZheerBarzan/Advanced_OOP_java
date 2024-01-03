import javax.swing.*;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class CalculatorGUI extends JFrame {

    private static final long serialVersionUID= 1L;
    private Calculator calculator;

    public CalculatorGUI(){
        try{
            calculator = (Calculator) Naming.lookup("rmi://localhost/calculator");
        }  catch (Exception exception){
            System.out.println("not working"+exception);

        }
    }
}
