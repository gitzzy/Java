import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Dai {
    public static void main(String[] args){

        JFrame frm = new JFrame();
        frm.setSize(500,500);
        frm.setLayout(null);

        JDialog d1 = new JDialog(frm,"Dailog",true);
        d1.setSize(300,300);
        JLabel l1 = new JLabel("Devansh");
        d1.setLayout(null);
        d1.add(l1);
        l1.setBounds(0,0,100,100);

        frm.setVisible(true);
    
    }
}
