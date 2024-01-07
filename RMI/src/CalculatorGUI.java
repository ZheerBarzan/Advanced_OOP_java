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
            this.calculator  = (Calculator) Naming.lookup("rmi://localhost/Cal");
        }  catch (Exception exception){
            System.out.println("not working"+exception);

        }
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
        new CalculatorGUI();
    }
}
