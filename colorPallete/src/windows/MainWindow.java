package windows;

import javax.swing.*;

public class MainWindow extends JFrame {

    private static class Constants {

        static final int WIDTH = 300;
        static final int HEIGHT = 300;

    }

    private JButton button;

    public MainWindow(){

        setTitle("Color picker");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(Constants.WIDTH, Constants.HEIGHT );
        setLocationByPlatform(true);
      //  setResizable(false);

        button = new JButton("Push me");

       add(button);
    }

}
