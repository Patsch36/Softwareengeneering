// package counter;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.EventQueue;

public class Counter extends JFrame{

    public Counter(){
        setTitle("Counter");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container pane = getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);

        JButton button = new JButton("Quit");
        button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        gl.setHorizontalGroup(gl.createSequentialGroup().addComponent(button));
        gl.setVerticalGroup(gl.createSequentialGroup().addComponent(button));
        gl.setAutoCreateContainerGaps(true);
    }
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                Counter count = new Counter();
                count.setVisible(true);
            }
        }); 
    }
}
