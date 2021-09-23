package SwingDemo;

import javax.swing.*;
import java.awt.*;

public class swing_GridBagLayouts_demo
{
    public static void main(String[] args) {
        new swing_GridBagLayouts();
    }
}

class swing_GridBagLayouts
{
    JFrame jFrame;
    JLabel l1,l2,l3,l4;
    JButton b1,b2,b3;

    public swing_GridBagLayouts() //dynamic rows and columns
    {
        jFrame = new JFrame("GridBagLayouts Demo");
        jFrame.setSize(400,300);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("Label 1");
        l2 = new JLabel("Label 2");
        l3 = new JLabel("Label 3");
        l4 = new JLabel("Label 4");

        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        b3 = new JButton("Button 3");

        GridBagLayout gridBagLayout = new GridBagLayout();

        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridwidth = 200;
        gridBagConstraints.gridheight = 100;

        jFrame.setLayout(gridBagLayout);

        gridBagConstraints.fill = GridBagConstraints.BOTH;

        gridBagConstraints.weightx = 1.5;
        gridBagLayout.setConstraints(b1,gridBagConstraints);

        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
        gridBagLayout.setConstraints(b2,gridBagConstraints);

        gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
        gridBagConstraints.weightx = 1.0;
        gridBagLayout.setConstraints(b3,gridBagConstraints);

        jFrame.add(b1);
        jFrame.add(b2);
        jFrame.add(b3);

        //weightx -> 1.0 set above..the latest value of weightx.
        gridBagConstraints.gridwidth = GridBagConstraints.HORIZONTAL;
        gridBagLayout.setConstraints(l1,gridBagConstraints);
        gridBagLayout.setConstraints(l2,gridBagConstraints);

        gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
        gridBagLayout.setConstraints(l3,gridBagConstraints);

        gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
        gridBagConstraints.weightx = 0.0;
        gridBagLayout.setConstraints(l4,gridBagConstraints);

        jFrame.add(l1);
        jFrame.add(l2);
        jFrame.add(l3);
        jFrame.add(l4);

        jFrame.setVisible(true);
    }
}
