package FoodOrderingSystem;

import javax.swing.*;

public class FoodOrderingSystem extends JFrame {

    private JPanel pMain;
    private JCheckBox cPizza;
    private JCheckBox cSundae;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JRadioButton rbNone;
    private JRadioButton rb5RadioButton;
    private JRadioButton rb10RadioButton;
    private JRadioButton rb15RadioButton;
    private JButton orderButton;

    FoodOrderingSystem() {
        double pizzaPrice = 100;
        double burgerPrice = 80;
        double friesPrice = 65;
        double softDrinksPrice = 55;
        double teaPrice = 50;
        double sundaePrice = 40;

        rbNone.setSelected(true);

        orderButton.addActionListener(e -> {
            double totalPrice = 0;

            if (cPizza.isSelected()) totalPrice += pizzaPrice;
            if (cBurger.isSelected()) totalPrice += burgerPrice;
            if (cFries.isSelected()) totalPrice += friesPrice;
            if (cSoftDrinks.isSelected()) totalPrice += softDrinksPrice;
            if (cTea.isSelected()) totalPrice += teaPrice;
            if (cSundae.isSelected()) totalPrice += sundaePrice;

            double discount = 0;
            if (rb5RadioButton.isSelected()) discount = 0.05;
            else if (rb10RadioButton.isSelected()) discount = 0.10;
            else if (rb15RadioButton.isSelected()) discount = 0.15;

            totalPrice -= totalPrice * discount;

            JOptionPane.showMessageDialog(null, String.format("The total price is Php %.2f", totalPrice));
        });
    }


    public static void main(String[] args) {
        FoodOrderingSystem fos = new FoodOrderingSystem();
        fos.setTitle("Food Ordering System");
        fos.setContentPane(fos.pMain);
        fos.setSize(600, 400);
        fos.setDefaultCloseOperation(EXIT_ON_CLOSE);
        fos.setVisible(true);
    }
}
