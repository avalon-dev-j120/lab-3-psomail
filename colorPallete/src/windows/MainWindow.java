package windows;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame implements ChangeListener {

    public static MainWindow mainwindow = null;
    private static ColorBox  colorBox = null;
    private static RightPanel rightPanel= null;
    private static int colorRed = 125;
    private static int colorGreen = 125;
    private static int colorBlue = 125;

    public MainWindow() {

        mainwindow= this;

        setTitle("Color Chooser");
        setSize(500,200);

        this.setLayout(new GridLayout(1,2)); // делим окно на две части
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        colorBox = new ColorBox();
        Color color = new Color(colorRed, colorGreen, colorBlue);
        colorBox.setBackground(color);
        colorBox.setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, new Color(240,240,240)));

        rightPanel= new RightPanel();
        rightPanel.setBackground(new Color(240,240,240));
        rightPanel.setBorder(BorderFactory.createEmptyBorder(15, 10, 15, 10));

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
        //colorBox.add(new JLabel(sliderName));

       switch (sliderName) {

           case "Red": colorRed = slider.getValue();
            break;

           case "Green": colorGreen = slider.getValue();
               break;

           case "Blue": colorBlue = slider.getValue();
               break;

               default:
                   System.out.println("Какой-то левый слайдер: " + sliderName);
       }

       Color color = new Color(colorRed, colorGreen, colorBlue);

       colorBox.setBackground(color);

    }
}

/*
    JLabel label;

private static class Constants {

    static final int WIDTH = 500;
    static final int HEIGHT = 200;

}

    private JButton top;
    private JButton left;
    private JButton right;
    private JButton bottom;
    private JButton center;

    @Override
    public void actionPerformed(ActionEvent ae){

        String command = ae.getActionCommand();
        label.setText("нажали");
        switch (command){
            case "top":
                label.setText("Нажата верхняя кнопка");
                break;
            case "bottom":
                label.setText("Нажата нижняя кнопка");
                break;
            default:
                label.setText("не вкурсе что нажато");
        }

    }

   public MainWindow(){

        setTitle("Color picker");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(Constants.WIDTH, Constants.HEIGHT );
        setLocationByPlatform(true);
        top = new JButton("top");
        //  setResizable(false);

        //   setLayout(null); отключение менеджера компановки и настройка всех параметров самостоятельно

        LayoutManager layoutManager = new FlowLayout();
        setLayout(layoutManager);

        top = new JButton("top");
        top.addActionListener(this);
        top.setActionCommand("top");

        bottom = new JButton("bottom")
        bottom.addActionListener(this);
        bottom.setActionCommand("bottom");


//        right = new JButton("right");
//        bottom = new JButton("bottom");
//        center = new JButton("center");
        //       left = new JButton("left");
        //     button.setSize(100,30);
        //     button.setLocation(50,50);

        add(top, BorderLayout.NORTH);
        //       add(left, BorderLayout.WEST);
//        add(right, BorderLayout.EAST);

        add(bottom, BorderLayout.SOUTH);
        //       add(center, BorderLayout.CENTER);

        label = new Label("ен нажата", JLabel.CENTER);

        add(label, BorderLayout.CENTER);



        setVisible(True);


    }
    public static MainWindow getInstance(){
        return new MainWindow();
    }


}*/

