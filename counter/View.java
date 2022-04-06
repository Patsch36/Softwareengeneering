/**
 * view
 */

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;  
// import java.awt.*;
// import java.awt.event.*;
// import javax.swing.*;
// import javax.swing.event.*;


public class View {

    private EventDispatcher disp;
    private int count;
    public static MainPane mainpane;

    public View(EventDispatcher dispatcher ) {

        this.count = 0;

        this.disp = dispatcher;
        View.mainpane = new MainPane(this.disp);

        EventQueue.invokeLater(new Runnable() {


            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    ex.printStackTrace();
                }

                JFrame frame = new JFrame("Counter");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(View.mainpane);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

    public void changeCount(Events e){
        if (e == Events.INCREASE){
            this.count += 1;
        }
        if (e == Events.DECREASE){
            this.count -= 1;
        }

        View.mainpane.changeCount(this.count);
    }

    public class MainPane extends JPanel {

        private JLabel countLable;

        public MainPane(EventDispatcher dispatcher) {
            EventDispatcher disp = dispatcher;

            setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridwidth = GridBagConstraints.REMAINDER; // This is a trick
            gbc.fill = GridBagConstraints.HORIZONTAL;
            JPanel thePanel = new JPanel();
            this.add(thePanel);

            this.countLable = new JLabel("Actual Count");
            add(countLable, gbc);

            JButton increase = new JButton("Increase");
            add(increase, gbc);

            increase.addActionListener(e->disp.notifyObserver(Events.INCREASE));

            JButton decrease = new JButton("Decrease");
            add(decrease, gbc);

            decrease.addActionListener(e->disp.notifyObserver(Events.DECREASE));
        }

        public void changeCount(int number){
            this.countLable.setText("Actual Count: " + Integer.toString(number));
        }

    }
}
