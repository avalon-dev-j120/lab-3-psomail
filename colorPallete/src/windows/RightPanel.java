package windows;

import javax.swing.*;
import java.awt.*;
import java.util.Hashtable;

public class RightPanel extends JPanel  {

    public RightPanel(){

        JPanel panelRed = new JPanel();
        formPanel(panelRed, "Red");

        JPanel panelGreen = new JPanel();
        formPanel(panelGreen, "Green");

        JPanel panelBlue = new JPanel();
        formPanel(panelBlue, "Blue");

        setLayout(new BorderLayout());
        add(panelRed, BorderLayout.NORTH);
        add(panelGreen, BorderLayout.CENTER);
        add(panelBlue, BorderLayout.SOUTH);
    }

    public void formPanel(JPanel panel, String description){

        JSlider slider = new JSlider(0,255,125);
        slider.setName(description);
        slider.setMajorTickSpacing(25);
        slider.setPaintTicks(true);
        Hashtable<Integer, Component> labelTable = new Hashtable<>();
        labelTable.put(0, new JLabel("0"));
        labelTable.put(255, new JLabel("255"));
        slider.setLabelTable(labelTable);
        slider.setPaintLabels(true);
        slider.addChangeListener(MainWindow.mainwindow);

        panel.setLayout(new BorderLayout());
        panel.add(new JLabel(description + ":"),BorderLayout.WEST);
        panel.add(slider, BorderLayout.CENTER);
    }
}