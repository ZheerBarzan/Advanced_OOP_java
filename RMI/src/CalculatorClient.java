import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class CalculatorClient extends JFrame{
    public CalculatorClient(){
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





        setTitle("RMI Calculator APP");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.CYAN);

        JLabel firstNumLabel = new JLabel("Enter the first number:");
        firstNumLabel.setBounds(13,25,280,30);
        panel.add(firstNumLabel);

        JTextField firstNumField = new JTextField();
        firstNumField.setBounds(10,50,280,30);
        panel.add(firstNumField);

        JLabel secondNumLabel = new JLabel("Enter the second number:");
        secondNumLabel.setBounds(13,75,280,30);
        panel.add(secondNumLabel);

        JTextField secondNumField = new JTextField();
        secondNumField.setBounds(10,100,280,30);
        panel.add(secondNumField);




        
        setContentPane(panel);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new CalculatorClient();

    }

}
