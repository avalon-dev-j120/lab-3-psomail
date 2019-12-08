import javax.swing.*;
import java.awt.*;


public class Display {

    public static JTextField displayText;

    public JPanel getDisplayPanel() {

        JPanel displayPanel = new JPanel();
        displayText = new JTextField();
        displayText.setPreferredSize(new Dimension(250,50));
        displayText.setFont(new Font("Dialog", Font.PLAIN, 20));
        displayPanel.setLayout(new BorderLayout());
        displayPanel.add(displayText, BorderLayout.CENTER);

        return displayPanel;
    }

    public static String getDisplayText(JTextField displayText){
        return displayText.getText();
    }

    public static void setDisplayText( JTextField displayText, String text){
        displayText.setText(text);
    }
}

