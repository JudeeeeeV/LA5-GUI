package LeapYearCalculator;

import javax.swing.*;

public class LeapYr extends JFrame {


    private JPanel pMain;
    private JButton checkYearButton;
    private JTextField yearTextField;

    LeapYr() {


        checkYearButton.addActionListener(e -> {
            String input = yearTextField.getText().trim();

            if (input.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter a year.");
                return;
            }

            try {
                int year = Integer.parseInt(input);

                boolean isLeapYear = (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);

                String message = isLeapYear ? "Leap Year" : "Not a leap year";
                JOptionPane.showMessageDialog(null, message);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a year.");
            }



        });
    }
    public static void main(String[] args) {
        LeapYr ly = new LeapYr();
        ly.setTitle("Leap Year Checker");
        ly.setContentPane(ly.pMain);
        ly.setSize(300, 150);
        ly.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ly.setVisible(true);
    }


}
