import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Display {

    public  static JLabel displayText;

        public JPanel getDisplayPanel() {

        JPanel displayPanel = new JPanel();

        displayText = new JLabel(" ");
        displayText.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 35));
        displayText.setAlignmentX(Label.RIGHT);



        displayPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        displayPanel.add( this.displayText, BorderLayout.CENTER);


        displayText.addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent e) {
                System.out.println("1111111");
            }

        });


        return displayPanel;
    }

    public static String getDisplayText(JLabel displayText){
        return displayText.getText();
    }

    public static void setDisplayText(String text){
        displayText.setText(text);
    }
}

