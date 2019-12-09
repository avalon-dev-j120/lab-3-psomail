import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame  {

    public static MainWindow mainwindow = null;

    public MainWindow(){

        mainwindow= this;

        setTitle("Calculator");
        setSize(270,330);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(Display.getDisplayPanel(), BorderLayout.NORTH);
        add(new Keyboard().getButtonsPanel(), BorderLayout.CENTER);
        add(new Keyboard().getButtonCalcPanel(), BorderLayout.SOUTH);

        setVisible(true);
    }

    public static MainWindow getInstance(){

        if(mainwindow != null) return mainwindow;
        else return new MainWindow();
    }
}
