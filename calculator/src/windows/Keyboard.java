package windows;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Keyboard extends JFrame {

    private JButton buttonCalculate;
    private JButton button0;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton buttonCE;
    private JButton buttonPlus;
    private JButton buttonMinus;
    private JButton buttonDev;
    private JButton buttonSplitUp;
    private JButton buttonPoint;

    //public Keyboard() {}

        public JPanel getButtonsPanel() {

        JPanel buttonsPanel = new JPanel(new GridLayout(4,4, 5, 5));

        formButton(buttonsPanel, button7, "7");
        formButton(buttonsPanel, button8, "8");
        formButton(buttonsPanel, button9, "9");
        formButton(buttonsPanel, buttonPlus, "+");
        formButton(buttonsPanel, button4, "4");
        formButton(buttonsPanel, button5, "5");
        formButton(buttonsPanel, button6, "6");
        formButton(buttonsPanel, buttonMinus, "-");
        formButton(buttonsPanel, button1, "1");
        formButton(buttonsPanel, button2, "2");
        formButton(buttonsPanel, button3, "3");
        formButton(buttonsPanel, buttonDev, "*");
        formButton(buttonsPanel, buttonCE, "CE");
        formButton(buttonsPanel, button0, "0");
        formButton(buttonsPanel, buttonPoint, ".");
        formButton(buttonsPanel, buttonSplitUp, "/");

        return buttonsPanel;
    }

    public void  formButton(JPanel buttons, JButton button, String typeButton){

        button = new JButton(typeButton);
        setLayout(new BorderLayout());
        buttons.add(button,BorderLayout.CENTER);

    }


}
