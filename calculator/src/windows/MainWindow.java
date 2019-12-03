package windows;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class MainWindow extends JFrame implements ChangeListener {

    public static MainWindow mainwindow = null;

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

    public MainWindow(){

        mainwindow= this;

        setTitle("Calculator");
        setSize(300,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel display = new JPanel();







        JPanel buttons = new JPanel();
        buttons.setLayout(new GridLayout(4,4));
        button0 = new JButton("0");
        button0.setBorder((BorderFactory.createEmptyBorder(3, 3, 3, 3)));
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        buttonCE = new JButton("CE");
        buttonPlus = new JButton("+");
        buttonMinus = new JButton("-");
        buttonDev = new JButton("*");
        buttonSplitUp = new JButton("/");
        buttonPoint = new JButton(".");
        setLayout(new BorderLayout());
        buttons.add(button7,BorderLayout.CENTER);
        buttons.add(button8,BorderLayout.CENTER);
        buttons.add(button9,BorderLayout.CENTER);
        buttons.add(buttonPlus,BorderLayout.CENTER);
        buttons.add(button4,BorderLayout.CENTER);
        buttons.add(button5,BorderLayout.CENTER);
        buttons.add(button6,BorderLayout.CENTER);
        buttons.add(buttonMinus,BorderLayout.CENTER);
        buttons.add(button1,BorderLayout.CENTER);
        buttons.add(button2,BorderLayout.CENTER);
        buttons.add(button3,BorderLayout.CENTER);
        buttons.add(buttonDev,BorderLayout.CENTER);
        buttons.add(buttonCE,BorderLayout.CENTER);
        buttons.add(button0,BorderLayout.CENTER);
        buttons.add(buttonPoint,BorderLayout.CENTER);
        buttons.add(buttonSplitUp,BorderLayout.CENTER);

        JPanel buttonCalc = new JPanel();
        buttonCalculate = new JButton("=");
        buttonCalc.setLayout(new BorderLayout());
        buttonCalc.add(buttonCalculate, BorderLayout.CENTER);

        setLayout(new BorderLayout());
        add(display, BorderLayout.NORTH);
        add(buttons, BorderLayout.CENTER);
        add(buttonCalc, BorderLayout.SOUTH);


        setVisible(true);
    }

    public static MainWindow getInstance(){

        if(mainwindow != null) return mainwindow;
        else return new MainWindow();
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {

    }
}
