import javax.swing.*;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class CalculatorClient extends JFrame{
    public CalculatorClient(){





        setTitle("RMI Calculator APP");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));

        JLabel firstNumLabel = new JLabel("Enter the first number");
        panel.add(firstNumLabel);

        JTextField firstNumField = new JTextField();
        panel.add(firstNumField);

        JLabel secondNumLabel = new JLabel("Enter the second number");
        panel.add(secondNumLabel);

        JTextField secondNumField = new JTextField();
        panel.add(secondNumField);
        setContentPane(panel);
        setVisible(true);

    }

    public static void main(String[] args) {
        new CalculatorClient();
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
