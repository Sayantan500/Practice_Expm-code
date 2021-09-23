package SwingDemo;

import javax.swing.*;
import java.awt.*;

public class swing_checkBox_demo extends JFrame
{
    public static void main(String[] args) {
        new swing_checkBox_demo();
    }

    public swing_checkBox_demo()
    {
        setTitle("Swing CheckBox Demo");
        setSize(600,375);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setVisible(true); //if used here shows blank rendering initially

        GridLayout gridLayout = new GridLayout(8,0);
        setLayout(gridLayout);

        //all the buttons are separate entity...
        //i.e. multiple buttons of the same type can be selected
        JLabel jLabel = new JLabel();
        jLabel.setText("Separate Entities..Multiple checkboxes can be selected...");

        JCheckBox jCheckBox1 = new JCheckBox("check box 1",false);
        JCheckBox jCheckBox2 = new JCheckBox("check box 2",true);
        JCheckBox jCheckBox3 = new JCheckBox("check box 3",/*new ImageIcon("D:\\dog_icon.png")*/false);

        add(jLabel);
        add(jCheckBox1);
        add(jCheckBox2);
        add(jCheckBox3);

        //creates a set of mutually exclusive buttons...
        //i.e. only one button can be selected out of the set
        jLabel = new JLabel();
        jLabel.setText("Mutually exclusive set of checkboxes...Only one checkboxes can be selected...");

        JCheckBox jCheckBox4 = new JCheckBox("check box 1",false);
        JCheckBox jCheckBox5 = new JCheckBox("check box 2",true);
        JCheckBox jCheckBox6 = new JCheckBox("check box 3",/*new ImageIcon("D:\\dog_icon.png")*/false);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(jCheckBox4);
        buttonGroup.add(jCheckBox5);
        buttonGroup.add(jCheckBox6);

        add(jLabel);
        add(jCheckBox4);
        add(jCheckBox5);
        add(jCheckBox6);

        setVisible(true); //shows all the components
    }
}
