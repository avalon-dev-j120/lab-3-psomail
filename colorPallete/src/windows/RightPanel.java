package windows;

import javax.swing.*;
import java.awt.*;

public class RightPanel extends JPanel  {

    public RightPanel(){

        JSlider sliderRed = new JSlider(0,255,125);
        sliderRed.setName("Red");

        sliderRed.setMajorTickSpacing(25);
        sliderRed.setPaintTicks(true);
        sliderRed.setPaintLabels(true);
        sliderRed.addChangeListener(MainWindow.mainwindow);

        JSlider sliderGreen = new JSlider(0,255,125);
        sliderGreen.setName("Green");
        sliderGreen.setMajorTickSpacing(25);
        sliderGreen.setPaintTicks(true);
        sliderGreen.setPaintLabels(true);
        sliderGreen.addChangeListener(MainWindow.mainwindow);

        JSlider sliderBlue = new JSlider(0,255,125);
        sliderBlue.setName("Blue");
        sliderBlue.setMajorTickSpacing(25);
        sliderBlue.setPaintTicks(true);
        sliderBlue.setPaintLabels(true);
        sliderBlue.addChangeListener(MainWindow.mainwindow);

        setLayout(new BorderLayout());

        add(sliderRed, BorderLayout.NORTH);
        add(sliderGreen, BorderLayout.CENTER);
        add(sliderBlue, BorderLayout.SOUTH);

    }



}
