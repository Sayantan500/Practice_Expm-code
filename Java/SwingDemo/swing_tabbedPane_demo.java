package SwingDemo;

import javax.swing.*;
import java.awt.*;

public class swing_tabbedPane_demo extends JFrame
{
    public static void main(String[] args) {
        new swing_tabbedPane_demo();
    }

    public swing_tabbedPane_demo()
    {
        setTitle("Swing Tabbed Pane Demo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,250);

        JTabbedPane jTabbedPane = new JTabbedPane(SwingConstants.BOTTOM);
        jTabbedPane.addTab("Tab 1",new tab1_content());
        jTabbedPane.addTab("Tab 2",new JCheckBox("checkbox 1"));
        //jTabbedPane.addTab("Tab 3",new JButton("Button 3"));


        add(jTabbedPane);
        setVisible(true);
    }
}

class tab1_content extends JPanel
{
    public tab1_content()
    {
        JRadioButton r1 = new JRadioButton("radio 1");
        JRadioButton r2 = new JRadioButton("radio 2");
        JRadioButton r3 = new JRadioButton("radio 3");

        setLayout(new GridLayout(2,0));
        add(r1);
        add(r2);
        add(r3);
    }
}