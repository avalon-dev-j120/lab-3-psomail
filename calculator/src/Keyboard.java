import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class  Keyboard extends JFrame {

    private static String strNumber = "";
    private static Double number1 = 0.0;
    private static String operation = "";
    private static boolean pointEnable = false;

    public JPanel getButtonsPanel() {

        JPanel buttonsPanel = new JPanel(new GridLayout(4,4, 5, 5));

        formButton(buttonsPanel,"7");
        formButton(buttonsPanel,"8");
        formButton(buttonsPanel,"9");
        formButton(buttonsPanel,"+");
        formButton(buttonsPanel,"4");
        formButton(buttonsPanel,"5");
        formButton(buttonsPanel,"6");
        formButton(buttonsPanel,"-");
        formButton(buttonsPanel,"1");
        formButton(buttonsPanel,"2");
        formButton(buttonsPanel,"3");
        formButton(buttonsPanel,"*");
        formButton(buttonsPanel,"CE");
        formButton(buttonsPanel,"0");
        formButton(buttonsPanel,".");
        formButton(buttonsPanel,"/");

        return buttonsPanel;
    }

    public JPanel getButtonCalcPanel(){
        JPanel buttonCalcPanel = new JPanel();
        JButton buttonCalculate = new JButton("=");
        buttonCalculate.addActionListener(this::actionPerformed);
        buttonCalculate.setPreferredSize(new Dimension(200,50));
        buttonCalcPanel.setLayout(new BorderLayout());
        buttonCalcPanel.add(buttonCalculate, BorderLayout.CENTER);

        return buttonCalcPanel;
    }

    private void formButton(JPanel buttonsPanel, String typeButton){
        JButton button = new JButton(typeButton);
        button.addActionListener(this::actionPerformed);
        setLayout(new BorderLayout());
        buttonsPanel.add(button,BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e){

        String  sym = e.getActionCommand();

        if (Character.isDigit(sym.charAt(0)) || (sym.equals(".") && !pointEnable)){

            if(operation.equals("+") || operation.equals("-") ||operation.equals("*") || operation.equals("/")) {
                if (!pointEnable) Display.setDisplayText(Display.displayText, "");
            }

            if(operation.equals("=")) {
                Display.setDisplayText(Display.displayText, "");
                strNumber = "";
                operation = "";
            }

            Display.setDisplayText(Display.displayText, Display.getDisplayText(Display.displayText) + e.getActionCommand());
            strNumber += sym;
            if(sym.equals(".")) pointEnable = true;
        }

        if( sym.equals("CE")){
            Display.setDisplayText(Display.displayText, "");
            strNumber = "";
            pointEnable = false;
        }

        if (sym.equals("+") || sym.equals("-") || sym.equals("*") || sym.equals("/")){
            if (!strNumber.equals("")) number1 = Double.parseDouble(strNumber);
            strNumber = "";
            operation = sym;
            pointEnable = false;
        }

        if (sym.equals("=")){
            number1 = Cpu.operation(number1, Double.parseDouble(strNumber), operation);
            strNumber = number1.toString();
            Display.setDisplayText(Display.displayText, strNumber);
            operation = sym;
            pointEnable = false;
            System.out.println(strNumber);
        }
    }
}
