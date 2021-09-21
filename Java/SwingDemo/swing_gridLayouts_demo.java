package SwingDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class swing_gridLayouts_demo
{
    public static void main(String[] args) throws InterruptedException, InvocationTargetException
    {
        SwingUtilities.invokeAndWait(()->new swing_gridLayouts(400,300));
    }
}

class swing_gridLayouts implements ActionListener
{
    int frameWidth , frameHeight;
    JFrame jFrame;
    JButton b1,b2;
    public swing_gridLayouts(int frameWidth , int frameHeight)
    {
        this.frameWidth = frameWidth;
        this.frameHeight = frameHeight;
        jFrame = new JFrame("Grid Layouts Demo");
        jFrame.setSize(frameWidth,frameHeight);

        /*
        //can also be used...
        GridLayout gridLayout = new GridLayout();
        gridLayout.setColumns(jFrame.getWidth()/40);
        gridLayout.setRows(jFrame.getHeight()/150);*/
        GridLayout gridLayout = new GridLayout(jFrame.getHeight()/150 ,jFrame.getWidth()/40);

        jFrame.setLayout(gridLayout);

        JLabel l1 = new JLabel("width : " + jFrame.getWidth());
        JLabel l2 = new JLabel("height :" + jFrame.getHeight());
        JLabel l3 = new JLabel("Label 3");
        JLabel l4 = new JLabel("Label 4");
        JLabel l5 = new JLabel("Label 5");
        JLabel l6 = new JLabel("Label 6");

        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");

        jFrame.add(l1);
        jFrame.add(l2);
        jFrame.add(l3);
        jFrame.add(l4);
        jFrame.add(l5);
        jFrame.add(l6);
        jFrame.add(b1);
        jFrame.add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource()==b1)
        {
            frameWidth = 800;
            frameHeight = 450;
            jFrame.setSize(frameWidth,frameHeight);
        }
        else if(actionEvent.getSource()==b2)
        {
            frameWidth = 400;
            frameHeight = 300;
            jFrame.setSize(frameWidth,frameHeight);
        }
    }
}
