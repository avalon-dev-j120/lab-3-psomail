package windows;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    private static class Constants {

        static final int WIDTH = 400;
        static final int HEIGHT = 300;

    }

    private JButton top;
    private JButton left;
    private JButton right;
    private JButton bottom;
    private JButton center;

    public MainWindow(){

        setTitle("Color picker");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(Constants.WIDTH, Constants.HEIGHT );
        setLocationByPlatform(true);
      //  setResizable(false);

     //   setLayout(null); отключение енеджера компановки и настройка всех параметров самостоятельно


        top = new JButton("top");
        left = new JButton("left");
        right = new JButton("right");
        bottom = new JButton("bottom");
        center = new JButton("center");

   //     button.setSize(100,30);
   //     button.setLocation(50,50);

        add(top, BorderLayout.NORTH);
        add(left, BorderLayout.WEST);
        add(right, BorderLayout.EAST);
        add(bottom, BorderLayout.SOUTH);
        add(center, BorderLayout.CENTER);


    }

}
