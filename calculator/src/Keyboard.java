import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class  Keyboard extends JFrame {

    private static String strNumber = "";
    private static Double number1 = 0.0;
    private static String operation = "";
    private static boolean pointEnable = false;
    private KeyListener key;

    private Toolkit toolkit = Toolkit.getDefaultToolkit();
    private Clipboard clipboard = toolkit.getSystemClipboard();
    private StringSelection selection;


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
        button.setFont(new Font("Arial", Font.BOLD, 18));
      //  button.setBorder(new RoundedBorder(10));
        button.addActionListener(this::actionPerformed);
       // button.addKeyListener(key);

  /*      button.addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent e) {
                System.out.println("dfgdfg");
            }

        });*/
        setLayout(new BorderLayout());
        buttonsPanel.add(button,BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e){



        String  sym = e.getActionCommand();

        if (Character.isDigit(sym.charAt(0)) || (sym.equals(".") && !pointEnable)){

            if(sym.equals(".")) pointEnable = true;

            if((operation.equals("+") || operation.equals("-") ||operation.equals("*") || operation.equals("/")) && !pointEnable && strNumber.equals("")) {
                Display.setDisplayText("");
            }

            if(operation.equals("=")) {
                Display.setDisplayText("");
                strNumber = "";
                operation = "";
            }

            Display.setDisplayText(Display.getDisplayText(Display.displayText) + e.getActionCommand());


            strNumber += sym;
        }

        if( sym.equals("CE") || (strNumber.equals("error") && (sym.equals("=") || sym.equals("+") || sym.equals("-") || sym.equals("*") || sym.equals("/")))){
            Display.setDisplayText("");
            strNumber = "";
            pointEnable = false;
            number1 = 0.0;
            operation = "";
        }

        if (sym.equals("+") || sym.equals("-") || sym.equals("*") || sym.equals("/")){
            if (!strNumber.equals("")) number1 = Double.parseDouble(strNumber);
            strNumber = "";
            operation = sym;
            pointEnable = false;
        }

        if (sym.equals("=") && !operation.equals("") && !strNumber.equals("") && !operation.equals("=")) {
            strNumber = Cpu.operation(number1, Double.parseDouble(strNumber), operation);

            selection = new StringSelection(strNumber);
            clipboard.setContents(selection, selection);

            Display.setDisplayText(strNumber);
            operation = sym;
            pointEnable = false;
            number1 = 0.0;

         }
    }
}
