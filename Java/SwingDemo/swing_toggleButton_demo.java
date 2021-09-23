package SwingDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class swing_toggleButton_demo extends JFrame
{
    public static void main(String[] args) {
        new swing_toggleButton_demo();
    }

    public swing_toggleButton_demo() {
        setTitle("Swing Toggle Button Demo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,200);
        setLayout(new GridLayout(2,0));

        JLabel l1 = new JLabel(),l2 = new JLabel();

        JToggleButton jToggleButton1 = new JToggleButton("Toggle Button",true);

        l1.setText("Using ActionListener -> ");
        add(l1);
        l1.setHorizontalAlignment(SwingConstants.CENTER);
        jToggleButton1.setHorizontalAlignment(SwingConstants.CENTER);
        add(jToggleButton1);

        jToggleButton1.addActionListener(e -> {
            if(jToggleButton1.isSelected())
            {
                jToggleButton1.setText("ON");
                System.out.println("[ActionListen] Selected");
            }
            else
            {
                jToggleButton1.setText("OFF");
                System.out.println("[ActionListen] Deselected");
            }
        });

        l2.setText("Using ItemListener -> ");
        l2.setHorizontalAlignment(SwingConstants.CENTER);
        add(l2);

        JToggleButton jToggleButton2 = new JToggleButton("Toggle Button",false);
        jToggleButton2.setHorizontalAlignment(SwingConstants.CENTER);
        add(jToggleButton2);
        jToggleButton2.addItemListener(e -> {
            if(e.getSource() == jToggleButton2)
            {
                if(e.getStateChange() == ItemEvent.SELECTED)
                {
                    jToggleButton2.setText("ON");
                    System.out.println("[ItemListener] Selected");
                }
                else
                {
                    jToggleButton2.setText("OFF");
                    System.out.println("[ItemListener] Deselected");
                }
            }
        });

        setVisible(true);
    }
}
