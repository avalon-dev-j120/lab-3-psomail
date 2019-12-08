package windows;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Keyboard extends JFrame {

    private String strNumber;

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

    public JPanel getButtonCalcPanel(){

        JPanel buttonCalcPanel = new JPanel();
        buttonCalculate = new JButton("=");
        buttonCalculate.addActionListener(this::actionPerformed);
        buttonCalculate.setPreferredSize(new Dimension(200,50));
        buttonCalcPanel.setLayout(new BorderLayout());
        buttonCalcPanel.add(buttonCalculate, BorderLayout.CENTER);

        return buttonCalcPanel;
    }

    private void  formButton(JPanel buttonsPanel, JButton button, String typeButton){

        button = new JButton(typeButton);
        button.addActionListener(this::actionPerformed);
        setLayout(new BorderLayout());
        buttonsPanel.add(button,BorderLayout.CENTER);

    }

    public void actionPerformed(ActionEvent e){

        String  sym = e.getActionCommand();

        if (Character.isDigit(sym.charAt(0)) || sym.equals(buttonPoint.getActionCommand())){

            strNumber += sym;

   //         displayText.setText(displayText.getText() + e.getActionCommand());
        }

        System.out.println("test");
    }


}
