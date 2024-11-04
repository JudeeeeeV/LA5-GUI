package LeapYearCalculator;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYr extends JFrame {


    private JPanel pMain;
    private JButton checkYearButton;
    private JTextField yearTextField;

    LeapYr() {
        checkYearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = yearTextField.getText();

                int year = Integer.parseInt(input);
                boolean isLeapYear;



                isLeapYear = (year % 4 == 0);

                isLeapYear = isLeapYear && (year % 100 != 0 || year % 400 == 0);

                if (isLeapYear) {
                    JOptionPane.showMessageDialog(null, "Leap Year");
                } else {
                    JOptionPane.showMessageDialog(null, "Not a leap year");
                }
            }
        });
    }
    public static void main(String[] args) {
        LeapYr s = new LeapYr();
        s.setTitle("Leap Year Checker");
        s.setContentPane(s.pMain);
        s.setSize(300, 150);
        s.setDefaultCloseOperation(EXIT_ON_CLOSE);
        s.setVisible(true);
    }


}
