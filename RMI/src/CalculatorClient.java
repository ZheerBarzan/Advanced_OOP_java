import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class CalculatorClient extends JFrame{
 private CalculatorInterface stub;
 private JTextArea textArea = new JTextArea(5,20);
    public CalculatorClient(){
        try{
            this.stub = (CalculatorInterface) Naming.lookup("rmi://localhost/Cal");
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

        JLabel op = new JLabel("choose and operation");
        op.setBounds(13,140,280,30);
        panel.add(op);

        textArea.setBounds(10,210,280,50);
        panel.add(textArea);


        // making the add button for addition
        JButton addButton = new JButton("+");
        addButton.setBounds(25,180,20,20);
        addButton.addActionListener(e -> {
                    int x = Integer.parseInt(firstNumField.getText());
                    int y = Integer.parseInt(secondNumField.getText());
                    try {
                        int result = stub.add(x,y);
                        textArea.append("result: "+String.valueOf(result));
                        JOptionPane.showMessageDialog(null, "the result of the Addition:\n"+x + " + " + y + " = " + result);
                    } catch (RemoteException ex) {
                        throw new RuntimeException(ex);
                    }
                }
        );
        panel.add(addButton);

        //making the subtract button
        JButton subButton = new JButton("-");
        subButton.setBounds(50,180,20,20);
        subButton.addActionListener(e -> {
                    int x = Integer.parseInt(firstNumField.getText());
                    int y = Integer.parseInt(secondNumField.getText());
                    try {
                        int result = stub.sub(x,y);
                        textArea.append("result: "+String.valueOf(result));
                        JOptionPane.showMessageDialog(null, "the result of the subtraction:\n"+x + " - " + y + " = " + result);
                    } catch (RemoteException ex) {
                        throw new RuntimeException(ex);
                    }
                }
        );
        panel.add(subButton);

        //making the multiplication button
        JButton mulButton = new JButton("*");
        mulButton.setBounds(75,180,20,20);
        mulButton.addActionListener(e -> {
                    int x = Integer.parseInt(firstNumField.getText());
                    int y = Integer.parseInt(secondNumField.getText());
                    try {
                        int result = stub.mul(x,y);
                        textArea.append("result: "+String.valueOf(result));
                        JOptionPane.showMessageDialog(null, "the result of the multiplication:\n"+x + " * " + y + " = " + result);
                    } catch (RemoteException ex) {
                        throw new RuntimeException(ex);
                    }
                }
        );
        panel.add(mulButton);

        //making the division button
        JButton divButton = new JButton("/");
        divButton.setBounds(100,180,20,20);
        divButton.addActionListener(e -> {
                    int x = Integer.parseInt(firstNumField.getText());
                    int y = Integer.parseInt(secondNumField.getText());
                    try {
                        int result = stub.div(x,y);
                        textArea.append("result: "+String.valueOf(result));
                        JOptionPane.showMessageDialog(null, "the result of the subtraction:\n"+x + " / " + y + " = " + result);
                    } catch (RemoteException ex) {
                        throw new RuntimeException(ex);
                    }
                }
        );
        panel.add(divButton);







        
        setContentPane(panel);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new CalculatorClient();

    }

}
