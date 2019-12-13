package windows;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class MainWindow extends JFrame implements ChangeListener {

    public static MainWindow mainwindow = null;
    private static ColorBox  colorBox = null;
    private static RightPanel rightPanel= null;
    private static int colorRed = 125;
    private static int colorGreen = 125;
    private static int colorBlue = 125;

    private Toolkit toolkit = Toolkit.getDefaultToolkit();
    private Clipboard clipboard = toolkit.getSystemClipboard();
    private String hexRGB;
    private StringSelection selection;

    public MainWindow() {

        mainwindow= this;

        setTitle("Color Picker");
        setSize(600,325);

        this.setLayout(new GridLayout(1,2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        getRootPane().setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        colorBox = new ColorBox();
        Color color = new Color(colorRed, colorGreen, colorBlue);
        colorBox.setBackground(color);
        colorBox.setToolTipText("#7d7d7d");

        rightPanel= new RightPanel();
        rightPanel.setBackground(new Color(240,240,240));
        rightPanel.setBorder(BorderFactory.createEmptyBorder(25, 25, 25, 10));

        add(colorBox);
        add(rightPanel);
        setVisible(true);
    }

    public static MainWindow getInstance(){

        if(mainwindow != null) return mainwindow;
        else return new MainWindow();
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {

        JSlider slider = (JSlider) changeEvent.getSource();
        String sliderName = slider.getName();

       switch (sliderName) {

           case "Red": colorRed = slider.getValue();
                break;

           case "Green": colorGreen = slider.getValue();
               break;

           case "Blue": colorBlue = slider.getValue();
               break;
       }

       Color color = new Color(colorRed, colorGreen, colorBlue);
       hexRGB = String.format("#%02x%02x%02x", colorRed, colorGreen, colorBlue);
       selection = new StringSelection(hexRGB);
       clipboard.setContents(selection, selection);
       colorBox.setToolTipText(hexRGB);
       colorBox.setBackground(color);
    }
}