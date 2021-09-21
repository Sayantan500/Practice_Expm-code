package SwingDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swing_event_demo
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("Main thread...");
        SwingUtilities.invokeAndWait(()->{
            System.out.println("Inside invokeAndWait...");
            new swing_event();
        });
        System.out.println("Returned to Main thread...");
    }
}

class swing_event
{
    public swing_event()
    {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("Swing Events Demo");
        jFrame.setLayout(new FlowLayout());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(400,500);

        JLabel jLabel = new JLabel();
        jFrame.add(jLabel);

        JButton jButton_HI = new JButton();
        jButton_HI.setSize(100,50);
        jButton_HI.setText("HI");

        JButton jButton_Bye = new JButton();
        jButton_Bye.setSize(100,50);
        jButton_Bye.setText("Bye");

        jFrame.add(jButton_Bye);
        jFrame.add(jButton_HI);

        jButton_HI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("\nHi button clicked..");
                jLabel.setText("Hi...Event done...");
            }
        });


        jButton_Bye.addActionListener(e -> {
            System.out.println("\nBye button clicked..");
            jLabel.setText("Bye...Event done...");
            System.exit(0);
        });

        jFrame.setVisible(true);
    }
}