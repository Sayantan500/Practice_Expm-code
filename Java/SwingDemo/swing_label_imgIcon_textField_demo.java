package SwingDemo;

import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swing_label_imgIcon_textField_demo extends JFrame
{
    public swing_label_imgIcon_textField_demo()
    {
        setSize(350,250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Label ImageIcon TextField Demo");

        /*
         * in grid layout if no.of rows are set to non-zero,
         * then the no.of cols does not affect the layout...
         * as no.of cols are calculated from the no. of rows and no. of elements to render
         */
        GridLayout gridLayout = new GridLayout(2,1);
        setLayout(gridLayout);

        ImageIcon imageIcon = new ImageIcon("D:\\dog_icon.png");
        JLabel jLabel = new JLabel("Dog Icon",imageIcon,SwingConstants.LEFT);//text follows the image
        add(jLabel);

        JLabel jLabel_textField = new JLabel();
        JTextField jTextField = new JTextField(5);
        //JTextField jTextField1 = new JTextField(10);
        jTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("TextField : Enter pressed");
                jLabel_textField.setText(jTextField.getText());
            }
        });
        jTextField.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                int st,end;
                st = e.getMark();   end = e.getDot();
                if(st<=end)
                    System.out.printf("portion selected : %d to %d\n",st,end);
                else
                    System.out.printf("~portion selected : %d to %d\n",end,st);
                System.out.println("No.of characters selected : " + Math.abs(st-end));
            }
        });
        add(jTextField);
        //add(jTextField1);
        add(jLabel_textField);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new swing_label_imgIcon_textField_demo());
    }
}
