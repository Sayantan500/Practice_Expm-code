package SwingDemo;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import java.awt.color.ColorSpace;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Scanner;

public class swing_list_demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        System.out.println("Enter string : ");
        String s;
        while(true){
            s = scanner.nextLine();
            if (s.compareToIgnoreCase("`") == 0)
                break;
            names.add(s);
        }
        new swing_list_demo(names.toArray());
    }

    public swing_list_demo(Object[] names) {
        JFrame jFrame = new JFrame("Swing List Demo");
        jFrame.setSize(400, 300);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.getContentPane().setBackground(Color.CYAN); //set background of JFrame with solid colors.
        jFrame.setLayout(new GridLayout(2, 0));

        JLabel l = new JLabel("Selection range shown here");

        JList<String> jList = new JList(names);
        jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jList.setFixedCellHeight(15);
        jList.setFixedCellWidth(20);

        JScrollPane jScrollPane = new JScrollPane(jList);
        jFrame.add(jScrollPane);
        jFrame.add(l);
        jList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int st = 0, end = 0;
                if (e.getSource() == jList) {
                    st = jList.getSelectedIndex();
                    end = jList.getMaxSelectionIndex();
                    l.setText("Range selected : " + st + " to " + end);
                }
            }
        });

        jList.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("[Mouse event] " + e);
                if (e.getClickCount() == 2) {
                    l.setText("mouse clicked " + jList.getSelectedValue());
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        jFrame.setVisible(true);
    }
}