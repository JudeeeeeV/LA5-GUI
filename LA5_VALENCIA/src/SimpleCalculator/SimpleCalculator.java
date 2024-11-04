package SimpleCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame {


    private JPanel pMain;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JTextField tfNumber2;
    private JTextField lblResult;
    private JButton btnCompute;

    SimpleCalculator() {

        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int input1;
                int input2;
                int output = 0;
                String operations;
                try {
                    input1 = Integer.parseInt(tfNumber1.getText());
                    input2 = Integer.parseInt(tfNumber2.getText());

                    if(cbOperations.getSelectedIndex() == 0) {
                        JOptionPane.showMessageDialog(null, "Choose an operation!");
                    } else {
                        operations = (String) cbOperations.getSelectedItem();

                        switch(operations.charAt(0)) {
                            case '+':
                                output = input1 + input2;
                                break;
                            case '-':
                                output = input1 - input2;
                                break;
                            case '*':
                                output = input1 * input2;
                                break;
                            case '/':
                                output = input1 / input2;
                                break;
                        }

                        lblResult.setText(String.valueOf(output));
                        lblResult.setEditable(false);
                    }
                } catch(ArithmeticException exc) {
                    JOptionPane.showMessageDialog(null, "Invalid Input. Dividing by zero is not allowed");

                }catch(Exception exc) {

                    JOptionPane.showMessageDialog(null, "Input a number!");
                }

            }
        });
    }
    public static void main(String[] args) {
        SimpleCalculator s = new SimpleCalculator();
        s.setTitle("Simple Calculator");
        s.setContentPane(s.pMain);
        s.setSize(800, 150);
        s.setDefaultCloseOperation(EXIT_ON_CLOSE);
        s.setVisible(true);
    }
}
