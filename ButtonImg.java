import javax.swing.*;
import java.awt.*;

public class ButtonImg {
    public static void main(String[] args){

        JFrame frm = new JFrame();
        frm.setLayout(null);
        frm.setSize(500,500);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p1 = new JPanel();
        frm.add(p1);
        p1.setBounds(0,0,500,500);
        p1.setBackground(Color.BLACK);

        ImageIcon img = new ImageIcon("Images/ButtonImg.png");
        JButton btn = new JButton(img);
        p1.add(btn);
        btn.setBounds(100,100,100,100);
        frm.setVisible(true);
    }
}
