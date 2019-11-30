package windows;

import javax.swing.*;
import java.awt.*;

public class RightPanel extends JPanel  {

    private JPanel sliderPanel;


    public RightPanel(){

        sliderPanel = new JPanel();
        sliderPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        JSlider slider = new JSlider();
        addSlider(slider, "Test");
        add(sliderPanel, BorderLayout.NORTH);

        slider = new JSlider();
                addSlider(slider, "Test2");
    //    add(sliderPanel, BorderLayout.CENTER);

 /*       JSlider sliderRed = new JSlider(0,255,125);
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
        add(sliderBlue, BorderLayout.SOUTH);*/




    }
    public void addSlider(JSlider slider, String description){

        slider.setMajorTickSpacing(25);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.addChangeListener(MainWindow.mainwindow);

        JPanel panel = new JPanel();
        panel.add(slider);
        panel.add(new JLabel(description));
        sliderPanel.add(panel);


    }




}
