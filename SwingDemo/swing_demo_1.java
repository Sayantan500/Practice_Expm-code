package SwingDemo;

import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.*;
import java.lang.reflect.InvocationTargetException;

public class swing_demo_1 
{
    public static void main(String[] args) throws InterruptedException, InvocationTargetException
    {
        System.out.println("This is the main thread before invokeAndWait...");
        SwingUtilities.invokeAndWait(() -> {
            System.out.println("This is the runnable run method...");
            new swing_1("Swing Application","This is the first application",3747848L);
        });
        System.out.println("Returned to main thread...");

        System.out.println("\nThis is the main thread before invokeLater...");
        SwingUtilities.invokeLater(() -> {
            System.out.println("This is the runnable run method...");
            new swing_1("Swing Application","This is the first application",3747848L);
        });
        System.out.println("Returned to main thread...");
    }
}

class swing_1
{
    public swing_1(String title,String text,long num)
    {
        JFrame jFrame = new JFrame(title);
        jFrame.setSize(630,400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jLabel = new JLabel();
        if(text.compareToIgnoreCase("")==0)
            jLabel.setText(String.valueOf(num));
        else
            jLabel.setText(text+" "+num);
        jLabel.setVerticalAlignment(SwingConstants.BOTTOM);
        jFrame.add(jLabel);

        jFrame.setVisible(true);
    }
}