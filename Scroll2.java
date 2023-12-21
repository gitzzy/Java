import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class Scroll2 {
    public static void main(String[] args){

        JFrame frm = new JFrame();
        frm.setSize(500,500);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setLayout(null);
        JScrollPane p1 = new JScrollPane();
        p1.setLayout(null);
        frm.add(p1);
        p1.setBounds(100,100,200,200);
        ImageIcon img = new ImageIcon("Images/ButtonImg.png");
        JLabel l1 = new JLabel(img);
        p1.add(l1);
        l1.setBounds(0,0,300,300);
        
        frm.setVisible(true);
        
    }
}
