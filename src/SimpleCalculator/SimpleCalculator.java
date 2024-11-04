package SimpleCalculator;

import javax.swing.*;

public class SimpleCalculator extends JFrame {


    private JPanel pMain;
    private JTextField tfNumber1;
    private JComboBox<String> cbOperations;
    private JTextField tfNumber2;
    private JTextField lblResult;
    private JButton btnCompute;

    SimpleCalculator() {

        btnCompute.addActionListener(e -> {
            try {
                int input1 = Integer.parseInt(tfNumber1.getText());
                int input2 = Integer.parseInt(tfNumber2.getText());

                if (cbOperations.getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(null, "Choose an operation!");
                    return;
                }

                String operation = (String) cbOperations.getSelectedItem();
                int output = switch (operation) {
                    case "+" -> input1 + input2;
                    case "-" -> input1 - input2;
                    case "*" -> input1 * input2;
                    case "/" -> {
                        if (input2 == 0) {
                            throw new ArithmeticException();
                        }
                        yield output = input1 / input2;
                    }
                    default -> 0;
                };

                lblResult.setText(String.valueOf(output));
                lblResult.setEditable(false);

            } catch (ArithmeticException exc) {
                JOptionPane.showMessageDialog(null, "Invalid Input. Dividing by zero is not allowed.");
            } catch (NumberFormatException exc) {
                JOptionPane.showMessageDialog(null, "Input a number!");
            }
        });
    }
    public static void main(String[] args) {
        SimpleCalculator sc = new SimpleCalculator();
        sc.setTitle("Simple Calculator");
        sc.setContentPane(sc.pMain);
        sc.setSize(800, 150);
        sc.setDefaultCloseOperation(EXIT_ON_CLOSE);
        sc.setVisible(true);
    }
}
