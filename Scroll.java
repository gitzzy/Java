import java.util.jar.Attributes.Name;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

public class Scroll {
    public static void main(String[] args){

        JFrame frm = new JFrame();
        frm.setSize(500,800);
        frm.setLayout(null);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JScrollPane p1 = new JScrollPane();
        frm.add(p1);
        p1.setBounds(100,100,200,200);
        p1.setLayout(null);
        JLabel l1 = new JLabel("Devansh");
        p1.add(l1);
        l1.setBounds(50,50,100,50);

        JScrollBar b1  = new JScrollBar();
        frm.add(b1);
        b1.setBounds(300,100,10,200);

        frm.setVisible(true);
    }
}
