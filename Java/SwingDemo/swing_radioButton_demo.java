package SwingDemo;

import javax.swing.*;
import java.awt.*;

public class swing_radioButton_demo
{
    public static void main(String[] args)throws Exception {
        SwingUtilities.invokeAndWait(swing_radioButton_demo::new);
    }

    public swing_radioButton_demo()
    {
        JFrame jFrame = new JFrame("Swing Radio Buttons Demo");
        jFrame.setSize(600,350);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout gridLayout = new GridLayout();
        gridLayout.setRows(8);
        jFrame.setLayout(gridLayout);

        //all the buttons are separate entity...
        //i.e. multiple buttons of the same type can be selected
        JLabel jLabel = new JLabel();
        jLabel.setText("Separate Entities..Multiple radio buttons can be selected...");

        JRadioButton jRadioButton1 = new JRadioButton("Radio Button 1");
        JRadioButton jRadioButton2 = new JRadioButton("Radio Button 2");
        JRadioButton jRadioButton3 = new JRadioButton("Radio Button 3");

        jFrame.add(jLabel);
        jFrame.add(jRadioButton1);
        jFrame.add(jRadioButton2);
        jFrame.add(jRadioButton3);

        //creates a set of mutually exclusive buttons...
        //i.e. only one button can be selected out of the set
        jLabel = new JLabel();
        jLabel.setText("Mutually exclusive set of radio button...Only one radio button can be selected...");

        jRadioButton1 = new JRadioButton("Radio Button 1");
        jRadioButton2 = new JRadioButton("Radio Button 2");
        jRadioButton3 = new JRadioButton("Radio Button 3");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(jRadioButton1);
        buttonGroup.add(jRadioButton2);
        buttonGroup.add(jRadioButton3);

        jFrame.add(jLabel);
        jFrame.add(jRadioButton1);
        jFrame.add(jRadioButton2);
        jFrame.add(jRadioButton3);

        jFrame.setVisible(true);


    }
}
