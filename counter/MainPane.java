package counter;


import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
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

        this.countLable = new JLabel("Actual Count : 0");
        add(countLable, gbc);

        JButton increase = new JButton("Increase");
        add(increase, gbc);

        increase.addActionListener(e->disp.notifyObserver(Events.INCREASE));

        JButton decrease = new JButton("Decrease");
        add(decrease, gbc);

        decrease.addActionListener(e->disp.notifyObserver(Events.DECREASE));
    }

    public void changeCountLable(int number){
        this.countLable.setText("Actual Count: " + Integer.toString(number));
    }

}