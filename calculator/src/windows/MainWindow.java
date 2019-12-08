package windows;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame implements ActionListener  {

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

    JTextField displayText;

    private String str;
    private Double num;
    Boolean operationEnable;
    String operation;


    public MainWindow(){

        str = "";
        operationEnable = false;
        operation = "";

        mainwindow= this;

        setTitle("Calculator");
        setSize(270,330);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel display = new JPanel();
        displayText = new JTextField();
        displayText.setPreferredSize(new Dimension(250,50));
        displayText.setFont(new Font("Dialog", Font.PLAIN, 20));
        display.setLayout(new BorderLayout());
        display.add(displayText, BorderLayout.CENTER);


 /*       JPanel buttons = new JPanel(new GridLayout(4,4, 5, 5));
        button0 = new JButton("0");
        button0.addActionListener(this::actionPerformed);
        button1 = new JButton("1");
        button1.addActionListener(this::actionPerformed);
        button2 = new JButton("2");
        button2.addActionListener(this::actionPerformed);
        button3 = new JButton("3");
        button3.addActionListener(this::actionPerformed);
        button4 = new JButton("4");
        button4.addActionListener(this::actionPerformed);
        button5 = new JButton("5");
        button5.addActionListener(this::actionPerformed);
        button6 = new JButton("6");
        button6.addActionListener(this::actionPerformed);
        button7 = new JButton("7");
        button7.addActionListener(this::actionPerformed);
        button8 = new JButton("8");
        button8.addActionListener(this::actionPerformed);
        button9 = new JButton("9");
        button9.addActionListener(this::actionPerformed);
        buttonCE = new JButton("CE");
        buttonCE.addActionListener(this::actionPerformed);
        buttonPlus = new JButton("+");
        buttonPlus.addActionListener(this::actionPerformed);
        buttonMinus = new JButton("-");
        buttonMinus.addActionListener(this::actionPerformed);
        buttonDev = new JButton("*");
        buttonDev.addActionListener(this::actionPerformed);
        buttonSplitUp = new JButton("/");
        buttonSplitUp.addActionListener(this::actionPerformed);
        buttonPoint = new JButton(".");
        buttonPoint.addActionListener(this::actionPerformed);

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
        buttons.add(buttonSplitUp,BorderLayout.CENTER);*/

      /*
        JPanel buttonCalc = new JPanel();
        buttonCalculate = new JButton("=");
        buttonCalculate.addActionListener(this::actionPerformed);
        buttonCalc.setLayout(new BorderLayout());
        buttonCalc.add(buttonCalculate, BorderLayout.CENTER);
        buttonCalculate.setPreferredSize(new Dimension(200,50));*/


        add(display, BorderLayout.NORTH);

        add(new Keyboard().getButtonsPanel(), BorderLayout.CENTER);
        add(new Keyboard().getButtonCalcPanel(), BorderLayout.SOUTH);

     /*   add(buttons, BorderLayout.CENTER);
        add(buttonCalcPanel, BorderLayout.SOUTH);*/


        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {


        char but = e.getActionCommand().charAt(0);

      /*  if(!e.getActionCommand().equals(buttonCE.getActionCommand())    &&
           !e.getActionCommand().equals(buttonPlus.getActionCommand())  &&
           !e.getActionCommand().equals(buttonMinus.getActionCommand()) &&
           !e.getActionCommand().equals(buttonDev.getActionCommand())   &&
           !e.getActionCommand().equals(buttonSplitUp.getActionCommand()) &&
           !e.getActionCommand().equals(buttonCalculate.getActionCommand())){*/

      if (Character.isDigit(but) || e.getActionCommand().equals(buttonPoint.getActionCommand())){


            str += e.getActionCommand();

            displayText.setText(displayText.getText() + e.getActionCommand());
        }

        if( e.getActionCommand().equals(buttonCE.getActionCommand())){

            displayText.setText("");
            str = "";
            num = 0.0;
        }

        if (e.getActionCommand().equals(buttonPlus.getActionCommand())){

            num = Double.parseDouble(str);
            str = "";
            operation = "+";
            displayText.setText("");
        }

        if (e.getActionCommand().equals(buttonMinus.getActionCommand())){

            num = Double.parseDouble(str);
            str = "";
            operation = "-";
            displayText.setText("");
        }

        if (e.getActionCommand().equals(buttonDev.getActionCommand())){

            num = Double.parseDouble(str);
            str = "";
            operation = "*";
            displayText.setText("");
        }

        if (e.getActionCommand().equals(buttonSplitUp.getActionCommand())){

            num = Double.parseDouble(str);
            str = "";
            operation = "/";
            displayText.setText("");
        }

        if (e.getActionCommand().equals(buttonCalculate.getActionCommand())){

            this.operation(str, operation);
            str = num.toString();
        }

    }

    public void operation (String str, String operation){

        switch (operation){

            case "+":
                num = num + Double.parseDouble(str);
                break;

            case "-":
                num = num - Double.parseDouble(str);
                break;

            case "*":
                num = num * Double.parseDouble(str);
                break;

            case "/":
                num = num / Double.parseDouble(str);
                break;

        }

        displayText.setText("" + num);

    }


    public static MainWindow getInstance(){

        if(mainwindow != null) return mainwindow;
        else return new MainWindow();
    }


}
