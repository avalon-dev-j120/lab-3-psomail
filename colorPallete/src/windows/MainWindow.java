package windows;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame implements ActionListener {


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
               label.setText("Нажата ижняя кнопка");
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


}
