import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Test11 {
    public static void main(String[] args) {
        JFrame frm =new JFrame();
        frm.setSize(500, 500);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setLayout(null);

        JPanel p1 = new JPanel();
        frm.add(p1);
        p1.setBounds(0,0,500,500);
        p1.setBackground(Color.BLACK);

        JLabel l1 = new JLabel("Test");
        l1.setForeground(Color.white);
        p1.add(l1);
        p1.setLayout(null);
        l1.setBounds(200,200,100,100);

        frm.setVisible(true);
    }
}
