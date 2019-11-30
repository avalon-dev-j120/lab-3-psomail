package windows;

import javax.swing.*;
import java.awt.*;

public class RightPanel extends JPanel  {

    public RightPanel(){

        JSlider sliderRed = new JSlider(0,255,125);
        sliderRed.setMajorTickSpacing(25);
        sliderRed.setPaintTicks(true);
        sliderRed.setPaintLabels(true);

        JSlider sliderGreen = new JSlider(0,255,125);
        sliderGreen.setMajorTickSpacing(25);
        sliderGreen.setPaintTicks(true);
        sliderGreen.setPaintLabels(true);

        JSlider sliderBlue = new JSlider(0,255,125);
        sliderBlue.setMajorTickSpacing(25);
        sliderBlue.setPaintTicks(true);
        sliderBlue.setPaintLabels(true);

        setLayout(new BorderLayout());

        add(sliderRed, BorderLayout.NORTH);
        add(sliderGreen, BorderLayout.CENTER);
        add(sliderBlue, BorderLayout.SOUTH);

    }



}
