import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainWindow extends JFrame  {

    public static MainWindow mainwindow = null;

    private static final int widthDefaultWindow = 300;
    private static final int heightDefaultWindow = 420;

    public MainWindow(){
        LayoutManager lm = new GridBagLayout();
        GridBagConstraints rootConstraints = new GridBagConstraints();
        mainwindow= this;

        setTitle("Calculator");
        setIconImage(new ImageIcon("icon.png").getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(widthDefaultWindow,heightDefaultWindow);
        setMinimumSize(new Dimension(260, 300));
        setMaximumSize(new Dimension(350, 450)); // разобраться
        setLocationByPlatform(true);

        addWindowStateListener(new WindowAdapter() {
            @Override
            public void windowStateChanged(WindowEvent e) {
                if (e.getNewState() == JFrame.MAXIMIZED_BOTH) {
                    setExtendedState(JFrame.NORMAL);
                }
            }
        });

        getRootPane().setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

     // setLayout(new GridBagLayout());


        rootConstraints.anchor = GridBagConstraints.CENTER;
        rootConstraints.fill = GridBagConstraints.BOTH;
        rootConstraints.insets = new Insets(5, 5, 5, 5);
        rootConstraints.gridx = 0;
        rootConstraints.gridy = 0;
        rootConstraints.weightx = 1;
        rootConstraints.weighty = 0;

        add(new Display().getDisplayPanel(), BorderLayout.NORTH);
        add(new Keyboard().getButtonsPanel(), BorderLayout.CENTER);
        add(new Keyboard().getButtonCalcPanel(), BorderLayout.SOUTH);

        setVisible(true);
    }

    public static MainWindow getInstance(){

        if(mainwindow != null) return mainwindow;
        else return new MainWindow();
    }
}
